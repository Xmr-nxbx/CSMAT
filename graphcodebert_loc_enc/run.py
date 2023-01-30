# coding=utf-8
# Copyright 2018 The Google AI Language Team Authors and The HuggingFace Inc. team.
# Copyright (c) 2018, NVIDIA CORPORATION.  All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""
Fine-tuning the library models for language modeling on a text file (GPT, GPT-2, BERT, RoBERTa).
GPT and GPT-2 are fine-tuned using a causal language modeling (CLM) loss while BERT and RoBERTa are fine-tuned
using a masked language modeling (MLM) loss.
"""

from __future__ import absolute_import

import os
import sys
import pickle
import torch
import json
import random
import logging
import argparse
import numpy as np
from io import open
from itertools import cycle
import torch.nn as nn
from model import Seq2Seq
from tqdm import tqdm, trange
from bleu import _bleu
import scipy.linalg
from torch.nn import functional as F
from torch.utils.data import DataLoader, Dataset, SequentialSampler, RandomSampler, TensorDataset
from torch.utils.data.distributed import DistributedSampler
from transformers import (WEIGHTS_NAME, AdamW, get_linear_schedule_with_warmup,
                          RobertaConfig, RobertaModel, RobertaTokenizer)
MODEL_CLASSES = {'roberta': (RobertaConfig, RobertaModel, RobertaTokenizer)}

logging.basicConfig(format='%(asctime)s - %(levelname)s - %(name)s -   %(message)s',
                    datefmt='%m/%d/%Y %H:%M:%S',
                    level=logging.INFO)

logger = logging.getLogger(__name__)


class MyDataSet(Dataset):
    def __init__(self, path, source_lang, target_lang, tokenizer, status="test", args=None):
        super().__init__()
        self.source_lang = source_lang
        self.target_lang = target_lang
        self.tokenizer = tokenizer
        self.status = status
        import json
        with open(os.path.join(path, status+'.json'), 'r', encoding='utf-8') as f:
            data = json.load(f)
        self.source = [self.gen_text_id(
            self.format_text_style(each), args.max_source_length) for each in data[source_lang]]
        self.target = [self.gen_text_id(
            self.format_text_style(each), args.max_target_length) for each in data[target_lang]]

    def __len__(self):
        return len(self.source)

    def format_text_style(self, text):
        str_arr = [each.strip() for each in text.strip().split('\r\n')]
        return str_arr

    def gen_text_id(self, text_arr, max_len):
        text_toks = []
        for each in text_arr:
            text_toks.append("<LOC>")
            text_toks.extend(self.tokenizer.tokenize(each))

        toks = [self.tokenizer.cls_token]
        toks += text_toks[:max_len-2]
        toks += [self.tokenizer.sep_token]
        ids = self.tokenizer.convert_tokens_to_ids(toks)
        ids += [self.tokenizer.pad_token_id] * (max_len - len(ids))
        return ids

    def __getitem__(self, index):
        src_ids = self.source[index]
        tgt_ids = self.target[index]

        return [torch.tensor(src_ids), torch.tensor(tgt_ids)]


def tokenizer_decode_ids(tokenizer, ids):
    token_ids = []
    loc_id = tokenizer.convert_tokens_to_ids(["<LOC>"])[0]
    special_tok_ids = tokenizer.all_special_ids + [loc_id]
    result = []

    for each in ids:
        if each == loc_id:
            if len(token_ids) != 0:
                result.append(tokenizer.decode(token_ids))
                token_ids.clear()
        elif each not in special_tok_ids:
            token_ids.append(each)

    if len(token_ids) != 0:
        result.append(tokenizer.decode(token_ids))

    return " ".join(result)


def set_seed(seed=42):
    random.seed(seed)
    os.environ['PYHTONHASHSEED'] = str(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)
    torch.cuda.manual_seed(seed)
    torch.backends.cudnn.deterministic = True


def main():
    # region 获取程序初始化参数

    parser = argparse.ArgumentParser()

    # Required parameters
    parser.add_argument("--output_dir", default="model", type=str,
                        help="The output directory where the model predictions and checkpoints will be written.")
    parser.add_argument("--model_name", default="microsoft/codebert-base", type=str,
                        help="The output directory where the model predictions and checkpoints will be written.")
    parser.add_argument("--load_model_path", default=None, type=str,
                        help="Path to trained model: Should contain the .bin files")
    # Other parameters
    parser.add_argument("--train_path", default="./dataset", type=str,
                        help="The train path. Should contain the train.json for this task.")
    parser.add_argument("--dev_path", default="./dataset", type=str,
                        help="The dev path. Should contain the valid.json for this task.")
    parser.add_argument("--test_path", default="./dataset", type=str,
                        help="The test path. Should contain the test.json for this task.")

    parser.add_argument("--source_lang", default='java', type=str,
                        help="The language of input (java, cs)")
    parser.add_argument("--target_lang", default='cs', type=str,
                        help="The language of target (cs, java)")
    # parser.add_argument("--hidden_size", default=768, type=int,
    #                     help="hidden size")
    # parser.add_argument("--num_layers", default=6, type=int,
    #                     help="number of transformer layers")
    # parser.add_argument("--num_attention_heads", default=12, type=int,
    #                     help="transformer attention heads")
    # parser.add_argument("--feed_forward_dense", default=3072, type=int,
    #                     help="feed forward dense hidden size")
    # parser.add_argument("--tokenizer_path", default="./tokenizer", type=str,
    #                     help="path to tokenizer")
    parser.add_argument("--max_source_length", default=200, type=int,
                        help="The maximum total source sequence length after tokenization. Sequences longer "
                             "than this will be truncated, sequences shorter will be padded.")
    parser.add_argument("--max_target_length", default=200, type=int,
                        help="The maximum total target sequence length after tokenization. Sequences longer "
                             "than this will be truncated, sequences shorter will be padded.")

    parser.add_argument("--do_train", action='store_true',
                        help="Whether to run training.")
    parser.add_argument("--do_eval", action='store_true',
                        help="Whether to run eval on the dev set.")
    parser.add_argument("--do_test", action='store_true',
                        help="Whether to run eval on the dev set.")

    parser.add_argument("--train_batch_size", default=4, type=int,
                        help="Batch size per GPU/CPU for training.")
    parser.add_argument("--eval_batch_size", default=1, type=int,
                        help="Batch size per GPU/CPU for evaluation.")
    parser.add_argument('--gradient_accumulation_steps', type=int, default=1,
                        help="Number of updates steps to accumulate before performing a backward/update pass.")
    parser.add_argument("--learning_rate", default=5e-5, type=float,
                        help="The initial learning rate for Adam.")
    parser.add_argument("--beam_size", default=5, type=int,
                        help="beam size for beam search")
    parser.add_argument("--weight_decay", default=0.0, type=float,
                        help="Weight deay if we apply some.")
    parser.add_argument("--adam_epsilon", default=1e-8, type=float,
                        help="Epsilon for Adam optimizer.")
    parser.add_argument("--max_grad_norm", default=1.0, type=float,
                        help="Max gradient norm.")
    parser.add_argument("--num_train_epochs", default=20, type=int,
                        help="Total number of training epochs to perform.")
    parser.add_argument("--max_steps", default=-1, type=int,
                        help="If > 0: set total number of training steps to perform. Override num_train_epochs.")
    parser.add_argument("--eval_steps", default=-1, type=int,
                        help="")
    parser.add_argument("--train_steps", default=-1, type=int,
                        help="")
    parser.add_argument("--warmup_steps", default=0, type=int,
                        help="Linear warmup over warmup_steps.")
    parser.add_argument('--seed', type=int, default=42,
                        help="random seed for initialization")
    # print arguments
    args = parser.parse_args()
    logger.info(args)

    # endregion 获取程序初始化参数

    # Setup CUDA, GPU
    device_type = "cuda" if torch.cuda.is_available() else "cpu"
    device = torch.device(device_type)
    args.n_gpu = torch.cuda.device_count()
    args.device = device

    # Set seed
    set_seed(args.seed)

    args.output_dir = os.path.join(
        args.output_dir, "%s2%s" % (args.source_lang, args.target_lang))

    # make dir if output_dir not exist
    if os.path.exists(args.output_dir) is False:
        os.makedirs(args.output_dir)

    # tokenizer = RobertaTokenizer.from_pretrained(args.tokenizer_path)
    model_config = args.model_name
    if model_config == "microsoft/codebert-base":
        model_config = "roberta-base"
    tokenizer = RobertaTokenizer.from_pretrained(model_config)
    tokenizer.add_tokens(['<LOC>'])

    # token setting
    args.max_length = args.max_target_length
    args.pad_id = tokenizer.pad_token_id
    args.sos_id = tokenizer.cls_token_id
    args.eos_id = tokenizer.sep_token_id
    args.loc_id = tokenizer.convert_tokens_to_ids(["<LOC>"])[0]

    # build model
    # encoder_layer = nn.TransformerEncoderLayer(
    #     d_model=args.hidden_size, nhead=args.num_attention_heads, dim_feedforward=args.feed_forward_dense, activation=F.gelu)
    # encoder = nn.TransformerEncoder(encoder_layer, num_layers=args.num_layers)
    config = RobertaConfig.from_pretrained(model_config)

    # budild model
    encoder = RobertaModel.from_pretrained(
        args.model_name, config=config)
    encoder.resize_token_embeddings(len(tokenizer))
    decoder_layer = nn.TransformerDecoderLayer(
        d_model=config.hidden_size, nhead=config.num_attention_heads)
    decoder = nn.TransformerDecoder(
        decoder_layer, num_layers=config.num_hidden_layers)
    model = Seq2Seq(encoder=encoder, decoder=decoder,
                    hidden_size=config.hidden_size, vocab_size=len(tokenizer), config=config, args=args)

    checkpoint_num = 0
    checkpoint_path = "" if args.output_dir is None else os.path.join(
        args.output_dir, "checkpoint_num.txt")
    if args.load_model_path is not None:
        logger.info("reload model from {}".format(args.load_model_path))
        model.load_state_dict(torch.load(os.path.join(
            args.load_model_path, "pytorch_model.bin")))
        if len(checkpoint_path) != 0 and os.path.exists(checkpoint_path):
            with open(checkpoint_path, "r") as f:
                checkpoint_num = int(f.read())

    model.to(device)
    if args.n_gpu > 1:
        # multi-gpu training
        model = torch.nn.DataParallel(model)

    def create_block_diagonal_matrix_and_loc_mask(ids, loc_id, sos_id, eos_id, pad_id):
        result = []
        for i in range(len(ids)):
            loc_mask = ids[i] == loc_id
            sos_mask = ids[i] == sos_id
            eos_mask = ids[i] == eos_id
            pad_mask = ids[i] == pad_id
            loc_places = np.where(loc_mask)
            sos_place = np.where(sos_mask)
            eos_place = np.where(eos_mask)
            matrix_index_places = np.insert(
                np.append(loc_places, eos_place), 0, sos_place)
            matrix_index_places = np.insert(
                np.append(loc_places, len(ids[i])), 0, 0)
            matrixs = []
            for j in range(1, len(matrix_index_places)):
                shape = matrix_index_places[j] - matrix_index_places[j - 1]
                if shape == 0:
                    continue
                matrixs.append(np.ones([shape, shape], dtype=np.int16))
            matrixs = scipy.linalg.block_diag(*matrixs)

            def broadcast_fn(mask, fn):
                a = mask[:, np.newaxis]
                b = mask[np.newaxis, :]
                return fn(a, b)

            sos_eos_mask = np.maximum(sos_mask, eos_mask)
            sos_eos_map = broadcast_fn(sos_eos_mask, np.logical_or)
            loc_map = broadcast_fn(loc_mask, np.logical_and)
            pad_map = broadcast_fn(pad_mask, np.logical_or)
            ans = np.logical_or(sos_eos_map, loc_map).astype(np.int16)
            ans = np.maximum(matrixs, ans)
            ans = ans & np.logical_not(pad_map).astype(np.int16)
            result.append(ans)
        return np.array(result)

    def collate_fn(batch):
        # from torch.nn.utils.rnn import pad_sequence
        src_batch_ids, tgt_batch_ids = [], []
        for src_ids, tgt_ids in batch:
            src_batch_ids.append(src_ids)
            tgt_batch_ids.append(tgt_ids)
        # src_batch_ids = pad_sequence(
        #     src_batch_ids, batch_first=True, padding_value=tokenizer.pad_token_id)
        # tgt_batch_ids = pad_sequence(
        #     tgt_batch_ids, batch_first=True, padding_value=tokenizer.pad_token_id)
        src_batch_ids = torch.stack(src_batch_ids, 0)
        tgt_batch_ids = torch.stack(tgt_batch_ids, 0)
        src_batch_mask = src_batch_ids.eq(tokenizer.pad_token_id)
        tgt_batch_mask = tgt_batch_ids.eq(tokenizer.pad_token_id)
        src_batch_masks = create_block_diagonal_matrix_and_loc_mask(
            src_batch_ids.numpy(), args.loc_id, args.sos_id, args.eos_id, args.pad_id)
        src_batch_masks = torch.from_numpy(src_batch_masks)
        return [src_batch_ids, src_batch_mask, src_batch_masks, tgt_batch_ids, tgt_batch_mask]

    if args.do_train:
        # Prepare training data loader
        train_data = MyDataSet(
            args.train_path, args.source_lang, args.target_lang, tokenizer, status='train', args=args)
        train_sampler = RandomSampler(train_data)
        train_dataloader = DataLoader(train_data, sampler=train_sampler, batch_size=args.train_batch_size //
                                      args.gradient_accumulation_steps, num_workers=4, collate_fn=collate_fn)

        num_train_optimization_steps = args.train_steps

        # Prepare optimizer and schedule (linear warmup and decay)
        no_decay = ['bias', 'LayerNorm.weight']
        optimizer_grouped_parameters = [
            {'params': [p for n, p in model.named_parameters() if not any(nd in n for nd in no_decay)],
             'weight_decay': args.weight_decay},
            {'params': [p for n, p in model.named_parameters() if any(
                nd in n for nd in no_decay)], 'weight_decay': 0.0}
        ]

        optimizer = AdamW(optimizer_grouped_parameters,
                          lr=args.learning_rate, eps=args.adam_epsilon)

        scheduler = get_linear_schedule_with_warmup(
            optimizer,
            num_warmup_steps=len(train_dataloader)*args.num_train_epochs*0.1,
            num_training_steps=len(train_dataloader)*args.num_train_epochs
        )

        if args.load_model_path is not None:
            optimizer.load_state_dict(torch.load(
                os.path.join(args.load_model_path, "optimizer.bin")))
            scheduler.load_state_dict(torch.load(
                os.path.join(args.load_model_path, "scheduler.bin")))

        # if device_type == "cuda":
        #     scaler = torch.cuda.amp.GradScaler()
        #     autocast = torch.cuda.amp.autocast
        # else:
        #     autocast = torch.cpu.amp.autocast

        # Start training
        logger.info("***** Running training *****")
        logger.info("  Inital epoch number = %d", checkpoint_num)
        logger.info("  Dataset length = %d", len(train_data))
        logger.info("  Batch size = %d", args.train_batch_size)
        logger.info("  Num epoch = %d", args.num_train_epochs)

        model.train()
        dev_dataset = {}
        nb_tr_examples, nb_tr_steps, tr_loss, global_step, best_loss = 0, 0, 0, 0, 1e6
        for epoch in range(checkpoint_num, args.num_train_epochs):
            bar = tqdm(train_dataloader, total=len(train_dataloader), ncols=80)
            for batch in bar:
                src_batch_ids, src_batch_mask, src_batch_masks, tgt_batch_ids, tgt_batch_mask = [
                    t.to(device) for t in batch]
                # with autocast():
                loss, _, _ = model(source_ids=src_batch_ids,
                                   source_mask=src_batch_mask,
                                   source_attn_mask=src_batch_masks,
                                   target_ids=tgt_batch_ids,
                                   target_mask=tgt_batch_mask)

                if args.n_gpu > 1:
                    loss = loss.mean()  # mean() to average on multi-gpu.
                if args.gradient_accumulation_steps > 1:
                    loss = loss / args.gradient_accumulation_steps

                tr_loss += loss.item()
                train_loss = round(
                    tr_loss*args.gradient_accumulation_steps/(nb_tr_steps+1), 4)
                bar.set_description(
                    "epoch %d loss %.4f" % (epoch, train_loss))
                nb_tr_examples += src_batch_ids.size(0)
                nb_tr_steps += 1

                # if device_type == "cuda":
                #     scaler.scale(loss).backward()
                # else:
                loss.backward()

                if (nb_tr_steps + 1) % args.gradient_accumulation_steps == 0:
                    # Update parameters
                    # if device_type == "cuda":
                    #     scaler.step(optimizer)
                    #     scaler.update()
                    # else:
                    optimizer.step()
                    optimizer.zero_grad()
                    scheduler.step()
                    global_step += 1

            if args.do_eval and epoch in [int(args.num_train_epochs*(i+1)//20) for i in range(20)]:
                # Eval model with dev dataset
                nb_tr_examples, nb_tr_steps, tr_loss = 0, 0, 0
                eval_flag = False
                if 'dev_loss' in dev_dataset:
                    eval_data = dev_dataset['dev_loss']
                else:
                    eval_data = MyDataSet(
                        args.dev_path, args.source_lang, args.target_lang, tokenizer, status='valid', args=args)
                    dev_dataset['dev_loss'] = eval_data
                eval_sampler = SequentialSampler(eval_data)
                eval_dataloader = DataLoader(
                    eval_data, sampler=eval_sampler, batch_size=args.eval_batch_size, num_workers=4, collate_fn=collate_fn)

                logger.info("\n***** Running evaluation *****")
                logger.info("  Num examples = %d", len(eval_data))
                logger.info("  Batch size = %d", args.eval_batch_size)

                # Start Evaling model
                # from time import time
                # start = time()
                model.eval()
                eval_loss, tokens_num = 0, 0
                for batch in eval_dataloader:
                    src_batch_ids, src_batch_mask, src_batch_masks, tgt_batch_ids, tgt_batch_mask = [
                        t.to(device) for t in batch]

                    with torch.no_grad():
                        _, token_loss, token_num = model(source_ids=src_batch_ids,
                                                         source_mask=src_batch_mask,
                                                         source_attn_mask=src_batch_masks,
                                                         target_ids=tgt_batch_ids,
                                                         target_mask=tgt_batch_mask)
                    eval_loss += token_loss.sum().item()
                    tokens_num += token_num.sum().item()
                # Pring loss of dev dataset
                model.train()
                eval_loss = eval_loss / tokens_num
                result = {'eval_ppl': round(np.exp(eval_loss), 5),
                          'global_step': global_step+1,
                          'train_loss': round(train_loss, 5)}
                for key in sorted(result.keys()):
                    logger.info("  %s = %s", key, str(result[key]))
                logger.info("  "+"*"*20)
                # print(time()-start)
                # exit(0)

                # save last checkpoint
                last_output_dir = os.path.join(
                    args.output_dir, 'checkpoint-last')
                if not os.path.exists(last_output_dir):
                    os.makedirs(last_output_dir)
                model_to_save = model.module if hasattr(
                    model, 'module') else model  # Only save the model it-self
                torch.save(model_to_save.state_dict(), os.path.join(
                    last_output_dir, "pytorch_model.bin"))
                torch.save(optimizer.state_dict(), os.path.join(
                    last_output_dir, "optimizer.bin"))
                torch.save(scheduler.state_dict(), os.path.join(
                    last_output_dir, "scheduler.bin"))
                if len(checkpoint_path) != 0:
                    with open(checkpoint_path, "w") as f:
                        f.write(str(epoch+1))

                if eval_loss < best_loss:
                    logger.info("  Best ppl:%s", round(np.exp(eval_loss), 5))
                    logger.info("  "+"*"*20)
                    best_loss = eval_loss
                    # Save best checkpoint for best ppl
                    best_output_dir = os.path.join(
                        args.output_dir, 'checkpoint-best-ppl')
                    if not os.path.exists(best_output_dir):
                        os.makedirs(best_output_dir)
                    model_to_save = model.module if hasattr(
                        model, 'module') else model  # Only save the model it-self
                    torch.save(model_to_save.state_dict(), os.path.join(
                        best_output_dir, "pytorch_model.bin"))

    if args.do_test:
        paths = []
        # if args.dev_path is not None:
        #     files.append(args.dev_path)
        if args.test_path is not None:
            paths.append(args.test_path)
        for idx, test_path in enumerate(paths):
            logger.info("Test path: {}".format(test_path))
            # eval_examples = read_examples(file)
            # eval_features = convert_examples_to_features(eval_examples, tokenizer, args,stage='test')
            # eval_data = TextDataset(eval_features,args)
            eval_data = MyDataSet(
                test_path, args.source_lang, args.target_lang, tokenizer, status='test', args=args)

            eval_sampler = SequentialSampler(eval_data)
            eval_dataloader = DataLoader(
                eval_data, sampler=eval_sampler, batch_size=args.eval_batch_size, num_workers=4, collate_fn=collate_fn)

            model.eval()
            p = []
            for batch in tqdm(eval_dataloader, total=len(eval_dataloader), ncols=80):
                # batch = tuple(t.to(device) for t in batch)
                src_batch_ids, src_batch_mask, src_batch_masks, _, _ = batch
                src_batch_ids = src_batch_ids.to(device)
                src_batch_mask = src_batch_mask.to(device)
                src_batch_masks = src_batch_masks.to(device)
                with torch.no_grad():
                    preds = model(source_ids=src_batch_ids,
                                  source_mask=src_batch_mask,
                                  source_attn_mask=src_batch_masks)
                    for pred in preds:
                        for i in range(len(pred)):
                            t = pred[i].cpu().numpy()
                            t = list(t)
                            if args.eos_id in t:
                                t = t[:t.index(args.eos_id)]
                            # text = tokenizer.decode(t,clean_up_tokenization_spaces=False)
                            text = tokenizer_decode_ids(tokenizer, t)
                            if len(text) != 0:
                                break
                        p.append(text)

            model.train()
            with open(os.path.join(args.output_dir, 'output.%s' % args.target_lang), 'w', encoding='utf8') as f:
                f.writelines([each + '\n' for each in p])
            logger.info(" %d outputs " % len(p))
            logger.info(" program translation finished ")
            # predictions=[]
            # accs=[]
            # with open(os.path.join(args.output_dir,"test_{}.output".format(str(idx))),'w') as f, open(os.path.join(args.output_dir,"test_{}.gold".format(str(idx))),'w') as f1:
            #     for ref,gold in zip(p,eval_examples):
            #         predictions.append(ref)
            #         f.write(ref+'\n')
            #         f1.write(gold.target+'\n')
            #         accs.append(ref==gold.target)
            # dev_bleu=round(_bleu(os.path.join(args.output_dir, "test_{}.gold".format(str(idx))).format(file),
            #                      os.path.join(args.output_dir, "test_{}.output".format(str(idx))).format(file)),2)
            # logger.info("  %s = %s "%("bleu-4",str(dev_bleu)))
            # logger.info("  %s = %s "%("xMatch",str(round(np.mean(accs)*100,4))))
            # logger.info("  "+"*"*20)


if __name__ == "__main__":
    main()

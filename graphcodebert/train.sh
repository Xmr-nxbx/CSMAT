epoch=20
train_batch_size=16
eval_batch_size=16
gradient_accum=2
max_len=320
java2cs_path=model/java2cs/checkpoint-best-ppl
model_name=microsoft/graphcodebert-base
# train java2cs
python run.py \
  --source_lang java \
  --target_lang cs \
  --model_name=$model_name \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --train_batch_size $train_batch_size \
  --eval_batch_size $eval_batch_size \
  --gradient_accumulation_steps $gradient_accum \
  --do_train \
  --do_eval \
  --num_train_epochs $epoch

# test java2cs
python run.py \
  --source_lang java \
  --target_lang cs \
  --model_name=$model_name \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --eval_batch_size $eval_batch_size \
  --do_test \
  --load_model_path $java2cs_path

cs2java_path=model/cs2java/checkpoint-best-ppl
# train cs2java
python run.py \
  --source_lang cs \
  --target_lang java \
  --model_name=$model_name \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --train_batch_size $train_batch_size \
  --eval_batch_size $eval_batch_size \
  --gradient_accumulation_steps $gradient_accum \
  --do_train \
  --do_eval \
  --num_train_epochs $epoch

# test cs2java
python run.py \
  --source_lang cs \
  --target_lang java \
  --model_name=$model_name \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --eval_batch_size $eval_batch_size \
  --do_test \
  --load_model_path $cs2java_path
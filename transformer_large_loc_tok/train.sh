epoch=10
batch_size=16
eval_batch_size=16
gradient_accum=2
max_len=320
hidden_size=768
num_layers=12
num_attention_heads=12
feed_forward_dense=3072
java2cs_path=model/java2cs/checkpoint-best-ppl
# train java2cs
python run.py \
  --source_lang java \
  --target_lang cs \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --train_batch_size $batch_size \
  --eval_batch_size $eval_batch_size \
  --hidden_size $hidden_size \
  --num_layers $num_layers \
  --num_attention_heads $num_attention_heads \
  --feed_forward_dense $feed_forward_dense \
  --gradient_accumulation_steps $gradient_accum \
  --do_train \
  --do_eval \
  --num_train_epochs $epoch

# test java2cs
python run.py \
  --source_lang java \
  --target_lang cs \
  --max_source_length $max_len \
  --max_target_length $max_len \
  --eval_batch_size $eval_batch_size \
  --hidden_size $hidden_size \
  --num_layers $num_layers \
  --num_attention_heads $num_attention_heads \
  --feed_forward_dense $feed_forward_dense \
  --do_test \
  --load_model_path $java2cs_path

cs2java_path=model/cs2java/checkpoint-best-ppl
# train cs2java
python run.py \
  --source_lang cs \
  --target_lang java \
  --train_batch_size $batch_size \
  --eval_batch_size $eval_batch_size \
  --hidden_size $hidden_size \
  --num_layers $num_layers \
  --num_attention_heads $num_attention_heads \
  --feed_forward_dense $feed_forward_dense \
  --gradient_accumulation_steps $gradient_accum \
  --do_train \
  --do_eval \
  --num_train_epochs $epoch

# test java2cs
python run.py \
  --source_lang cs \
  --target_lang java \
  --eval_batch_size $eval_batch_size \
  --hidden_size $hidden_size \
  --num_layers $num_layers \
  --num_attention_heads $num_attention_heads \
  --feed_forward_dense $feed_forward_dense \
  --do_test \
  --load_model_path $cs2java_path
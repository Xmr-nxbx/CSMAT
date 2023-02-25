# 基于代码语句掩码注意力机制的源代码迁移模型

本研究提出了CSMAT（Code-Statement Masked Attention Transformer）。

本项目的运行环境：
```
python 3.9
pytorch 1.13.1
transformers 4.25.1
tree-sitter 0.20.1
scipy 1.9.3
```
其中tree-sitter用于验证词法正确率，需要参考[python tree-sitter教程](https://github.com/tree-sitter/py-tree-sitter)生成`my-languages.so`文件

目前项目内容仍在调整中

本项目给出了以下模型的代码和结果： 

## 测试集参考代码

测试集参考代码见 `references` 文件夹：
- c#：output.cs
- java: output.java

## 实验模型

| 文件夹名称                         | 模型名称                                    |
| ---------------------------------- | ------------------------------------------- |
| transformer_large                  | Transformer                                 |
| transformer_large_loc_tok          | LOC-Transformer                             |
| transformer_large_loc_enc          | LOC-Transformer<sub>enc</sub>               |
| transformer_large_loc_enc_qua_dec  | LOC-transformer<sub>enc-1/4dec</sub>        |
| transformer_large_loc_enc_half_dec | CSMAT(LOC-transformer<sub>enc-1/2dec</sub>) |
| transformer_large_loc_enc_3qua_dec | LOC-transformer<sub>enc-3/4dec</sub>        |

## 改进模型
| 文件夹名称                     | 模型名称                               |
| ------------------------------ | -------------------------------------- |
| codebert                       | CodeBERT                               |
| codebert_loc_enc               | LOC-CodeBERT<sub>enc</sub>             |
| codebert_loc_enc_half_dec      | LOC-CodeBERT<sub>enc-1/2dec</sub>      |
| graphcodebert                  | GraphCodeBERT                          |
| graphcodebert_loc_enc          | LOC-GraphCodeBERT<sub>enc</sub>        |
| graphcodebert_loc_enc_half_dec | LOC-GraphCodeBERT<sub>enc-1/2dec</sub> |

## 模型项目的内容

| 文件/文件夹 | 简介                                        |
| ----------- | ------------------------------------------- |
| dataset     | 数据集（train.json, valid.json, test.json） |
| model       | 保存的模型以及输出结果                      |
| tokenizer   | 引入`<loc>`词符的Roberta分词器              |
| model.py    | 模型文件                                    |
| run.py      | 执行文件                                    |
| train.sh    | shell脚本                                   |

若需自定义并运行项目，修改train.sh脚本中的模型参数后，运行即可

## 参考代码（用于验证模型输出）

需要注意的是，[Astyle](https://astyle.sourceforge.net/)工具格式化代码后和源代码存在空格符格式上的差异。  
为了统一输出，`references`给出了参考代码，用于评估结果。  

## 评估指标
BLEU、完全匹配率（EM）、CodeBLEU见[CodeTrans项目](https://github.com/microsoft/CodeXGLUE/tree/main/Code-Code/code-to-code-trans)，词法正确率见`detect_problem_output.py`参考代码。

## 实验结果（非预训练模型）
### java -> c#
| 模型                                        | BLEU      | 完全匹配率 | CodeBLEU  | 词法正确率 |
| ------------------------------------------- | --------- | ---------- | --------- | ---------- |
| Naive                                       | 18.54     | 0          | -         | -          |
| Pointer-Generator                           | 26.18     | 13.8       | 43.87     | 48.5       |
| Tree-to-tree                                | 36.34     | 3.4        | 42.13     | 45.6       |
| Transformer                                 | 60.99     | 37.9       | 66.88     | 89.0       |
| LOC-Transformer                             | 60.39     | 37.5       | 66.49     | 88.7       |
| LOC-Transformer<sub>enc</sub>               | 62.53     | 38.8       | **68.42** | 89.2       |
| LOC-Transformer<sub>enc-1/4dec</sub>        | 62.22     | 38.9       | 68.09     | 90.1       |
| CSMAT(LOC-Transformer<sub>enc-1/2dec</sub>) | **62.74** | **39.5**   | 67.82     | **90.2**   |
| LOC-Transformer<sub>enc-3/4dec</sub>        | 61.81     | 38.1       | 67.86     | 90.1       |

### c# -> java
| 模型                                        | BLEU      | 完全匹配率 | CodeBLEU  | 词法正确率 |
| ------------------------------------------- | --------- | ---------- | --------- | ---------- |
| Naive                                       | 18.69     | 0          | -         | -          |
| Pointer-Generator                           | 27.84     | 20.5       | 44.88     | 48.6       |
| Tree-to-tree                                | 32.09     | 4.4        | 43.86     | 65.2       |
| Transformer                                 | 55.41     | 40.6       | 62.20     | 89.2       |
| LOC-Transformer                             | 55.84     | 40.8       | 62.31     | 89.0       |
| LOC-Transformer<sub>enc</sub>               | 58.80     | **42.4**   | 64.64     | 89.3       |
| LOC-Transformer<sub>enc-1/4dec</sub>        | 58.64     | 41.4       | 64.78     | 88.4       |
| CSMAT(LOC-Transformer<sub>enc-1/2dec</sub>) | **59.09** | 41.5       | **65.14** | **89.4**   |
| LOC-Transformer<sub>enc-3/4dec</sub>        | 57.59     | 39.4       | 63.71     | 88.4       |

## 实验结果（预训练模型）
### java -> c#
| 模型                                   | BLEU  | 完全匹配率 | CodeBLEU | 词法正确率 |
| -------------------------------------- | ----- | ---------- | -------- | ---------- |
| CodeBERT                               | 77.55 | 52.7       | 80.69    | 94.7       |
| LOC-CodeBERT<sub>enc</sub>             | 76.73 | 54.2       | 80.22    | 93.5       |
| LOC-CodeBERT<sub>enc-1/2dec</sub>      | 77.46 | 53.2       | 80.51    | 95.4       |
| GraphCodeBERT                          | 78.84 | 55.1       | 81.16    | 94.0       |
| LOC-GraphCodeBERT<sub>enc</sub>        | 78.85 | 55.0       | 81.84    | 85.7       |
| LOC-GraphCodeBERT<sub>enc-1/2dec</sub> | 77.90 | 54.1       | 80.75    | 94.8       |

### c# -> java
| 模型                                   | BLEU  | 完全匹配率 | CodeBLEU | 词法正确率 |
| -------------------------------------- | ----- | ---------- | -------- | ---------- |
| CodeBERT                               | 73.57 | 55.5       | 77.67    | 95.4       |
| LOC-CodeBERT<sub>enc</sub>             | 73.25 | 57.7       | 77.28    | 94.9       |
| LOC-CodeBERT<sub>enc-1/2dec</sub>      | 74.47 | 57.3       | 78.48    | 95.4       |
| GraphCodeBERT                          | 75.25 | 58.3       | 78.42    | 94.4       |
| LOC-GraphCodeBERT<sub>enc</sub>        | 75.83 | 60.0       | 79.58    | 94.9       |
| LOC-GraphCodeBERT<sub>enc-1/2dec</sub> | 73.32 | 57.1       | 77.45    | 94.0       |
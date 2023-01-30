import os
from tree_sitter import Language, Parser


CS_LANGUAGE = Language('my-languages.so', 'c_sharp')
JAVA_LANGUAGE = Language('my-languages.so', 'java')
cs_parser, java_parser = Parser(), Parser()
cs_parser.set_language(CS_LANGUAGE)
java_parser.set_language(JAVA_LANGUAGE)


def has_syntax_error(code, lang):
    query_text = '(ERROR) @error'
    if lang == 'java':
        code = "class A{%s}" % code
        parser = java_parser
        query = JAVA_LANGUAGE.query(query_text)
    else:
        code = "class A{%s}" % code
        parser = cs_parser
        query = CS_LANGUAGE.query(query_text)
    root_node = parser.parse(bytes(code, 'utf8')).root_node
    capture = query.captures(root_node)
    return len(capture) != 0


def detect(arr, lang):
    count = 0
    for each in arr:
        if not has_syntax_error(each, lang):
            count += 1
    return count, len(arr), count / len(arr)


_, dirs, _ = next(os.walk('.'))
for dir in dirs:
    path = os.path.join(dir, "model")
    if os.path.exists(path):
        java_path = os.path.join(path, "cs2java", "output.java")
        with open(java_path) as f:
            lines = f.readlines()
            correct_num, all_num, ratio = detect(lines, 'java')
            print("路径：%s \t 正确数：%d/%d(%f)" %
                  (java_path, correct_num, all_num, ratio))

        cs_path = os.path.join(path, "java2cs", "output.cs")
        with open(cs_path) as f:
            lines = f.readlines()
            correct_num, all_num, ratio = detect(lines, 'cs')
            print("路径：%s \t 正确数：%d/%d(%f)" %
                  (cs_path, correct_num, all_num, ratio))

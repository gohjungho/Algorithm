# 숫자 문자열과 영단어

def solution(s):
    num = ['zero', 'one', 'two', 'three', 'four', 
           'five', 'six', 'seven', 'eight', 'nine']
    
    for index, word in enumerate(num): # 0: 'zero' ... 
        if word in s:
            s = s.replace(word, str(index))
    
    return int(s)
# 20.0 / 100.0 

def change(s):
    result = ''
    for i in range(len(s)):
        if s[i] == ')':
            result += '('
        else: # '('
            result += ')'
    
    return result

def solution(p):
    correct = ''
    
    if p == None: # 빈 문자열인 경우 빈 문자열 반환
        return '""'
    
    i = 0
    while i < len(p):
        if p[i] == ')':
            pls_fix = '' # 수정이 필요한 부분
            cnt = 0
            
            for j in range(i, len(p)):
                pls_fix += p[j]
                cnt += 1
                if pls_fix.count('(') == pls_fix.count(')'):
                    break
                    
            correct += change(pls_fix)
            i += cnt
            
        elif p[i] == '(':
            tmp = ''
            cnt = 0
            
            for j in range(i, len(p)):
                tmp += p[j]
                cnt += 1
                if tmp.count('(') == tmp.count(')'):
                    break
                
            correct += tmp
            i += cnt
    
    return correct
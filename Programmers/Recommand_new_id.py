# 신규 아이디 추천
def solution(new_id):
    new_id = new_id.lower() # 1 step
    
    answer = ''
    for letter in new_id: # 2 step
        if letter.isalnum() or letter in '-_.':
            answer += letter
            
    while '..' in answer: # 3 step
        answer = answer.replace('..', '.')
        
    # 4 step
    if answer[0] == '.':
        if len(answer) >= 2: # 7 step 일부 적용 
            answer = answer[1:]
    if answer[-1] == '.':
        answer = answer[:-1]
    
    if answer == '': # 5 step
        answer = 'a'
        
    if len(answer) >= 16: # 6 step
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer[:-1]
            
    if len(answer) < 3: # 7 step
        answer = answer + answer[-1] * (3 - len(answer))
    
    return answer
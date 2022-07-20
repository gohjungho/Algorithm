# 없는 숫자 더하기

def solution(numbers):
    num = list(range(10))
    answer = list(range(10))
    
    for i in num:
        for j in numbers:
            if j == i:
                answer.remove(j)
                break
                
    answer = sum(answer)
    
    return answer
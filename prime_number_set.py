def solution(n):
    num = set(range(2, n + 1)) # 중복값 삭제. 0과 1은 소수가 아니므로 배제 
    
    for i in range(2, n + 1): 
        if i in num:
            num -= set(range(i + i, n + 1, i)) # 배수가 존재하는 값들을 삭제 
    
    return num

solution(15)
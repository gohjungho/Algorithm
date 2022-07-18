# 소수 만들기

from itertools import combinations # 중복 허용하지 않는 모든 조합

def prime(num): # 소수 판별. 
    if num == 0 or num == 1:
        return False

    else:
        for i in range(2, (num//2)+1): # 판별 범위를 x의 제곱근으로 축소
            if num % i == 0:
                return False

        return True

def solution(nums):
    answer = 0
    cb = list(combinations(nums, 3))
    #print(cb)

    for i in cb:
        if prime(sum(i)): # True이면
            answer += 1

    return answer
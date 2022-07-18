# 폰켓몬
# case 7 이후로 시간초과... 30점 ㅜㅜ 

from itertools import combinations as cb

def solution(nums):
    answer = 0
    
    case = set(cb(nums, len(nums)//2))
    
    for i in case:
        answer = max(answer, len(set(i)))
    
    return answer
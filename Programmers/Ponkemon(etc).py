# 폰켓몬 - 다른 풀이
# for문, 조합, list 사용하지 않아도 됨...  

def solution(nums):
    types = len(set(nums)) # 종류(중복 제거)

    if len(nums) / 2 > types:
        return types
    else:
        return len(nums) / 2
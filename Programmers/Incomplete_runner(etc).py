# 완주하지 못한 선수 - 다른 풀이

# 1. 정렬 후 서로 맞지 않는 사람 찾기

def solution1(participant, completion):
    participant.sort()
    completion.sort()
    for i, j in zip(participant, completion):
        if i != j:
            return i            
    return participant.pop()


# 2. hash 사용
# 매우 빠름..! 

def solution2(participant, completion):
    hash_dict = {}
    sumH = 0
    
    # participant의 dict 만들기
    # participant의 sum(hash) 구하기
    for i in participant:
        hash_dict[hash(i)] = i
        sumH += hash(i)
    
    # completion의 sum(hash) 빼기
    for j in completion:
        sumH -= hash(j)
        
    # 남은 값이 완주하지 못한 선수
    return hash_dict[sumH]


# 3. Counter 사용
# Counter는 계산이 가능하다..! 

from collections import Counter

def solution3(participant, completion):
    answer = Counter(participant) - Counter(completion)
    return list(answer.keys())[0]
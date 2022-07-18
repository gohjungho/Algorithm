# 완주하지 못한 선수

# 정확성 test는 100
# but 효율성 test는 0... 

def solution(participant, completion):
    for i in completion:
        if i in participant:
            participant.remove(i)
            
    answer = participant[0]
            
    return answer
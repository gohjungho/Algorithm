# 문자열 압축하기 (카카오)

def solution(s):
    answer = len(s) # 가장 짧은 길이로 줄여야해! 
    # 1 ~ len(s)//2 개씩 끊기
    for cut in range(1, len(s)//2+1): # 정확한 이유는 모르지만 +1을 빼면 'aaa'와 같은 경우 2가 아닌 3이 나온다.
        result = ""
        string = s[0:cut] # 끊을 개수만큼 cut이 변동 
        count = 1
        # 자를 숫자만큼 이동하며 확인
        for i in range(cut, len(s), cut): # 2면 2만큼, 3이면 3만큼 jump! jump!
            if string == s[i:i+cut]: # 끊고자하는 단위와 일치하면
                count += 1
            else: # 다르다면 
                result += str(count) + string if count >= 2 else string
                string = s[i:i+cut] 
                count = 1 # 초기상태로 돌아가자  
        # 단독으로 존재하는 값에 대한 예외처리 
        result += str(count) + string if count >= 2 else string
        
        # 압축한 문자열 중 가장 짧은 값을 찾아야 하므로 최소값을 찾자 
        answer = min(answer, len(result)) 
            
    return answer

s = input()
print(solution(s))
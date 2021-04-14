# n 이하의 수 중 소수 모두 출력하기 
def solution(n): 
    answer = [] # 소수를 담을 리스트 
    number = [] # n 이하의 수 중 소수를 파악할 리스트. 소수가 아니면 -1   
    
    #... 1 기본 방 설정 
    for i in range(n + 1): # 입력받은 수까지이므로 +1 
        number.append(i) # n까지의 모든 수를 number 리스트에 담기 
    
    #... 2 소수 찾기. 소수가 아니면 -1 넣기 
    for i in range(2, n + 1, 1): # 0, 1은 소수가 아니므로 2부터 시작 
        if i == -1: # i가 소수이면 처음으로 돌아감 
            continue
        j = 0
        for j in range(i + i, n + 1, i): 
            # i + i는 자기 자신을 뺀 배수를 표현하기 위함 
            # 그리고 i만큼 건너뜀 
            number[j] = -1 # -1은 소수가 아님을 표시.        
    
    #... 3 -1이 아닌 방의 개수 세기 
    for i in range(2, n + 1):
        if number[i] != -1: # 값이 -1이 아닌 방 번호가 소수
            answer.append(number[i])
    
    return answer 
    
solution(15)
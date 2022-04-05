# 스택/큐 - 프린터

# 1. 선입선출(FIFO) - 큐
# 2. 같은 중요도를 어떻게 처리해야 할까...

def solution(priorities, location):
    cnt = 0 # 출력할 자릿수 
    
    # priorities에 하나도 남아있지 않을 때까지 반복 
    while(len(priorities) != 0):
        # 찾아야할 값이 맨 앞에 왔을 경우
        if location == 0: 
            # 중요도가 더 높은 문서가 있는 경우
            if priorities[0] < max(priorities):
                # 맨앞의 값을 뽑아다가 추가함(맨뒤로 보냄)
                priorities.append(priorities.pop(0)) 
                location = len(priorities) - 1 # location을 맨 끝으로(배열길이 - 1)
            # 중요도 높은 문서가 없는 경우(현 순서를 출력)
            else:
                return cnt + 1
        else:
            if priorities[0] < max(priorities):
                priorities.append(priorities.pop(0))
                location -= 1 # 맨앞 요소가 뒤로 갔으므로 -1 
            else:
                priorities.pop(0) # 맨앞 요소 뽑아냄 
                location -= 1 # 맨앞 요소가 없어졌으므로 -1
                cnt += 1
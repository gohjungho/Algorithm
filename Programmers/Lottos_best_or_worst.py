# 로또의 최고 순위와 최저 순위
def solution(lottos, win_nums):
    answer = [0,0]
    rank = [6,6,5,4,3,2,1]
    # 0,1: 6th, 2: 5th, 3: 4th, 4: 3rd, 5: 2nd, 6: 1st
            
    cnt = 0
    zero = lottos.count(0)
    
    for i in lottos:
        if i in win_nums:
            cnt += 1
    
    answer[0], answer[1] = rank[cnt+zero], rank[cnt]
    
    return answer
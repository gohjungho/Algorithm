def solution(n):
    # mondey = 1 ... sunday = 7
    week = n // 7 
    days = n % 7
    # start_days = {0:"sun", 1:"mon", 2:"tus", 3:"wed", 4:"thu", 5:"fri", 6:"sat"}

    if days == 6: 
        return sorted([week, week+1]) # ?
    elif days == 0:
        return sorted([week+1, week+1])
    else: return sorted([week, week]) 

# 정확성: 0.0
# 효율성: 0.0
# 합계: 0.0
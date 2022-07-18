def solution(survey, choices): 
    # 1, 2, 3 - left / 4 - none / 5, 6, 7 - right 
    num = [0] * 8 # 성격 유형 8가지 

    for i in range(len(survey)):
        chr1, chr2 = survey[i].split()

        if choices[i] == 1: num[0] = 3
        elif choices[i] == 2: num[0] = 2
        elif choices[i] == 3: num[]
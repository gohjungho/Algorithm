def solution(clothes):
    c_dict = {}
    for i in clothes:
        if i[1] not in c_dict : # 의상 종류의 개수 세기 
            c_dict[i[1]] = 1 
        else :
            c_dict[i[1]] += 1
    
    # 의상 종류 *= 개수 - 1
    answer = 1
    for i in c_dict.values():
        answer *= (i+1)
    return answer - 1
# 신고 결과 받기
# 안 풀려서 구글 검색함 ㅜㅜ

def solution(id_list, report, k):
    answer = [0] * len(id_list) 
    report = set(report) # 중복 사라짐 
    ls = {}
    check = {}
    
    for i in report:
        a, b = i.split(" ")
        
        if b not in check:
            check[b] = 1
        else:
            check[b] += 1
            
        if a not in ls:
            ls[a] = [b]
        else:
            if b not in ls[a]:
                ls[a] += [b]
                
    for id_, n in check.items():
        if n >= k:
            for user, usr in ls.items():
                if id_ in usr:
                    answer[id_list.index(user)] += 1
    
    return answer
    
# print(solution(["muzi", "frodo", "apeach", "neo"], 
# ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2))
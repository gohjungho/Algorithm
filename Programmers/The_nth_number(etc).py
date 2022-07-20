# K번째수 - 다른 풀이
# lambda 사용 한 줄로... 

def solution(array, commands):
    return list(map(lambda x: sorted(array[x[0]-1:x[1]])[x[2]-1], commands))

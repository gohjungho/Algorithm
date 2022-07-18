def solution(v):
    row_max = sum(v[0])
    col_max = 0
    columns = []

    for i in range(len(v)-1):
        row_max = max(row_max, sum(v[i+1]))

        tmp = []
        for j in v:
            tmp.append(j[i])
        columns.append(tmp)

    for i in range(len(columns)):
        col_max = max(col_max, sum(columns[i]))

    answer = [row_max, row_max + col_max]

    return answer

# 정확성: 7.4
# 효율성: 0.0
# 합계: 7.4
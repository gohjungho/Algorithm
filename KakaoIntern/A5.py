def solution(rc, operations):
    for i in range(len(operations)):
        if operations[i] == 'ShiftRow':
            tmp = rc.pop()
            rc.insert(0, tmp)

        elif operations[i] == 'Rotate': 
            tmp1 = rc[0].pop()
            tmp2_1, tmp2_2 = rc[1].pop(0), rc[1].pop()
            tmp3 = rc[2].pop(0) 

            rc[0].insert(0, tmp2_1)
            rc[1].append(tmp1)
            rc[1].insert(0, tmp3)
            rc[2].append(tmp2_2)

        # tmp = [0] * ((len(rc) - 2) * 2 + 2)
        # elif operations[i] == 'Rotate': 
        #     for j in range(len(rc)): # 행 수 
        #         if j == 1:
        #             tmp[j] = rc[j].pop()
        #         elif j == len(rc):
        #             tmp[j] = rc[j].pop(0)
        #         else:
        #             tmp[j] = rc[j].pop(0)
        #             tmp[len(rc)-j] = rc[j].pop()
    return rc 

if __name__ == '__main__':
    print(solution([[1,2,3], [4,5,6], [7,8,9]], ["Rotate", "ShiftRow"]))

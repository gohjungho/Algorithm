# 크레인 인형뽑기 게임

def solution(board, moves):
    box = []
    answer = 0 # 사라진 인형의 개수 

    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0: # 1번째의 idx는 0이므로 -1을 넣어줌 
                box.append(board[j][i-1])
                board[j][i-1] = 0

                if len(box) > 1: # 1개 있을 때는 비교할 필요 없음 
                    if box[-1] == box[-2]: 
                        box.pop()
                        box.pop()
                        answer += 2
                break

    return answer
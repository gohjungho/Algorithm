# 키패드 누르기

import math

def solution(numbers, hand):
    answer = ''
    left = 10 # "*"
    right = 12 # '#'

    for i in numbers:
        if i in [1, 4, 7]:
            answer += 'L'
            left = i

        elif i in [3, 6, 9]:
            answer += 'R'
            right = i

        else: # 2, 5, 8, 0
            i = 11 if i == 0 else i

            absL = abs(i-left)
            absR = abs(i-right)

            # 몫, 나머지를 구할 때 아주 큰 값이 아니라면 
            # divmod()는 쓰지 말자! - 속도가 느림 
            if abs((absL%3+absL//3)) > abs(absR%3+absR//3): 
                answer += 'R'
                right = i

            elif abs((absL%3+absL//3)) < abs(absR%3+absR//3): 
                answer += 'L'
                left = i

            else: # 거리가 같은 경우
                if hand == 'right':
                    answer += 'R'
                    right = i
                else: 
                    answer += 'L'
                    left = i

    return answer
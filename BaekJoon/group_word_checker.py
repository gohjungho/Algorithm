'''
# 1316
Q. 문자열 10 - 그룹 단어 체커

그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
'''
# 입력 조건 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
# 둘째 줄부터 N개의 줄에 단어가 들어온다. 
# 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

# 출력 조건 : 첫째 줄에 그룹 단어의 개수를 출력한다.



def solution(s):
    cnt = len(s) # 기본값으로 전부 정답이라 해두고... 

    k = 0
    while k < len(s):
        alpha = []
        if len(s[k]) == 1 or len(s[k]) == 2:
            k += 1
            continue 

        for i in range(1, len(s[k])):
            if s[k].islower() == False: # 소문자만로 이루어지지 않으면 -1
                cnt -= 1
                break

            if s[k][i] == s[k][i-1]: # 앞선 값과 같으면
                continue
            else: 
                if s[k][i-1] not in alpha and s[k][i] not in alpha: # 이전에 나온 값이 아니면
                    alpha.append(s[k][i-1])
                else: # 중복된 값이 다시 나오면 -1
                    cnt -= 1
                    break
        k += 1

    return cnt


n = int(input()) # 문자열 개수
s = []

for i in range(n):
    s.append(input())

print(solution(s))
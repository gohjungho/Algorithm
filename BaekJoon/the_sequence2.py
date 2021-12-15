'''
Q. 이분탐색 7 - 가장 긴 증가하는 부분 수열 2

수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 
가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
'''
# 입력 조건 : 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
# 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000,000)

# 출력 조건 : 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.


# def solution(s):
#     sequence = [s[0]] # 순차적으로 증가할 숫자의 list 

#     for i in range(1, len(s)):
#         if s[i] > sequence[-1]:
#             sequence.append(s[i])

#     return len(sequence)

# n = int(input())
# A = list(map(float, input().split()))

# print(solution(A))

n = int(input())
s = list(map(float, input().split()))

sequence = [s[0]] # 순차적으로 증가할 숫자의 list 

for i in range(1, len(s)):
    if s[i] > sequence[-1]:
        sequence.append(s[i])

print(len(sequence))
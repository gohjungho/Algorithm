# 2588
# 곱셈 

# 입력 조건 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 
# 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

# 출력 조건 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

def solution(a, b):
    _b = str(b)
    print(a * int(_b[2]))
    print(a * int(_b[1]))
    print(a * int(_b[0]))
    print(a * b)
    

a = int(input())
b = int(input())
solution(a, b)
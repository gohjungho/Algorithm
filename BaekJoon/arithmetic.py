# 10869
# 사칙연산 

# 두 자연수 A와 B가 주어진다. 
# 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

def solution(a, b):
    # add 
    print(a+b)
    # diff
    print(a-b)
    # multi
    print(a*b)
    # divide
    print(int(a/b))
    # remainder
    print(a%b)

a, b = map(int, input().split())
solution(a, b)
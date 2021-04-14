def is_prime(a): # 소수 판별 코드
    b = range(2, a) # 2부터 a - 1까지의 리스트
    c = 0 

    for i in b:
        if a % i == 0:
            c += 1 # 나누어 떨어지는 수가 있으면 카운트 

    if c > 0:
        print("{}는 소수가 아니다.".format(a))
        d = False
    else: 
        print("{}는 소수이다.".format(a)) 
        d = True
    return d 

a = range(1, 101) # 1~100까지 
prime_numbers = []  # 소수 list를 공집합으로 우선 만들고
for i in a: # 1~100 중 
    c = is_prime(i) # i가 소수이면 c는 True, 아니면 False 생성 
    if c == True: # c가 True이면 
        prime_numbers.append(i) # b에다가 i를 추가 
print(prime_numbers)

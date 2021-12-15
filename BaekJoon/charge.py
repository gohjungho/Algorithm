# 거스름돈 
# 500, 100, 50, 10 동전 최적의 개수 구하기

n = 1260 
coin = [500, 100, 50, 10]
cnt = 0

for i in coin:
    cnt += n // i 

print(cnt)
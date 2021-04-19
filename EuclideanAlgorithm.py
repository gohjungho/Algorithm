# 반복 사용 
# class EuclideanAlgorithm():
    
def euclide(x, y):
    t = x % y # 나머지 

    while t != 0: 
        x , y = y, t
        t = x % y 

    return y

a = int(input("첫 번째 수: "))
b = int(input("두 번째 수: "))
print(euclide(a, b))
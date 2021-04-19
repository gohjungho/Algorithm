# 재귀 사용 

def euclide(x, y):
    t = x % y # 나머지 
    
    if t != 0:
        x , y = y, t
        return euclide(x, y)
    else: return y

    # if x % y == 0:
    #     return y
    # return euclid(x, x % y)

a = int(input("첫 번째 수: "))
b = int(input("두 번째 수: "))
print(euclide(a, b))
def Lsearch(x, y):
    i = 0
    while i < 5:
        if x[i] == y:
            return "%d번째의 요소가 일치" % i
        i += 1
    return "찾지 못했습니다."

def Lsearch2(x, y):
    for i in range(len(x)):
        if x[i] == y:
            return "%d번째의 요소가 일치" % i
    return "찾지 못했습니다."

x = [4,2,3,5,1]
y = 5
z = Lsearch(x,y)
w = Lsearch2(x,6)
print(z)
print(w)
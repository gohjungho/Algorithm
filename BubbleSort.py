array = [5,3,4,1,2]

for i in range(len(array), 0, -1):
    # tmp = 0 
    for j in range(len(array) - 1, 0, -1):
        if array[j] < array[j - 1]:
            # tmp = array[j - 1]
            # array[j - 1] = array[j]
            # array[j] = tmp
            array[j - 1], array[j] = array[j], array[j - 1]
            
print(array)
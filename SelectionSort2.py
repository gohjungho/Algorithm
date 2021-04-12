def SelectionSort2(array):
    for i in range(len(array)):
        temp = array[i] # 초기값(array[0])을 임시변수에 저장 
        j = array.index(min(array[i:])) 
        # i번째부터 끝까지 중에 최소값의 인덱스를 찾아 j에 저장 

        array[i] = array[j] # j의 값을 i에 저장 
        array[j] = temp # 처음 임시 저장해둔 값을 j에 저장 
    return array

array = [12,13,11,14,10]
print(SelectionSort2(array))
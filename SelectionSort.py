def SelectionSort(array):
    for i in range(len(array)):
        temp = i
        for j  in range(i + 1, len(array)):
            if array[j] < array[temp]: # array[j](뒤)가 array[temp](앞)보다 작으면
                temp = j # 최소값(인덱스) 저장  

        array[i], array[temp] = array[temp], array[i] # 자리를 바꾸자 

    print(array) # return array

array = [12,13,11,14,10]
SelectionSort(array) # print(SelectionSort(array))

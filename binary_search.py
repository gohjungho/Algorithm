def Bsearch(arr, search):
    head = 0
    tail = len(arr) - 1

    while head <= tail:
        center = round((head + tail) / 2)
        if search == arr[center]:
            print("{}번째의 요소가 일치".format(center + 1))
            break
        elif search > arr[center] :
            head = center + 1
        elif search < arr[center]: 
            tail = center - 1

        if head > tail:
            print("찾지 못했습니다.")

arr = [11, 13, 17, 19, 23, 29, 31]
search = int(input("검색할 데이터를 입력하세요: "))
Bsearch(arr, search)
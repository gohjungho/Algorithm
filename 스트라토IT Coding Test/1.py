def solution(num):
    number = []
    answer = ""

    for i in range(len(str(num))):
        number.append(str(num)[i])

    for j in number:
        if j == "1": answer += "one"
        elif j == "2": answer += "two"
        elif j == "3": answer += "three"
        elif j == "4": answer += "four"
        elif j == "5": answer += "five"
        elif j == "6": answer += "six"
        elif j == "7": answer += "seven"
        elif j == "8": answer += "eight"
        elif j == "9": answer += "nine"
        else: answer += "zero"

    return answer

# 정확성: 100.0
# 효율성: 0.0
# 합계: 100.0
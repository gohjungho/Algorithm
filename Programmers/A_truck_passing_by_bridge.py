# 스택/큐 - 다리를 지나는 트럭

def solution(bridge_length, weight, truck_weights):
    cnt = 0
    bridge = [0] * bridge_length
    
    # 다리 위 차량이 남아 있지 않을 때까지 실행
    while len(bridge): 
        cnt += 1
        bridge.pop(0)
        if truck_weights:
            # 다리 위 무게 비교
            if sum(bridge) + truck_weights[0] <= weight:
                bridge.append(truck_weights.pop(0))
            else:
                bridge.append(0) 
    
    return cnt

print(solution(2, 10, [7, 4, 5, 6])) # 8
print(solution(100, 100, [10])) # 101
print(solution(100, 100, [10,10,10,10,10,10,10,10,10,10])) # 110
def solution(prices):
    profit = 0
    
    price_min = min(prices)
    buy_cost = prices.index(min(prices))
    sell_cost = max(prices[buy_cost:])
    
    if price_min == prices[-1]: 
        return 0
    else: 
        profit = sell_cost - price_min
        return profit


# 정확성: 44.0
# 효율성: 16.0
# 합계: 60.0

def solution(prices):
    profit = 0

    for i in range(len(prices)):
        price_min = prices[i]
        sell_cost = max(prices[i:])

        profit = max(profit, sell_cost - price_min)
        
    return profit

if __name__ == "__main__":
    solution([3, 2, 4, 8, 7])
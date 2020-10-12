def solution(prices):
    answer = []
    leng = len(prices)
    for p in range(0, leng-1):
        cnt = 0 
        for q in range(p+1, leng):
            if prices[p]>prices[q]:
                cnt+=1
                break
            cnt+=1
        answer.append(cnt)
    answer.append(0)

    return answer

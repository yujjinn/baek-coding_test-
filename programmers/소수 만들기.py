from itertools import combinations

def isPrime(x ,y, z) :
    sum = x+y+z
    
    for i in range(2, sum) :
        if sum % i == 0 :
            return False
    
    return True


def solution(nums):
    answer = 0
    arr = list(combinations(nums, 3))
    # 갓... combinations 너무 사랑함
    for i in arr:
        if isPrime(i[0], i[1], i[2]) : 
            answer+=1
    return answer

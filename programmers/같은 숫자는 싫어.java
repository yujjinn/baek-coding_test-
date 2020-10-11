def solution(arr):
    answer = []
    a = arr[0]
    answer.append (a)
    for t in range(1,len(arr)):
        if a != arr[t]:
            answer.append(arr[t])
            a = arr[t]
    return answer

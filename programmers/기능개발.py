import math
def solution(progresses, speeds):
    answer = []
    arr = [] 
    for i in range(0, len(progresses)):
        arr.append(math.ceil((100-progresses[i])/speeds[i]))
    bf = arr[0]
    cnt = 1
    for a in arr[1:] : 
        print(bf, a)
        if a <= bf : 
            cnt+=1
            print(a ,cnt)
        else :
            answer.append(cnt)
            bf=a
            cnt=1
    answer.append(cnt)
    return answer

def solution(strings, n):
    answer = []
    nstr = [] 
    strLen = len(strings)
    for i in range(0, strLen):
        nstr.append(strings[i][n])

    nstr = sorted(nstr)
    strings = sorted(strings)
    for i in range(0, len(nstr)) :
        idx = 0
        while (len(strings)>0) : 
            if nstr[i]== strings[idx][n]:
                answer.append(strings[idx])
                strings.remove(strings[idx])
                break;
            idx +=1

    return answer

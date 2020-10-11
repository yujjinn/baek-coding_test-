def solution(numbers):
    answer = []
    s = set()
    for i in range(0, len(numbers)-1):
        for j in range(i+1, len(numbers)):
            s.add(numbers[i]+numbers[j])
    answer = list(s)
    answer.sort()
    
    # python에서는 list와 set의 변환이 간단하다
    # set 변수 말고 answer에 자장하고 이를 set으로 변환한 뒤 다시 list로 전환하는 방법도 있다. -> sorted(list(set(answer)))
    
   
    return answer

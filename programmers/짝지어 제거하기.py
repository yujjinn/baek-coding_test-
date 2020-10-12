def solution(s):
    arr = []
    #원래있는 s에서 빼기보다는 넣는 방향으로 재고
    for i in s:
        if len(arr) == 0: arr.append(i)
        elif arr[-1] == i: arr.pop()
        else: arr.append(i)
    if len(arr) == 0: return 1
    else: return 0 

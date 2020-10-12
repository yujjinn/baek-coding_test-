def solution(array, commands):
    answer = []
    arr = [] 
    for i in range(0, len(commands)):
        # x,y,z = i -> 굳이 index 안 줘도 반영이 됨 
        arr = array[commands[i][0]-1:commands[i][1]]
        answer.append(sorted(arr)[commands[i][2]-1])
    return answer

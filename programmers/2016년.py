def solution(a, b):
    day = ["THU", "FRI","SAT","SUN","MON","TUE", "WED"]
    mon = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    # 배열 범위 합을 간단한 sum 집계 함수로 구현할 수 있다
    return day[(sum(mon[:a-1])+b)%7]
    

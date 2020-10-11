def solution(s):
    answer = True
    s=s.lower()
    # count라는 유용한 집계 함수가 있다 ㄷㄷ
    return s.count('p') == s.count('y')
    
    

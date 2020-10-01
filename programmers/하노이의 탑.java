import java.util.*;

class Solution {
    
    static int cnt = 0;
    public int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2,n)-1][2];
        hanoi(n, 1, 3, 2, answer);
        return answer;
    }
    
    static void hanoi(int n, int from, int to, int by, int answer[][]){
        if(n==1){
            answer[cnt][0]=from;
            answer[cnt++][1]=to;
            return;
        }
        hanoi(n-1, from, by, to, answer);
        answer[cnt][0]=from;
        answer[cnt++][1]=to;
        hanoi(n-1, by, to, from, answer);
    }
}

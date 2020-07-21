import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n+1];
        boolean [][] arr = new boolean[n+1][n+1];
        for(int i = 0; i < edge.length; i++) {
            arr[edge[i][0]][edge[i][1]] = arr[edge[i][1]][edge[i][0]] = true;
        }
        Queue<Integer> qu = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        qu.add(1);
        visited[0] = visited[1] = true;
        while(true) {
            answer = qu.size();
            while(!qu.isEmpty()) {
                int node = qu.poll();
                for(int i = 1; i <= n; i++) {
                    if(!visited[i] && arr[node][i] ) {
                        list.add(i);
                        visited[i] = true;
                    }
                }
            }
            if(list.isEmpty()) {
                break;
            }
            qu.addAll(list);
            list.clear();
        }
        return answer;
    }
}

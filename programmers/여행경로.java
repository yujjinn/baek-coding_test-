import java.util.*;
class Solution {
    public static ArrayList<String> way = new ArrayList<>(); 
    public static  StringBuilder sb = new StringBuilder();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        int len = tickets.length;
        boolean flag[] = new boolean[len];
        for(int i=0; i<len; i++) {
            String start = tickets[i][0];
            String dest = tickets[i][1];
            if(start.equals("ICN")) {
                flag[i]=true;
                sb.append(start+ " ");
                findWay(dest, 1 ,flag, tickets);
                flag[i]=false;
                sb = new StringBuilder();
                flag = new boolean[len];
            }

        }
        Collections.sort(way);
        answer = way.get(0).split(" ");
        return answer ;
    }   

    public static void findWay(String target, int cnt, boolean flag[], String tickets[][]) {
        sb.append(target+ " ");
        if(cnt == tickets.length) {
            way.add(sb.toString());
            return ;
        }
        for(int i=0; i<tickets.length; i++) {
            String start = tickets[i][0];
            String dest = tickets[i][1];
            if(!flag[i] && target.equals(start)) {
                flag[i]=true;
                findWay(dest, cnt+1 , flag, tickets);
                flag[i]=false;
                sb = new StringBuilder(sb.substring(0, sb.length()-4));
            }
        }
    }
}

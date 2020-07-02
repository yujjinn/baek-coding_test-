package bak;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<tower> stack = new Stack<tower>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 높이 때문에 1부터 시작 
        for(int i = 1; i <= N; i++){
            long a = Long.parseLong(st.nextToken());
            // 비어 있지 않으면 
            while(!stack.isEmpty()){
                // 가장 위에 있는 값의 높이가 지금 넣으려는 값보다 크거나 같다면
                if(stack.peek().height >= a){
                    bw.write(stack.peek().position + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()) bw.write("0 ");
            stack.push(new tower(a, i));
        }

        bw.flush();
        br.close();
        bw.close();
    }
    static class tower{
        long height;
        int position;
        public tower(long height, int position){
            this.height = height;
            this.position = position;
        }
    }
}

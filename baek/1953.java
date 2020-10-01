import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	static int map[][] ; 
	static int visited[];
	static Queue<Integer> qu = new LinkedList<>();
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		visited = new int [n+1];
		for(int i = 1 ; i<= n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			for(int k=0; k<num; k++) {
				int hate = Integer.parseInt(st.nextToken());
				map[i][hate]=map[hate][i]=1;
			}
		}
		
		for(int l=1; l<=n; l++) {
			if(visited[l]!=0) {//방문 이력이 있다면
				continue;
			}
			visited[l]=1;
			qu.add(l);
			while(!qu.isEmpty()) { // 비어있지 않을 때까지
				int current = qu.poll();
				
				for(int m=1 ; m<=n ; m++) {
					if(visited[m]==1) {continue;}
					if(map[current][m]==1) {
						visited[m]=visited[current]*-1;
						qu.add(m);
					}
				}
			}
		}
		int cnt1 = 0;
		int cnt2 = 0;
		String str1 = "";
		String str2 = "";
		for(int v=1; v<=n; v++) {
			if(visited[v] == 1) {
				cnt1++;
				str1 += (v+ " ");
			}
			else {
				cnt2++;
				str2 += (v+ " ");
			}			
		}

		System.out.println(cnt1);
		System.out.println(str1);
		System.out.println(cnt2);
		System.out.println(str2); 

	}
	
}

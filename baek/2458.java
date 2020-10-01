import java.util.*;

public class Main {
	static int arr[][] ;
	static boolean visited[];
	static int cnt = 0; 
	public static void main(String[] args){
		int answer = 0; 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 0, b= 0;
		arr = new int[n+1][n+1];
		
		for(int i =0; i<m ; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=-1;
		}
		
		
		for(int i=1; i<=n; i++) {
			visited = new boolean[n+1];
			findMyPosition(i, n, 1 );
            visited = new boolean[n+1];
			findMyPosition(i, n, -1 );
			if(cnt == (n-1)) answer++;
			cnt =0 ;
		}
		System.out.println(answer);
	}
	static void findMyPosition(int now, int n, int flag) {
		cnt++;
		visited[now]=true;
		for(int i=1; i<=n ;i++) {
			if(arr[now][i]==flag && !visited[i]) {
				findMyPosition(i, n, flag);
			}			
			
		}
	}
}

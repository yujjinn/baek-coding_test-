import java.util.*;

public class Main
{
	static boolean visited[] ;
	static int cnt = 0; 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dot = sc.nextInt();
		int line = sc.nextInt();
		int arr[][] = new int[dot][dot];
		visited = new boolean[dot];
		for(int i=0; i<line; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x-1][y-1]=arr[y-1][x-1]=1;
		}
		
		for(int i=0; i<dot; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i, arr);
				cnt++;
			}
		}

		System.out.println(cnt);
	}	
	
	
	public static void dfs(int target, int arr[][]) {
		visited[target]=true;
		
		for(int i=0; i<arr.length; i++) {
			if(!visited[i] && arr[target][i]==1) {
				dfs(i, arr);
			}
		}
	}
	
}

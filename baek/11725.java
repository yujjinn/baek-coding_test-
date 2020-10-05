import java.util.*;
public class Main{
	static int cnt = 0 ; 
	static int arr[];
	static List<Integer>[] list;
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		list = new ArrayList[cnt+1];
		arr = new int[cnt+1];
		visited = new boolean[cnt+1];
		for(int i=1; i<=cnt; i++)list[i]=new ArrayList<>();
		for(int i=1; i<cnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list[x].add(y);
			list[y].add(x);
		}
		dfs(1);
		for(int k=2; k<=cnt; k++) {
			System.out.println(arr[k]);
		}
	}
	static void dfs(int x) {
		visited[x] = true;
		for(int l : list[x]) {
			if(!visited[l]) {
				arr[l]=x;
				dfs(l);
			}
		}
	}
	
}

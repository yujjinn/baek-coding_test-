import java.util.*;
public class Main {
	static int arr[][];
	static boolean visited[] ; 
	static int n = 0, begin =0 , end=0, m=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		begin = sc.nextInt();
		end = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i = 0 ; i< m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x]=1;
		}
		System.out.println(BFS(begin, end));
		
		
	}
	static int BFS(int start, int target) {
		Queue<Integer> qu = new LinkedList<>();
		visited[start ] = true;
		qu.add(start);
		int answer = 0 ;
		while(!qu.isEmpty()) {
			int size =  qu.size();
			for(int k =0; k<size; k++) {
				int current = qu.poll();
				if(current == target) {
					return answer;
				}
				for(int i=1; i<=n ; i++) {
					if(arr[current][i]==1 && !visited[i]) {
						visited[i]= true;
						qu.add(i);
					}
				}
				
			}
			answer++;
		}
		return -1;
				
	}
  
}

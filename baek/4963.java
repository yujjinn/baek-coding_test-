import java.util.*;
public class Main {
	static int dx[] = {0,0,1,-1,1,1,-1,-1};
	static int dy[] = {1,-1,0,0,1,-1,1,-1};
	static boolean visited[][];
	static int arr[][];
	static int n =-1, m = -1;
	public static void main(String[] args) {
		ArrayList<Integer> land = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0 ;
		while(n!=0 && m!=0) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int[m][n];
			visited = new boolean[m][n];
			for(int i =0; i<m; i++) {
				for(int j=0; j<n ; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i =0; i<m; i++) {
				for(int j=0; j<n ; j++) {
					if(arr[i][j] == 1 && !visited[i][j]) {
						dfs(i, j, ++cnt);
					}
				}
			}
			land.add(cnt);
			cnt = 0;
		}
		land.remove(land.size()-1);
		for(int isL : land)
		System.out.println(isL);
	}
	static void dfs(int x, int y, int cnt) {
		visited[x][y]= true;
		int Nx =0, Ny=0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				Nx = dx[i]+x;
				Ny = dy[i]+y;
				if(isR(Nx, Ny) && !visited[Nx][Ny] && arr[Nx][Ny]==1) {
					dfs(Nx,Ny, cnt);
				}
			}
		}
		
		
	}
	static boolean isR(int x, int y) {
		boolean flag = false;
		if(x>=0 && x<m && y>=0 && y<n)flag= true;
		return flag;
	}
}

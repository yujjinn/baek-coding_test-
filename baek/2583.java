import java.util.*;
class point{
	int x ; 
	int y;
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main{
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static int arr[][];
	static int m = 0;
	static int n = 0; 
	
	static int sum = 0 ;
	
	public static void main(String[] args) {
		ArrayList<Integer > list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();
		int k = sc.nextInt();
		
		int lx = 0;
		int ly = 0;
		int rx = 0; 
		int ry = 0;
		
		arr = new int[n][m];

		for(int i =0; i<k; i++) {
			lx = sc.nextInt();
			ly = sc.nextInt();
			rx = sc.nextInt();
			ry = sc.nextInt();
			
			for(int x=lx; x<rx; x++) {
				for(int y=ly; y<ry; y++) {
					//System.out.println(x+ " ,  " + y);
					arr[x][y]=1;
				}
			}	
		}
		
		int cnt = 0;  // 전체 개수 구하기
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==0) {
					cnt++;
					bfs(i, j);
					list.add(sum+1);
					sum=0;
				}
			}
		}
		
		Collections.sort(list); // 오름차순
		System.out.println(cnt);
		for(int l : list )System.out.print(l + " ");
		
	}
	
	static void bfs(int x, int y) {
		Queue<point> qu = new LinkedList<>();
		qu.add(new point(x, y));
		sum =0;
		arr[x][y]=1;

		while(!qu.isEmpty()) {
			point p = qu.poll();
			int cx = p.x;
			int cy = p.y;
			
			for(int i=0; i<4; i++) {
				int nx = cx+dx[i];
				int ny = cy+dy[i];
				
				if(isR(nx, ny) && arr[nx][ny]==0 ) {
					qu.add(new point(nx, ny));
					arr[nx][ny]=1;
					sum+=1;
				}
				
			}
			
		}

	}
	
	static boolean isR(int x, int y) {
        // 새로운 좌표가 범위에 해당하는지
		if(x>=0 && x<n && y>=0 && y<m)return true;
		return false;
	}
}

import java.util.*;
public class Main {
	static int map[][] ;
	static Map<Integer , Integer > maps = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		map = new int[n+1][n+1];
		
		boolean [] visited = new boolean[n+1];
		int len[] = new int[n+1];
		
		for(int i=0 ;i<m; i++) {
			int xx = sc.nextInt();
			int yy = sc.nextInt();
			int k = sc.nextInt();
			map[xx][yy]=k;
		}
		for(int i=1; i<=n; i++)maps.put(i, 0);
		for(int i=1; i<=n; i++) {
			dijkstra(i, n, x);
			//System.out.println(maps);
		}
		Iterator<Integer> keys = maps.keySet().iterator();
		int max = Integer.MIN_VALUE;
		while(keys.hasNext()) {
			int key = keys.next();
			max = Math.max(maps.get(key), max);
		}
		System.out.println(max);
	}
	static void dijkstra(int v, int n , int x ){
		int distance[] = new int[n+1];          //최단 거리를 저장할 변수
	    boolean[] check = new boolean[n+1];     //해당 노드를 방문했는지 체크할 변수
	         
	        //distance값 초기화.
	    for(int i=1;i<n+1;i++){
	         distance[i] = Integer.MAX_VALUE;
	     }
	         
	        //시작노드값 초기화.
	    distance[v] =0;
	    check[v] =true;
	         
	        //연결노드 distance갱신
	    for(int i=1;i<n+1;i++){
	    	if(!check[i] && map[v][i] !=0){
	                distance[i] = map[v][i];
	            }
	     }

	     for(int a=0;a<n-1;a++){
	            //원래는 모든 노드가 true될때까지 인데
	            //노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다.
	            //원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
	            int min=Integer.MAX_VALUE;
	            int min_index=-1;
	             
	            //최소값 찾기
	            for(int i=1;i<n+1;i++){
	                if(!check[i] && distance[i]!=Integer.MAX_VALUE){
	                    if(distance[i]<min ){
	                        min=distance[i];
	                        min_index = i;
	                    }
	                }
	            }
	             
	            check[min_index] = true;
	            for(int i=1;i<n+1;i++){
	                if(!check[i] && map[min_index][i]!=0){
	                    if(distance[i]>distance[min_index]+map[min_index][i]){
	                        distance[i] = distance[min_index]+map[min_index][i];
	                    }
	                }
	          }
	   }
	   if(v == x) {
		   for(int i=1; i<=n ;i++) {
			   maps.put(i, maps.get(i)+distance[i]);
		   }
	   }
	   else {
		   maps.put(v, maps.get(v)+distance[x]); 
	   }
	   //for(int d : distance)System.out.print(d + " ");
	   //System.out.println();
	}
}

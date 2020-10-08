import java.util.*;
public class Main{
	static int MAX = 50001;
	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> getR = new ArrayList<>();
	static ArrayList<Integer> ans = new ArrayList<>();
	public static void main(String[] args) {
		boolean visited[] = new boolean[MAX+1];
		for(int i=2; i<=MAX; i++) {
			if(!visited[i]) {
				list.add(i);
                try{
				    for(int j=i*i; j<=MAX ; j+=i )visited[j]=true;
                }
                catch(Exception e){
                    // int범위 넘어갈 때(i*i)
                    ;
                }
			}
		}
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				int getMux = list.get(i)*list.get(j);
				if(i!=j && (getMux>=0 && getMux<=100001))getR.add(getMux);
			}
		}
		Collections.sort(getR);
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			ans.add(findMux(sc.nextInt()));
		}

		for(int a : ans)System.out.println(a);
	}
	static int findMux (int num){

		int left = 0, right = getR.size()-1, mid = 0;
		int min = 0;
		while(left<=right) {
			mid = (left + right)/2;
			if(getR.get(mid)>=num) {
				min = mid;
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return getR.get(min);
	}
}

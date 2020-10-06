import java.util.*;
public class Main {
	static ArrayList<Integer> card = new ArrayList<>();
	public static void main(String[] args) {	
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int k = 0; 
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			k = sc.nextInt();
			card.add(k);
		}
		// 이진 탐색을 위한 정렬
		Collections.sort(card);
		int M = sc.nextInt();
		for(int i =0; i<M ; i++) {
			k = sc.nextInt();
			if(binary(k)) {
				sb.append(1+ " ");
			}
			else {
				sb.append(0 + " ");
			}
		}
		System.out.println(sb);
	}
	static boolean binary(int num) {
		int left = 0 ;
		int right = card.size()-1;
		int mid = 0;
		while(left<=right) {
			mid = (left + right)/2;
			if(card.get(mid) < num)
				left = mid + 1;
			else if (card.get(mid)>num)
				right = mid - 1;
			else
				return true;
		}
		return false;
	}
}

import java.util.*;
public class Main{
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long sum = 0; 
		int cnt = 0;
		while(sum <= k ) {
			cnt++;
			sum+=cnt;
			if(sum>k) {
				cnt --;
			}
		}	
		System.out.println(cnt);		
	}
}

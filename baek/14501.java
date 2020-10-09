import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int t [] = new int[n+6]; // 시간
		int p [] = new int[n+6]; // 금액
		int dp [] = new int[n+6]; // dp용

		for(int i=1; i<=n; i++) {
			t[i]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		
		int max = 0; 
		for(int i=1; i<=n+1; i++) { //index 
			dp[i]=Math.max(dp[i], max);
			dp[t[i]+i]=Math.max(dp[t[i]+i], p[i]+dp[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
	}
	
}

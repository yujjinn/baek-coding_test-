// dp
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long dp[] = new long[101];
	    for (int i=0; i<=6; i++) {
	        dp[i] = i;
	    }
	    for (int i=7; i<=n; i++) {
	        for (int j=3; j<=i-1; j++) {
	            long cur = dp[i-j]*(j-1);
	            if (cur > dp[i]) {
	                dp[i] = cur;
	            }
	        }
	    }

		System.out.println(dp[n]);
	}
	
}

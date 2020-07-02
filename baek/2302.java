// dp

import java.util.*;

class Main {
	public static void main(String args[]) {
		int answer = 1; 
        Scanner sc = new Scanner(System.in);
        int dp[] = new int[41];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        int total = sc.nextInt();
        for(int i=3; i<=total; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        int n = sc.nextInt();
        int start = 0; 
        int k = 0 ; 
        for(int i=0; i<n; i++){
            k = sc.nextInt();
            answer*=dp[k-start-1];
            start = k;
        }
        answer*=dp[total-start];
        System.out.println(answer);
	}

	
}

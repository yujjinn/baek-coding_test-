import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i]=sc.nextInt();
        }
        long dp[] = new long [101];
        dp[1]=dp[2]=dp[3]=1; 
        dp[4]=dp[5]=2;
        dp[6]=3;
        dp[7]=4;
        dp[8]=5;
        
        for(int i=9; i<=100; i++) {
        	dp[i]=dp[i-5]+dp[i-1];
        }

        for(int i =0; i<n; i++) {
        	System.out.println(dp[arr[i]]);
        }
    	
    }
    
}
​

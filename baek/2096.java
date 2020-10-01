import java.util.*;

public class Main
{   
    public static void main(String[] args) {
    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[][] = new int[n][3];
    	int dp[][] = new int[n][3];
    	for(int i=0; i<n; i++) {
    		arr[i][0]=sc.nextInt();
    		arr[i][1]=sc.nextInt();
    		arr[i][2]=sc.nextInt();
    	}
    	
    	dp[0][0] = arr[0][0];
    	dp[0][1] = arr[0][1];
    	dp[0][2] = arr[0][2];
    	
    	for(int i=1; i<n; i++) {
    		dp[i][0]=arr[i][0]+Math.max(dp[i-1][0], dp[i-1][1]);
    		dp[i][1]=arr[i][1]+Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
    		dp[i][2]=arr[i][2]+Math.max(dp[i-1][1], dp[i-1][2]);
    	}
    	max = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
    	
    	for(int i=1; i<n; i++) {
    		dp[i][0]=arr[i][0]+Math.min(dp[i-1][0], dp[i-1][1]);
    		dp[i][1]=arr[i][1]+Math.min(dp[i-1][0], Math.min(dp[i-1][1], dp[i-1][2]));
    		dp[i][2]=arr[i][2]+Math.min(dp[i-1][1], dp[i-1][2]);
    	}
    	min = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
    	
    	System.out.println(max+ " "+ min);    	
    }

}

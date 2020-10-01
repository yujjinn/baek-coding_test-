import java.util.*;
public class Main
{   
    public static void main(String[] args) {
    	int answer = 0 ;
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	int dp[] = new int[n];
    	dp[0]=1;
    	for(int i=0; i<n; i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	for(int i=1; i<n; i++) {
    		dp[i]=1;
    		for(int j=0; j<i; j++) {
    			if(arr[j]<arr[i] && dp[i]<=dp[j]){
    				dp[i]=dp[j]+1;
    			}
    		}
    	}
    	int max = Integer.MIN_VALUE;
    	for(int d : dp) {
    		max = d>max?d:max;
    	}
    	System.out.println(max);
    }


}
​

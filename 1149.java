//dp

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		int[][] dp = new int[n][3];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dp[0][0]=arr[0][0];
		dp[0][1]=arr[0][1];
		dp[0][2]=arr[0][2];
		for(int k=1; k<n; k++) {
			dp[k][0]=Math.min(dp[k-1][1], dp[k-1][2])+arr[k][0];
			dp[k][1]=Math.min(dp[k-1][0], dp[k-1][2])+arr[k][1];
			dp[k][2]=Math.min(dp[k-1][0], dp[k-1][1])+arr[k][2];
		}
        System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
	}

}

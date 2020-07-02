// dp


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int mod = 10007;
		int dp[][]=new int[10001][10];
		
        for(int i=0; i<10; i++){dp[1][i]=1;}
        for(int i=2; i<=n; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] = dp[i][j]%mod;
                }
            }
        }
        int answer = 0 ;
        for(int i=0; i<10; i++){
        	answer += dp[n][i];
        }
        System.out.println(answer);
	}
	
}

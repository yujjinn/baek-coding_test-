import java.util.*;
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[4];
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		int N = sc.nextInt();
		int dp[] = new int[301];
		dp[0]=1;
		for(int i =1; i<=3; i++) {
			for(int j = num[i]; j<=N; j++) {
				dp[j]+=dp[j-num[i]];
			}
		}
		if(dp[N]>0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}

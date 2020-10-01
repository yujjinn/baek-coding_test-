import java.util.*;

public class Main
{    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] ;
		int dp[];
		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			arr = new int[m];
			for(int k=0; k<m; k++) {
				arr[k]=sc.nextInt();
			}
			int max = sc.nextInt();
			dp = new int[max+1];
			for(int k=0; k<m; k++) {
				dp[0]=1;
				for(int l=arr[k]; l<=max; l++) {
					dp[l]+=dp[l-arr[k]];
				}
			}
			System.out.println(dp[max]);
			
		}
    }

}

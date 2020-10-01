import java.util.*;

public class Main
{    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int arr[] = new int[n];
		int k = sc.nextInt();
		long dp[] = new long[k+1];
		dp[0]=1;
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<=k; j++) {
				dp[j]+=dp[j-arr[i]];
			}
		}
		System.out.println(dp[k]);
	}

}

import java.util.*;

public class Main
{    
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		char ch1[] = sc.nextLine().toCharArray();
		char ch2[] = sc.nextLine().toCharArray();
		
		int len1 = ch1.length;
		int len2 = ch2.length;
		
		int dp[][] = new int[len1+1][len2+1];
		int max = 0; 
		for(int i=1; i<=len1; i++) {
			for(int j=1; j<=len2; j++) {
				if(ch1[i-1]==ch2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}
				max = Math.max(max, dp[i][j]);
			}
		}

		System.out.println(max);
		
    }
}

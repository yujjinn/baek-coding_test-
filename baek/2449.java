//dp
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n  = Integer.parseInt(st.nextToken());
		int k  = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int idx = 0;
		int bulb[] = new int[n];
		bulb[idx++] = Integer.parseInt(st.nextToken());
		// 같은 값들 압축
		while(st.hasMoreTokens()) {
			int next = Integer.parseInt(st.nextToken());
			if(bulb[idx-1] != next) {
				bulb[idx++] = next;
			}
		}
		int N = idx; 
		int dp[][] = new int[N][N];
		for(int len = 1; len<=N; len++) {
			for(int i=0; i<N-len; i++) {
				dp[i][i+len]= 0xfffff;
				for(int j=i; j<i+len; j++) {
					dp[i][i+len] = Math.min(dp[i][i+len],
							dp[i][j]+dp[j+1][i+len] + (bulb[i]==bulb[j+1]? 0 : 1));
				}
			}
		}
        
        System.out.println(dp[0][N-1]);
	}	
}

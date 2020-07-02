// dp


import java.util.*;

class Main {
	public static void main(String args[]) {
        ArrayList<Long> list = new ArrayList<>();
        long dp[][] = new long[65][10];
        long result[] = new long[65];
        for(int i=0; i<10; i++){
            dp[1][i]=1;
        }
        long sum = 10;
        long newSum = 10;
        result[1]=10;
        for(int i=2; i<65; i++) {
			dp[i][0]=sum ;
			for(int j=1; j<10; j++) {
				sum-=dp[i-1][j-1];
				dp[i][j]=sum;
				newSum += sum;
			}
            result[i]=newSum;
			sum = newSum;
		}
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = 0;
        for(int k=0; k<total; k++){
            n = sc.nextInt();
            list.add(result[n]);
        }
        for(long r : list){
            System.out.println(r);
        }
	}

	
}

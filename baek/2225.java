import java.util.*;

public class Main
{   
	static HashSet<Integer> list = new HashSet<>();
	static int arr[];
	static boolean visited[];
    public static void main(String[] args) {
    	int answer = 0 ;
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	
    	int arr[][] = new int[k+1][n+1];
    	
    	int sum =0;
    	for(int i=0; i<=n; i++){ arr[1][i]=1; }
    	
    	for(int i=1; i<=k; i++) {
    		for(int j=0; j<=n; j++) {
    			for(int m =0; m<=j; m++ ) {
    				arr[i][j]+=arr[i-1][m];
                    arr[i][j]%=1000000000;
    			}
    		}
    	}

    	
    	System.out.println(arr[k][n]);
    	
    }
    
}
​

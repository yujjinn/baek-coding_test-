import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		int ans = 99;
		
		if(n<100) {System.out.println(n);return;}
		
		for(int i=100; i<=n; i++) {
			
			String num = i+"";
			int len = num.length();
			int N = i;
			int arr[] = new int[len];
			
			for(int j=0; j<len; j++){
				arr[j]=N%10;
				N /= 10;
			}
			
			int gap = 0;
			for(int k=0; k<len-1; k++) {
				gap = arr[k]-arr[k+1];
				set.add(gap);
			}
			if(set.size() == 1) ans++;
			set.clear();
			
			}
		System.out.println(ans);
	}
	
}

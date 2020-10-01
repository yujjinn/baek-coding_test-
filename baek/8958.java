import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str [] = new String[n];
		for(int i =0; i<n; i++) {
			str[i]=sc.nextLine();
		}
		
		for(int k=0; k<n; k++) {
			int sum = 0 ;
			int cnt = 0 ; 
			char ch [] = str[k].toCharArray();
			for(char c : ch) {
				if(c == 'O') {
					sum+=(++cnt);
				}
				else {
					cnt = 0; 
				}
			}
			System.out.println(sum);
			
		}
	}
}

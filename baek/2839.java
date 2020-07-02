import java.util.*;
public class Main {
	public static int answer = 0xFFFFF ;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n>=3 && n<=5000
		
		if(n%5 ==0) {
			System.out.println(n/5);
			return;
		}
		else if(n%3 == 0) {
			answer = n/3;
		}
		
		int cnt = 0; 
		while(n>5) {
			cnt ++;
			n-=5;
			if(n%3 == 0 ) {
				int cur = cnt + n/3;
				if( cur < answer) {
					answer = cur;
				}
			}
		}
		
		answer =( answer != 0xfffff ? answer : -1 ) ;
		System.out.println(answer);
	}
	
}

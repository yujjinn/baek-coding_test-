import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int beg = n/10; // 십의 자리
        int end = n%10; // 일의 자리
        int sum = 0 ; // 새로운 수
        int cnt = 0 ; // 횟수
        
        while(true) {
        	if(cnt >0 && (beg+""+end).equals((n/10)+""+(n%10))) {
        		break;
        	}
        	cnt+=1;
        	sum = beg + end;
        	beg = end%10;
        	end = sum%10;
        }
        System.out.println(cnt);
	}
}

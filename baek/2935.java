import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String and = sc.nextLine();
		String b = sc.nextLine();
		
		if(and.equals("*")) {
            // 곱하기
			int sum = a.length()+b.length()-2;
			String repeat = String.join("", Collections.nCopies(sum, "0"));
			
			System.out.println("1"+repeat);
		}
		else {
            // 더하기
			if(a.length()>b.length()) {
				int big_len = a.length();
				int sm_len = b.length();
				System.out.println(a.substring(0, big_len-sm_len)+b);
			}
			else if(a.length()<b.length()){
				int big_len = b.length();
				int sm_len = a.length();
				System.out.println(b.substring(0, big_len-sm_len)+a);
				
			}
			else {
				// 같은 자리수 
				System.out.println("2"+a.substring(1, a.length()));
			}
		}
	}
}

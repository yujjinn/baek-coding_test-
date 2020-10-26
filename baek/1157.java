import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toLowerCase(); // 대소문자 구분하지 않기 때문에
		char ch [] =str.toCharArray();
		
		int alpha [] = new int[27]; // 알파벳 저장
		
		for(char c : ch) { // 갯수 구하기
			alpha[c-96]++;
		}
		int max = 0 ; int cnt = 0 ; int max_idx = 0 ;
		for(int a : alpha) if(max < a) max = a;
		for(int a : alpha) if(a == max) cnt+=1;
		
		if(cnt > 1) {
			System.out.println("?");
			return ;
		}
		
		max = 0; 
		for(int i =0; i<27; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				max_idx = i;
			}
		}
		
		System.out.println((char)('a'+max_idx-33));
	}
}

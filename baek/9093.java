import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s[] = new String[n];
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<n; i++) {
			String str = sc.nextLine();
			s[i]=str;
		}
		for(String sr : s) {
			String sp[] = sr.split(" " );
			for(String splits : sp) {
				sb.append(reverse(splits)+" ");
			}
			sb.substring(0, sb.length()-1);
			System.out.println(sb);
			sb = new StringBuilder();
		}
		
	}
	static String reverse(String s) {
		String ans = "";
		char ch [] = s.toCharArray();
		for(int i =0; i<s.length(); i++) {
			ans+=ch[s.length()-1-i];
		}
		return ans;
	}
}

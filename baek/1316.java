import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = Integer.parseInt(sc.nextLine());
		int ans = 0; 
		
		for(int i=0; i<n ;i++) {
			ans += findGroup(sc.nextLine());
		}
		System.out.println(ans);
	}
	static int findGroup(String s ) {
		
		StringBuilder sb = new StringBuilder();
		
		int len = s.length();
		char bf = s.charAt(0);
		sb.append(bf+"");
		
		for(int i=1; i<len; i++) {
			if(bf==s.charAt(i)) {
				// 이전 문자와 같다면 (압축 발생)
				continue;
			}
			else {
				bf = s.charAt(i);
				sb.append(bf+"");
			}
		}

		//압축 문자열
		String zip = sb.toString();
		char ch[] = zip.toCharArray();
		int arr[] = new int[27];
		for(int i=0; i<ch.length; i++) {
			arr[ch[i]-97]++;
			if(arr[ch[i]-97]>1)return 0;
		}
		
		return 1;
	}
	
}

import java.util.*;
public class Main {
	static char ch [];
	static boolean visited[] ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String n[]= num.split(" ");
		
		int l = Integer.parseInt(n[0]);
		int c = Integer.parseInt(n[1]);
		
		String str[] = sc.nextLine().split(" ");
		
		ch = new char[str.length];
		visited = new boolean[c+1];
		
		for(int i=0; i<c; i++)
			ch[i]=str[i].charAt(0);
	
		Arrays.sort(ch);
		
		comb(0, c, l);

	}
	 static void comb( int start, int n, int r) {
	        if (r == 0) {
	            print(n);
	            return;
	        }
	        for (int i = start; i < n; i++) {
	            visited[i] = true;
	            comb(i + 1, n, r - 1);
	            visited[i] = false;
	        }
	}
	static void print(int num) {
		int mo = 0;
		int ja = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num; i++) {
			if(visited[i]) {
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' 
					||	ch[i]=='o'|| ch[i]=='u') {mo++;}
				else {ja++;}
				sb.append(ch[i]);
			}
		}
        // 최소 한 개의 모음, 최소 두 개의 자음
		if(mo>=1 && ja>=2)System.out.println(sb);
	}
}

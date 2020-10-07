import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String arr[] = new String[t];
		int h=0,w=0,n=0,f=0,cnt=0;
		for(int i=0; i<t; i++) {
			String str = "";
			h=sc.nextInt();
			w=sc.nextInt();
			n=sc.nextInt();
			if(n%h==0) {
				str+=h;
				cnt = n/h;
				if(cnt>=1 && cnt<10)
					str+="0";
				str+=cnt;
				arr[i]=str;
			}
			else {
				f = n%h;
				cnt = n/h+1;
				str+=f;
				if(cnt>=1 && cnt<10)
					str+="0";
				str+=cnt;
				arr[i]=str;	
			}
		}
		for(String s : arr) {
			System.out.println(s);
		}
	}
}

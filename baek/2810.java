import java.util.*;

public class Main {

	public static void main(String[] args){
		int answer = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char ch[] = s.toCharArray();
	
		for(int i =0; i<n; i++) {
			if(ch[i]=='S') {
				answer+=1;
			}
			else if(ch[i]=='L') {
				i++;
				answer+=1;
			}
		}
		System.out.println(Math.min(answer,n));
		
	}

}
​

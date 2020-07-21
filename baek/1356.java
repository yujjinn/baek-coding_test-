import java.util.*;

public class Main
{
	public static void main(String[] args)  {
		int answer = 0; 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		int arr[] = new int[ch.length];
		for(int i=0; i<ch.length; i++) {
			arr[i]=ch[i]-48;
		}
		if(check(arr)) {System.out.println("YES");}
		else{System.out.println("NO");};
		
	}
	public static boolean check(int arr[]) {
		boolean flag = false;
		int len = arr.length;
		int mul1 = 1;
		int mul2 = 1;
		for(int k=0;k<len-1;k++) {
			for(int i=0; i<=k; i++ ) {
				mul1*=arr[i];
			}
			for(int j=k+1; j<len; j++) {
				mul2*=arr[j];
			}
			if(mul1==mul2) {return true;}
			mul1=mul2=1;
		}
		return flag;
	}

}
​

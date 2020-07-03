// math 
// dp
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		if(n == 1) {
			System.out.println(5);
			return;
		}
		arr[0]=5;
		for(int i=1; i<n ; i++) {
			arr[i] += (arr[i-1] +  3*i + 4);
            arr[i] %= 45678;
		}
		System.out.println(arr[n-1]);
	}

}

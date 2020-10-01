import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextLine();
		}
		
		for(String s : arr) {
            int len = s.length();
			System.out.println(s.substring(0,1).toUpperCase()+s.substring(1, len));
		}
	
	}
}

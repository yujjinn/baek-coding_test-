// math
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String tmp[] = br.readLine().split(" ");
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
         for(int i=0; i<n; i++) {
        	arr[i]=Integer.parseInt(tmp[i]);
        }
        for(int i=n-1; i>=0; i--) {
        	list.add(arr[i], i+1);
        }
        
        for(int l : list) {
        	System.out.print(l + " ");
        }System.out.println("");
	}

}

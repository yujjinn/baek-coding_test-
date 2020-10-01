import java.util.*;

public class Main
{
	static int arr[];
    public static void main(String[] args) {
    	int answer = 1 ;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       arr = new int[n];
       for(int i=0;i<n; i++) {
    	   arr[i]=sc.nextInt();
       }
       Arrays.parallelSort(arr);
       int max = arr[n-1]+1;
       for(int i=n-2; i>=0; i--) {
    	   int k = arr[i]+n-i;
    	   if(max > arr[i]+n) {
    		   break;
    	   }
    	   max = k>max?k:max;
    	   answer+=1;
       }
       System.out.println(answer);
    }

}

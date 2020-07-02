import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long i = 1;
        long sum = 0;
        // 3미만이면 하나 밖에 못 더함
        if(n < 3){
            System.out.println(i);
            return ; 
        }
        i = (long)Math.sqrt(n);
        while(sum <= n){
            sum = (i*(i+1))/2;
            //System.out.println("sum "+ sum) ;
            if(sum > n ){
            	if(sum-n < i) {
            		i=i-1;	
            	}
            	else {
            		i = i+1;
            	}
                break;
            }
            else if (sum == n ){
                break;
            }
            else {
            	i=i+1;
            }
        }
        System.out.println(i);
	}
	
}

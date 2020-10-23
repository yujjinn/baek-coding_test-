import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        if(str.length()>0){
            String arr[] = str.split(" ");
            System.out.println(arr.length);
        }
        else{
            System.out.println(0);
        }
        
	}
}

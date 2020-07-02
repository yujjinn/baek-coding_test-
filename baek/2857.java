//문자열 처리
import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
 		for(int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String fbi = st.nextToken();
			if(fbi.contains("FBI")){
                list.add(i+1);
            }
		}
        
        if(list.size() == 0 ){
            System.out.println("HE GOT AWAY!");
        }
        else{
            for(int k : list){
                System.out.print(k+" " );
            }
        }
    }
}

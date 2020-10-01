import java.util.*;
public class Main {
    static int MAX = 123456*2;
	  static ArrayList<Integer> list = new ArrayList<>();
	  static ArrayList<Integer> countNum = new ArrayList<>();
    static ArrayList<Boolean> primeList = new ArrayList<Boolean>(MAX+1);
	public static void main(String[] args) {
    // 에라토스테네스의 체 알고리즘 이용
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		for(int i=2; i<=MAX; i++ )
			primeList.add(i, true);
 
		for(int i=2; (i*i)<=MAX; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=MAX; j+=i) primeList.set(j, false);
			}
		}
        Scanner sc = new Scanner(System.in);
        int n = -1; 
        while(n!=0){
            n = sc.nextInt();
            if(n!=0)list.add(n);
        }
        int cnt = 0; 
        for(int num : list){
            cnt =0;
            for(int i=num+1; i<=2*num; i++){
			    if(primeList.get(i)) cnt++;
		    }
            countNum.add(cnt);
        }
        
        for(int c : countNum){
            System.out.println(c);
        }
		
	}
}

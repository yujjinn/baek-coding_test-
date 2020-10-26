import java.util.*;
public class Main {
	public static void main(String[] args) {
		int max = 1000;
		ArrayList<Integer> prime = new ArrayList<>(max+1);
		// 0과 1은 애초에 소수가 아님
        prime.add(0);prime.add(0);
		//1로 초기화
		for(int i=2; i<=max; i++) {
			prime.add(i, 1);
		}
		
		for(int i=2; i<=max; i++) {
			if(prime.get(i)==1)
			for(int j=i*i; j<=max; j+=i) {
				prime.set(j, 0); // ArrayList 수정 -> set
			}
		}

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0; 
        for (int i = 0; i<n;i++) {
        	int k = sc.nextInt();
        	if(prime.get(k)==1) {cnt++;}
        }
        System.out.println(cnt);
	}
}

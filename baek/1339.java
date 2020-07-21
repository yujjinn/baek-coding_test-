import java.util.*;
import java.io.*;

public class Main
{
	static ArrayList<String> str = new ArrayList<>();
	static HashSet<Character> set = new HashSet<>(); 
	static HashMap<Character, Integer> map = new HashMap<>();
	static int max = Integer.MIN_VALUE;
	static boolean visited[]= new boolean[10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		char ch [];
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			str.add(s);
			ch = s.toCharArray();
			for(char c : ch) {
				set.add(c);
			}
		}
	
		int arr[] = new int[10];
		perm(arr, 0, set.size());
		System.out.println(max);
	}
	
	
	public static void perm(int arr[], int depth, int n) {

		if(depth == n) {
			check(arr, depth);
		}
		
		for(int i=9; i>-1; i--) {
			if(!visited[i]) {
				visited[i]=true;
				arr[depth]=i;
				perm(arr, depth+1, n);
				visited[i]=false;	
			}
		}
	}
	public static void check(int arr[] , int n) {
		int answer = 0;
		int cnt = 0;
		Iterator<Character> it= set.iterator();
		while(it.hasNext()){
			map.put(it.next(),arr[cnt++]);
		}

		for(String s : str) {
			int len = s.length();
			int ten = 1;
			int sum = 0; 
			char ch[] = s.toCharArray();
			
			for(int i=len-1; i>=0; i--) {
				sum+=(map.get(ch[i])*ten);
				ten *=10;
			}
			answer += sum;
		}

		if(answer > max) {max = answer;}
	}
}

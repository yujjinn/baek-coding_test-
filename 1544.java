	// 문자열 처리
  
  import java.util.*;
  import java.io.*;
  
  class Main{
  
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	String s = br.readLine();
        	if(set.size() == 0 ) {
        		set.add(s); 
        		System.out.println(set);
        	}
        	if(!set.contains(s)) {
        		if(!check(set, s)) {
        			System.out.println("add");
        			set.add(s);
        		}
        	} 	
        }
        
        System.out.println(set.size());
	}
	public static boolean check(HashSet<String> set, String s) {
		boolean result = false;
		
		StringBuilder sb = new StringBuilder(s);
		int len = s.length();
		for(int i=0; i<len-1; i++) {
			sb = sb.append(sb.charAt(0)).deleteCharAt(0);
			System.out.println(sb);
			
			if(set.contains(sb.toString())) {
				result = true;
				break;
			}
		}
		
		
		return result;
	}

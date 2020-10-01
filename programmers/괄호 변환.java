class Solution {
    public String solution(String p) {
		return corr(p);
	}
	 
	public static String corr(String p) {
		if(p.equals("")) return "";
		
		int idx = div(p);
		String u = p.substring(0, idx);
		String v = p.substring(idx, p.length());
		
		if(balance(u)) {
			return u+corr(v);
		}
		else {
			String tmp = "("+corr(v)+")";
			u = u.substring(1, u.length()-1);
			u = rev(u);
			return tmp+u;
		}
		
	}
	public static int div(String p ) {
		int op = 0 ;
		int cl = 0;
		
		for(int i =0; i<p.length(); i++) {
			if(p.charAt(i)=='(') {
				op++;
			}
			else {
				cl++;
			}
			if(op==cl) {
				return i+1;
			}
		}
		return p.length()-1;
		
	}
	
	public static boolean balance(String p ) {
        int count = 0;
        for(int i = 0 ; i < p.length(); i++) {
            if(p.charAt(i) == '(') {
                count++;
            }else
                count--;
            if(count < 0)
                return false;
        }
        return true;
	}
	public static String rev(String p ) {
		String ans="";
		for(int i =0; i<p.length(); i++) {
			if(p.charAt(i)=='(') {
				ans+=")";
			}
			else {
				ans+="(";
			}
		}
		return ans;
	}  
}

import java.util.*;

class Solution {
	static Set<String> set = new HashSet<>();
	static Set<Integer> fset = new HashSet<>();
	static Set<String> finalset = new HashSet<>();
	static Set<Integer> st = new HashSet<>();
	static int answer = 0 ;
    static int row = 0; 
    static int col = 0; 
    public int solution(String[][] relation) {
       row = relation.length;
       col = relation[0].length;
       int arr[] = new int[col];
       boolean  visited[] = {};
       for(int i =0; i<col; i++) {
    	   arr[i]=i;
       }
       visited = new boolean[arr.length];
       for(int i=1; i<=arr.length; i++) {
    	   comb(arr, visited, 0, arr.length, i , relation);
       }
       
       return finalset.size(); 
	}
	
	static void comb(int arr[] , boolean visited[] , int start, int n, int r, String relation[][]) {
		if(r==0) {
			Nprint(arr, visited, n, relation);
			return ;
		}
        for (int i = start; i < n; i++) {
            visited[i] = true;
            comb(arr, visited, i + 1, n, r - 1, relation);
            visited[i] = false;
        }
	}
	static void Nprint(int arr[], boolean[] visited, int n, String relation[][]) {
		ArrayList<Integer> list = new ArrayList<>(); 
		ArrayList<Integer> cand = new ArrayList<>();
		String s = "";
		String listCand = "";
		boolean flag = false;
		int cnt = 0 ;
		int len_split = 0; 
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
            	listCand+=(arr[i]+" ");
            	st.add(arr[i]);
            }
        }
        //System.out.println("------ " + st+ " -------"); 
        // 조합 구하기 - st
        int com[] = st.stream().mapToInt(i->i).toArray();
        for(int i=0; i<row; i++) {
     	   for(int j=0; j<com.length; j++) {
     		   s+=relation[i][com[j]];
     	   }
 		   set.add(s);
 		   s="";
        }
        // set의 사이즈가 유일성을 말해줌
        
        if(set.size() == row){
        	//System.out.println("유일성은 만족시킴" + st);
        	if(finalset.isEmpty()) {
        		finalset.add(listCand);
        	}
        	else {
        		// st의 인자와 finalset의 인자와 비교
        		for(String fs : finalset) {
        			String split[] = fs.split(" ");
        			len_split = split.length;
        			for(String sp : split) {
        				for(int hs : st) {
        					//System.out.println("sp " + sp + " hs " +hs);
        					if(sp.equals(hs+"")) {
        						cnt++;
        					}
        				}
        				//System.out.println(len_split+" " + cnt);
        				if(len_split == cnt) {
        					flag = true;
        					break;
        				}
        				
        			}
        			cnt =0 ;
        		}
        		if(!flag) {
        			finalset.add(listCand);
        		}
        	}
        }
       
        st.clear();
        set.clear();
	}	

}

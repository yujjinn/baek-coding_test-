class Solution {
	public static boolean[]flag;

	public int solution(int n, int[][] computers) {
		int answer = 0;
		flag = new boolean[n];
		
        for(int i = 0; i < n; i++) {
        	if(!flag[i]) {
        		dfs(i, n, computers);
        		answer++;
                
        	}
        }
		return answer;
    }
    public void dfs( int idx, int n, int arr[][]) {
    
		for(int i = 0; i < n; i++) {			
			if(arr[idx][i] == 1 && !flag[i]) {
            
				flag[i] = true;
				dfs(i, n, arr);
			}
		}
	}
}

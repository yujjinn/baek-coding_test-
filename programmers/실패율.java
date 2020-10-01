import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
		Map<Integer, Double> map = new HashMap<>();
		int len = stages.length;
		int[] answer = new int[N];
		int cnt = 0; 
		for(int i=1; i<=N; i++) {
			cnt = 0;
			for(int s : stages) {
				if(i == s) {
					cnt++;
				}
			}
            if(cnt ==  0 ){
                map.put(i, 0.0);
            }
            else{
             map.put(i, (double)cnt/len);   
            }
			len-=cnt;
		}
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		int idx = 0 ;
        for(Integer key : keySetList) {
        	answer[idx++]=key;
		}
		return answer;
    }
}

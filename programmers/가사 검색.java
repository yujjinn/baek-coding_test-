class Solution {
    public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];
		int qur_len = 0; 
		int start = 0 ;
		int end = 0; 
		int idx = 0; 
		int cnt = 0; 
		for(String q : queries) {
			qur_len = q.length();
			start = q.indexOf("?");
			end = q.lastIndexOf("?");
			for(String word : words) {
				// 일단 길이 부터 맞는지 확인
				if(word.length() == qur_len) {
					// 접두사
					if(start == 0 ) {						
						if(word.substring(end+1, qur_len).equals(q.substring(end+1, qur_len)))
							cnt++;
					}
					// 접미사
					else if(end == qur_len-1) {
						if(word.substring(0, start).equals(q.substring(0, start)))
							cnt++;
					}
				}
			}
			answer[idx++]=cnt;// 배열 인덱스
			cnt =0; 
		}

		return answer;
	}
}

import java.util.*;
class Solution {
    public static Map<String, String> map = new HashMap<>();
	public static ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[] record) {
		String answer[] = {}; 
		for(String s: record) {
			String split[] = s.split(" ");// 분류
			if(split[0].equals("Enter") || split[0].equals("Change")) {
				map.put(split[1], split[2]);
			}
		}
		for(int i=0; i<record.length; i++) {
			String split[] = record[i].split(" ");// 분류
			if(split[0].equals("Enter")) {
				list.add(map.get(split[1])+"님이 들어왔습니다.");
			}
			else if (split[0].equals("Leave")) {
				list.add(map.get(split[1])+"님이 나갔습니다.");			
			}
		}
		answer = new String[list.size()];
		answer = list.toArray(answer);

		return answer;
    }
}

import java.util.*;
import java.io.*;

public class Main
{
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		int answer = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		for(int i=0; i<s.length();i++) {
			answer +=1;
			if(s.contains("c=")) {
				s = s.replaceFirst("c=", " ");
			}
			else if(s.contains("c-")) {
				s = s.replaceFirst("c-", " ");
			}
			else if(s.contains("dz=")) {
				s = s.replaceFirst("dz=", " ");
			}
			else if(s.contains("d-")) {
				s = s.replaceFirst("d-", " ");
			}
			else if(s.contains("lj")) {
				s = s.replaceFirst("lj", " ");
			}
			else if(s.contains("nj")) {
				s = s.replaceFirst("nj", " ");
			}
			else if(s.contains("s=")) {
				s = s.replaceFirst("s=", " ");
			}
			else if(s.contains("z=")) {
				s = s.replaceFirst("z=", " ");
			}	
			else {
				answer--;
			}
		}
		char ch [] = s.toCharArray();
		for(char c : ch) {
			if(c != ' ') {answer +=1;}
		}
		System.out.println(answer);
	}
	

}

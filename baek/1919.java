import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 char s[]=br.readLine().toCharArray();
		 char ss[]=br.readLine().toCharArray();
		 int alpha[] = new int[26];
		 int alpha2[] = new int[26];
		 for(int i=0; i<s.length; i++) {
			 alpha[s[i]-97]+=1;
		 }
		 for(int i=0; i<ss.length; i++) {
			 alpha2[ss[i]-97]+=1;
		 }

		 int sum=0;
		 for(int i=0; i<26; i++) {
			 if(alpha[i]!=alpha2[i]) {
				 sum+=(Math.abs(alpha[i]-alpha2[i]));
			 }
		 }
		 System.out.println(sum);
	}	
}
​

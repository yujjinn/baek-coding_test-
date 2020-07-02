// dfs

import java.util.*;
import java.io.*;

class Main {
	public static StringBuilder sb = new StringBuilder("");
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while(true) {
        	s = br.readLine();
        	if(s.equals("0")) break;
        	String str[] = s.split(" ");
        	int len = Integer.parseInt(str[0]);
        	int arr[] = new int[len];
        	boolean visited[] = new boolean[len];
         	for(int i=0; i<len ; i++) {
        		arr[i]=Integer.parseInt(str[i+1]);
        	}
        	dfs(arr, visited, 0 , len, 0);
        	sb.append("\n");
        }
        System.out.println(sb);
	}
	public static void dfs(int arr[] , boolean [] visited, int start , int n, int r) {
		if(r == 6) {
			printResult(arr, visited, n);
		}
		for(int i=start; i<n; i++) {
			visited[i]=true;
			dfs(arr, visited, i+1, n, r+1);
			visited[i]=false;
		}
	}

	public static void printResult(int arr[], boolean visited[] , int n ) {
		for(int i=0; i<n; i++) {
			if(visited[i]==true)sb.append(arr[i]+ " ");
		}sb.append("\n");
	}
}

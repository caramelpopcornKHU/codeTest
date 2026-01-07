package test01;

import java.io.*;
import java.util.*;

public class Test {
	
	public int solution(String str, char c) {
		int answer = 0;
		c = Character.toUpperCase(c);
		for(char x : str.toUpperCase().toCharArray()) {
			if(x == c)
				answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Test T = new Test();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		st = new StringTokenizer(br.readLine());
		char c = st.nextToken().charAt(0);
		
		System.out.println(T.solution(str, c));
		
	}
}

package test03;

import java.util.*;
import java.io.*;

public class Main6 {

	public int solution(int n) {
		int answer = 0;

		int cnt = 1;
		n--;
		
		while(n>0) {
			cnt++;
			n = n - cnt;
			if(n%cnt == 0)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main6 T = new Main6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine(), 10);

		System.out.println(T.solution(n));

	}

}

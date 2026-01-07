package test03;

import java.util.*;
import java.io.*;

public class Main4 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		int lt = 0, sum = 0;

		// gemini풀이
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			
			while(sum > m) {
				sum -= arr[lt++];
			}
			
			if(sum == m) {
				answer++;
			}
		}

		// 강사 풀이
//		for (int rt = 0; rt < n; rt++) {
//			sum += arr[rt];
//			if(sum == m) answer++;
//			
//			while(sum >= m) {
//				sum -= arr[lt++];
//				if(sum == m) answer++;
//			}
//		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, m, arr));

	}

}

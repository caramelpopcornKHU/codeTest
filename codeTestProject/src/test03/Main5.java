package test03;

import java.util.*;
import java.io.*;

public class Main5 {

	public int solution(int n) {
		int answer = 0;
		// 수학적 풀이
		int cnt = 1;
		n--;
		while (n > 0) {
			cnt++;
			n -= cnt;
			if (n % cnt == 0)
				answer++;
		}

		// 알고리즘 풀이
//		int m = n / 2  + 1;
//		int[] num = new int[m+1];
//		
//		
//		for(int i = 1; i <= m; i++) {
//			num[i] = i;
//		}
//		
//		int lt = 1, sum = 0;
//		
//		for (int rt = 1; rt <= m; rt++) {
//			sum += num[rt];
//			
//			while(sum > n) {
//				sum -= num[lt++];
//			}
//			
//			if(sum == n) {
//				answer++;
//			}
//			
//		}

		return answer;
	}
//	public int solution(int n) {
//		int answer = 0;
//
//		int sum = 0, lt = 1;
//
//		for (int rt = 1; rt < n; rt++) {
//			sum += rt;
//
//			// sum이 n 보다 커지면 죽이는 로직
//			while (sum > n) {
//				sum -= lt++;
//			}
//
//			if (sum == n) {
//				answer++;
//			}
//		}
//
//		return answer;
//	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine(), 10);

		System.out.println(T.solution(n));

	}

}

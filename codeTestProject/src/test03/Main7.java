package test03;

import java.util.*;
import java.io.*;

public class Main7 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		int cnt = 0;
		int lt = 0;
		int max = 0;
		
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				cnt++;
			}
			
			
			if(cnt > m) {
				while(lt<rt) {
					lt++;
					if(arr[lt]==0) {
						break;
					}
				}
				cnt--;
			}

			answer = Math.max(answer, rt - lt);
		}

		return answer;
	}
	
//	public int solution(int n, int k, int[] arr) {
//		int answer = 0;
//
//		int cnt = 0;
//		int lt = 0;
//
//		for (int rt = 0; rt < n; rt++) {
//
//			if (arr[rt] == 0) {
//				cnt++;
//			}
//			while (cnt > k) {
//				if (arr[lt] == 0) {
//					cnt--;
//				}
//				lt++;
//			}
//
//			answer = Math.max(answer, rt - lt + 1);
//		}
//
//		return answer;
//	}

	public static void main(String[] args) throws IOException {
		Main7 T = new Main7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken(), 10);
		int[] arr = new int[n];
		int k = Integer.parseInt(st.nextToken(), 10);

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, k, arr));

	}

}

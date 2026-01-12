package test06;

import java.io.*;
import java.util.*;

public class Main5 {

	// 정렬로도 풀 수 있다. O(nlog(n))
	public char solution(int n, int[] arr) {
		char answer = 'U';

		Arrays.sort(arr);

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] == arr[i]) {
				answer = 'D';
				break;
			}
		}

		return answer;
	}

	// HashMap으로 풀면 O(n)으로 풀 수 있음
//	public char solution(int n, int[] arr) {
//		char c = 'U';
//
//		HashMap<Integer, Integer> tm = new HashMap<>();
//		for (int x : arr) {
//			tm.put(x, tm.getOrDefault(x, 0) + 1);
//		}
//
//		for (int x : tm.keySet()) {
//			if (tm.get(x) > 1) {
//				c = 'D';
//				break;
//			}
//		}
//
//		return c;
//	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, arr));

	}

}

package test06;

import java.io.*;
import java.util.*;

public class Main4 {

	public int[] solution(int s, int n, int[] arr) {
		// 캐시 메모리
		int[] cache = new int[s];

		// 모든 작업큐 내용
		for (int x : arr) {
			int pos = -1;

			// 캐시 처음부터 끝까지 훑기
			for (int i = 0; i < s; i++) {
				if (x == cache[i])
					pos = i;
			}

			// cache miss 상황
			if (pos == -1) {
				for (int i = s - 1; i > 0; i--) {
					cache[i] = cache[i - 1];
				}
			}
			// cache hit 상황
			else {
				for (int i = pos; i > 0; i--) {
					cache[i] = cache[i - 1];
				}
			}
			cache[0] = x;
		}

		return cache;
	}

	// 내가 푼 풀이 2
//	public int[] solution(int s, int n, int[] arr) {
//
//		// 캐시 메모리
//		int[] cache = new int[s];
//
//		// 작업 큐에 쏘는 내용
//		for (int i = 0; i < n; i++) {
//			boolean flag = false;
//			int idx = -1;
//			// 캐시 처리 부분
//			for (int j = 0; j < s; j++) {
//				if (cache[j] == arr[i]) {
//					flag = true;
//					idx = j;
//					break;
//				}
//			}
//
//			// 캐시에 있는 경우/ cache hit
//			if (flag) {
//				for (int k = idx; k > 0; k--) {
//					cache[k] = cache[k - 1];
//				}
//				cache[0] = arr[i];
//			}
//			// 캐시에 없는 경우
//			else {
//				for (int k = s - 1; k > 0; k--) {
//					cache[k] = cache[k - 1];
//				}
//				cache[0] = arr[i];
//			}
//
//		}
//
//		return cache;
//	}

	// 내가 푼 풀이 1
//	public int[] solution(int s, int n, int[] arr) {
//		Deque<Integer> stack = new ArrayDeque<>();
//
//		// 모든 작업을 위한 반복문
//		for (int i = 0; i < n; i++) {
//
//			if (stack.contains(arr[i])) {
//				stack.remove(arr[i]);
//				stack.push(arr[i]);
//
//			} else {
//				stack.push(arr[i]);
//
//			}
//
//			if (stack.size() > s)
//				stack.pollLast();
//		}
//
//		int[] sArr = new int[s];
//		for (int i = 0; i < s; i++) {
//			sArr[i] = stack.pop();
//		}
//
//		return sArr;
//	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 출력 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int x : T.solution(s, n, arr)) {
			bw.write(x + " ");
		}
		bw.flush();

	}

}

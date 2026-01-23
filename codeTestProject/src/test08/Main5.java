package test08;

import java.io.*;
import java.util.*;

public class Main5 {

	static int n, m, answer = Integer.MAX_VALUE;

	public void DFS(int L, int sum, Integer[] arr) {

		if (sum > m)
			return;

		if (L >= answer)
			return;

		if (sum == m) {
			answer = Math.min(L, answer);

		} else {
			for (int x : arr) {
				DFS(L + 1, sum + x, arr);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 내림차순
		Arrays.sort(arr, Collections.reverseOrder());

		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());

		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

	// 내 풀이
//	static int n, m, L = 0;
//	static int[] arr, ch;
//
//	public void BFS(int v) {
//		Deque<Integer> Q = new ArrayDeque<Integer>();
//		Q.offer(v);
//
//		while (!Q.isEmpty()) {
//			int size = Q.size();
//			for (int i = 0; i < size; i++) {
//				int nv = Q.poll();
//
//				if (nv == 0) {
//					System.out.println(L);
//					return;
//				}
//
//				for (int x : arr) {
//
//					if ((nv - x) >= 0 && ch[nv - x] == 0) {
//						ch[nv - x] = 1;
//						Q.offer(nv - x);
//					}
//
//				}
//
//			}
//
//			L++;
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main5 T = new Main5();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		arr = new int[n];
//
//		ch = new int[501];
//
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//
//		st = new StringTokenizer(br.readLine());
//		m = Integer.parseInt(st.nextToken());
//		ch[m] = 1;
//		T.BFS(m);
//
//	}

}

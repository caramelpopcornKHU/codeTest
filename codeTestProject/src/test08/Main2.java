package test08;

import java.io.*;
import java.util.*;

public class Main2 {

	// 강사님 풀이
	static int answer = Integer.MIN_VALUE, c, n;

	public void DFS(int L, int sum, int[] arr) {
		// c 무게를 넘어가면 더 이상 볼 필요가 없어
		if (sum > c)
			return;
		
		if (L == n) {
			answer = Math.max(answer, sum);
		} else {
			// 넣는다.
			DFS(L + 1, sum + arr[L], arr);
			// 넣지 않는다.
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

	// 내 풀이
	// static int[] ch, arr;
	// static int c, n, answer;

	// public void DFS(int v) {
	// if (v == n) {
	// int sum = 0;
	// for (int i = 0; i < n; i++) {
	// if (ch[i] == 1) {
	// sum += arr[i];
	// }
	// }
	// if (sum < c)
	// answer = Math.max(answer, sum);
	// } else {
	// ch[v] = 1;
	// DFS(v + 1);
	// ch[v] = 0;
	// DFS(v + 1);

	// }
	// }

	// public static void main(String[] args) throws IOException {
	// Main2 T = new Main2();
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// StringTokenizer st = new StringTokenizer(br.readLine());

	// c = Integer.parseInt(st.nextToken());
	// n = Integer.parseInt(st.nextToken());
	// ch = new int[n];
	// arr = new int[n];

	// for (int i = 0; i < n; i++) {
	// st = new StringTokenizer(br.readLine());
	// arr[i] = Integer.parseInt(st.nextToken());
	// }

	// ch[0] = 0;
	// T.DFS(0);
	// System.out.println(answer);

	// }

}

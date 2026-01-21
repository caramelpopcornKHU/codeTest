package test08;

import java.io.*;
import java.util.*;

public class Main {
	// 강사님 풀이
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;

	public void DFS(int L, int sum, int[] arr) {
		// 이미 답이 나와버리면 더 이상 계산할 필요 없다.
		if (flag)
			return;
		// 만약에 {포함한다 집합}이 커져버리면 확인 할 필요 없다.
		if (sum > total / 2)
			return;

		if (L == n) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);

	}

	// 내 풀이
//	static HashMap<Integer, Integer> answer;
//	static int[] arr, ch;
//	static int n, cnt;
//
//	public void DFS(int v) {
//
//		if (v == n) {
//			int sum1 = 0;
//			int sum2 = 0;
//			for (int i = 0; i < n; i++) {
//				if (ch[i] == 1) {
//					sum1 += arr[i];
//				} else {
//					sum2 += arr[i];
//				}
//			}
//
//			answer.put(sum1, sum2);
//
//		} else {
//
//			ch[v] = 1;
//			DFS(v + 1);
//			ch[v] = 0;
//			DFS(v + 1);
//
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main T = new Main();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		cnt = 0;
//
//		arr = new int[n];
//		ch = new int[n];
//		answer = new HashMap<Integer, Integer>();
//
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//
//		ch[0] = 1;
//		T.DFS(0);
//		boolean flag = false;
//		for (int x : answer.keySet()) {
//
//			if(x == answer.get(x)) {
//				flag = true;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		}
//		
//
//	}

}

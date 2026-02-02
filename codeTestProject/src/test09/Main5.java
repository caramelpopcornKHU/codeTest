package test09;

import java.io.*;
import java.util.*;

public class Main5 {

	static int n, m;
	static int[] ch, answer;
	static int[][] arr;

	public void DFS(int cv, int sum) {

		answer[cv] = Math.min(answer[cv], sum);

		for (int i = 1; i <= n; i++) {
			if (arr[cv][i] > 0 && ch[i] == 0) {
				ch[cv] = 1;
				DFS(i, sum + arr[cv][i]);
				ch[cv] = 0;
			}

		}
	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][n + 1];
		ch = new int[n + 1];

		answer = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			answer[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());

			arr[from][to] = value;

		}

		ch[1] = 1;
		T.DFS(1, 0);

		for (int i = 2; i <= n; i++) {
			if (answer[i] != Integer.MAX_VALUE)
				System.out.println(i + " : " + answer[i]);
			else
				System.out.println(i + " : impossible");

		}

	}

}

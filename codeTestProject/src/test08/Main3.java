package test08;

import java.io.*;
import java.util.*;

public class Main3 {
	static ArrayList<ArrayList<Integer>> arr;
	static int n, m;
	static int answer = Integer.MIN_VALUE;

	public void DFS(int L, int sSum, int tSum) {

		if (tSum > m) {
			return;
		}

		if (L == n) {
			answer = Math.max(answer, sSum);
		} else {
			DFS(L + 1, sSum, tSum);
			DFS(L + 1, sSum + arr.get(L).get(0), tSum + arr.get(L).get(1));
		}
	}

	public static void main(String[] args) throws IOException {
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			arr.get(i).add(a);
			arr.get(i).add(t);

		}
		// l sum
		T.DFS(0, 0, 0);

		System.out.println(answer);

	}

}

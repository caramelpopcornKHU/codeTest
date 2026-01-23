package test08;

import java.io.*;
import java.util.*;

public class Main7 {

	static int[][] arr;

	public int DFS(int n, int r) {

		if (n == r - 1)
			return n;
		if (n == r || r == 0) {
			return 1;
		} else if (r == 1) {
			return n;
		} else {
			if (arr[n][r] == 0) {
				arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
				return arr[n][r];
			} else
				return arr[n][r];
		}

	}

	public static void main(String[] args) throws IOException {
		Main7 T = new Main7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][r + 1];

		System.out.println(T.DFS(n, r));

	}

}

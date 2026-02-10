package test10;

import java.io.*;
import java.util.*;

public class Main5 {

	static int n, m;
	static int[] dy;

	public int solution(int[] coin) {
		Arrays.fill(dy, Integer.MAX_VALUE);

		dy[0] = 0;

		for (int i = 0; i < n; i++) {
			for (int j = coin[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			}
		}

		return dy[m];

	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		dy = new int[m + 1];
		System.out.println(T.solution(arr));

	}

}

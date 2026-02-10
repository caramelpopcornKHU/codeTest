package test10;

import java.io.*;
import java.util.*;

public class Main {

	static int[] dy;

	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for (int i = 3; i <= n; i++) {
			dy[i] = dy[i - 1] + dy[i - 2];
		}

		return dy[n];
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		dy = new int[n + 1];

		System.out.println(T.solution(n));

	}
}

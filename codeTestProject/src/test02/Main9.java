package test02;

import java.util.*;
import java.io.*;

public class Main9 {

	public int solution(int n, int[][] map) {
		int answer = 0;
		// 행의 합
		for (int i = 0; i < n; i++) {
			int tmp1 = 0;
			int tmp2 = 0;
			for (int j = 0; j < n; j++) {
				tmp1 += map[i][j];
				tmp2 += map[j][i];
			}
			answer = Math.max(answer, tmp1);
			answer = Math.max(answer, tmp2);
		}

		int tmp3 = 0;
		int tmp4 = 0;
		// 대각선의 합
		for (int i = 0; i < n; i++) {
			tmp3 += map[i][i];
			tmp4 += map[i][n - i - 1];
		}
		answer = Math.max(answer, tmp3);
		answer = Math.max(answer, tmp4);

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main9 T = new Main9();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[][] map = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(T.solution(n, map));
	}

}

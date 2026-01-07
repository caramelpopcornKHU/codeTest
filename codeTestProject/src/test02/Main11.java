package test02;

import java.util.*;
import java.io.*;

public class Main11 {

	public int solution(int n, int[][] arr) {
		int answer = 0, maxCnt = Integer.MIN_VALUE;

		// i: 기준학생
		for (int i = 1; i <= n; i++) {
			// 학생 i 가 몇번 만나는지 count
			int cnt = 0;
			// j: 비교 대상 학생
			for (int j = 1; j <= n; j++) {

				// k : 학년
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}

			if (cnt > maxCnt) {
				maxCnt = cnt;
				answer = i;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main11 T = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		// 0번이 아닌 학생 번호 1번 부터 시작하기 위해 n+1
		// 1학년부터 5학년까지 하기 위해 6
		int[][] arr = new int[n + 1][6];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken(), 10);
			}
		}

		System.out.println(T.solution(n, arr));

	}

}

package test02;

import java.util.*;
import java.io.*;

public class Main12 {

	public int solution(int N, int M, int[][] arr) {
		int answer = 0;

		// N의 숫자가 작네 - 완전 다 비교해도 되는구나
		// 각 요소가 숫자가 아니라 이름으로 생각하면, 배열 인덱스로 쓰일 수 없구나.

		// 멘토 고르는 루프
		for (int i = 1; i <= N; i++) {
			// 멘티 고르는 루프
			for (int j = 1; j <= N; j++) {
				// 이렇게 2중 for문을 열면 모든 경우의 수를 확인 할 수 있음
				if (i == j)
					continue;

				// 순서쌍이 M번의 테스트에서 모두 이기면 증가
				int cnt = 0;

				for (int k = 0; k < M; k++) {

					// i의 위치 position
					int pi = 0;
					// j의 위치 position
					int pj = 0;

					for (int s = 0; s < N; s++) {

						if (arr[k][s] == i)
							pi = s + 1;
						if (arr[k][s] == j)
							pj = s + 1;
					}

					// 등수가 높으면 증가 : pi멘토 pj멘티
					if (pi < pj)
						cnt++;

				}
				if (cnt == M)
					answer++;

			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main12 T = new Main12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken(), 10);
			}
		}

		System.out.println(T.solution(N, M, arr));
	}

}

package test02;

import java.util.*;
import java.io.*;

public class Test {

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;

		// 모든 순서쌍 경우의 수
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					continue;
				}

				// 11 12 12 13
				
				boolean flag = true;
				
				// 배열 인자별 확인
				for (int p = 0; p < m; p++) {
					
					int lt=0,rt=0;
					for (int q = 0; q < n; q++) {
						if(arr[p][q] == i) lt = q;
						if(arr[p][q] == j) rt = q;
					}
					if(lt > rt) {
						flag = false;
						break;
					}
				}
				
				if(flag)
					answer++;

			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Test T = new Test();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(T.solution(n, m, arr));
	}

}

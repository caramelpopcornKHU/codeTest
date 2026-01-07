package test02;

import java.util.*;
import java.io.*;

public class Main10 {

	public int solution(int n, int[][] map) {
		int answer = 0;

		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		boolean isTop = true;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				isTop = true;

				for (int k = 0; k < 4; k++) {

					int nx = i + dx[k];
					int ny = j + dy[k];

					if (map[i][j] < map[nx][ny]) {
						isTop = false;
					}
				}

				if (isTop) {
					answer++;
				}

			}
		}

		return answer;
	}

//	public int solution(int n, int[][] map) {
//		int answer = 0;
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				boolean condition1 = map[i][j] > map[i-1][j];
//				boolean condition2 = map[i][j] > map[i][j-1];
//				boolean condition3 = map[i][j] > map[i+1][j];
//				boolean condition4 = map[i][j] > map[i][j+1];
//				
//				if(condition1 && condition2 &&condition3 &&condition4) {
//					answer++;
//	//				System.out.println("map["+i+"]"+"["+j+"]"+" " + map[i][j]);
//				}
//			}
//		}
//		
//		return answer;
//	}

	public static void main(String[] args) throws IOException {
		Main10 T = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] map = new int[n + 2][n + 2];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(T.solution(n, map));

	}

}

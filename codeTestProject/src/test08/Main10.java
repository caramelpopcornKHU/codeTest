package test08;

import java.io.*;
import java.util.*;

public class Main10 {

	static int[][] arr;

	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	static int answer = 0;

	boolean con1, con2;

	public void DFS(int x, int y) {

		if (x == 6 && y == 6)
			answer++;
		else {
			for (int i = 0; i < 4; i++) {

				int nx = x + dx[i];
				int ny = y + dy[i];

				con1 = (nx > -1) && (nx < 7);
				con2 = (ny > -1) && (ny < 7);

				if (con1 && con2 && arr[nx][ny] == 0) {
					arr[nx][ny] = 1;
					DFS(nx, ny);
					arr[nx][ny] = 0;
				}

			}
		}
	}

	public static void main(String[] args) throws IOException {
		Main10 T = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		arr = new int[7][7];

		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 7; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		arr[0][0] = 1;
		T.DFS(0, 0);
		System.out.println(answer);

	}

}

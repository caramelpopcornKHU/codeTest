package test08;

import java.io.*;
import java.util.*;

public class Main13 {

	static int n, answer = 0;
	static int[][] arr, ch;

	static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public void DFS(int x, int y) {

		if (ch[x][y] == 1)
			return;

		ch[x][y] = 1;

		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			boolean con1 = nx > -1 && nx < n;
			boolean con2 = ny > -1 && ny < n;

			if (con1 && con2 && arr[nx][ny] == 1)
				DFS(nx, ny);

		}
	}

	// DFS방식
	public void solution() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 방문하지 않았던 곳과 1인 곳 방문
				if (ch[i][j] == 0 && arr[i][j] == 1) {

					DFS(i, j);

					answer++;

				} else {
					continue;
				}
			}
		}

	}

	public void BFS(int x, int y) {
		Deque<Point> Q = new ArrayDeque<>();
		Q.offer(new Point(x, y));

		while (!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];

				boolean con1 = nx > -1 && nx < n;
				boolean con2 = ny > -1 && ny < n;

				if (con1 && con2 && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					Q.offer(new Point(nx,ny));
				}

			}
		}

	}

	// BFS방식
	public void solution2() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 방문하지 않았던 곳과 1인 곳 방문
				if (arr[i][j] == 1) {
					BFS(i, j);
					answer++;

				} else {
					continue;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Main13 T = new Main13();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		ch = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		T.solution();
		T.solution2();
		System.out.println(answer);

	}

}

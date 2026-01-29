package test08;

import java.io.*;
import java.util.*;



public class Main11 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int[][] board, dis;

	public void BFS(int x, int y) {
		Deque<Point> Q = new ArrayDeque<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		while (!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Main11 T = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		board = new int[7][7];
		dis = new int[7][7];

		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 7; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		T.BFS(0, 0);

		if (dis[6][6] == 0)
			System.out.println(-1);
		else
			System.out.println(dis[6][6]);

	}

	// 내 풀이
//	static int[][] arr;
//
//	static int[] dx = { 1, 0, -1, 0 };
//	static int[] dy = { 0, -1, 0, 1 };
//
//	static int answer = 0;
//	static boolean[] con;
//
//	public void BFS(int x, int y) {
//		Deque<Integer> Q = new ArrayDeque<>();
//		// 항상 2개씩 넣고 2개씩 꺼내기
//		Q.offer(x);
//		Q.offer(y);
//
//		while (!Q.isEmpty()) {
//			// 2개를 한번에 꺼내니까 반으로 나누기
//			int size = Q.size() / 2;
//
//			for (int i = 0; i < size; i++) {
//				// 2개를 한번에 꺼내기
//				int xTemp = Q.poll();
//				int yTemp = Q.poll();
//
//				if (xTemp == 6 && yTemp == 6)
//					return;
//
//				for (int j = 0; j < 4; j++) {
//					int nx = xTemp + dx[j];
//					int ny = yTemp + dy[j];
//
//					con[0] = nx > -1 && nx < 7;
//					con[1] = ny > -1 && ny < 7;
//
//					if (con[0] && con[1] && arr[nx][ny] == 0) {
//						// 중복방문 방지
//						arr[nx][ny] = 1;
//						Q.offer(nx);
//						Q.offer(ny);
//					}
//
//				}
//			}
//
//			answer++;
//		}
//
//		answer = -1;
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main11 T = new Main11();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//
//		arr = new int[7][7];
//		con = new boolean[2];
//
//		for (int i = 0; i < 7; i++) {
//			st = new StringTokenizer(br.readLine());
//			for (int j = 0; j < 7; j++) {
//				arr[i][j] = Integer.parseInt(st.nextToken());
//			}
//		}
//
//		arr[0][0] = 1;
//
//		T.BFS(0, 0);
//		System.out.println(answer);
//
//	}

}

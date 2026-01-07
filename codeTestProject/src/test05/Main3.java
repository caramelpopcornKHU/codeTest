package test05;

import java.io.*;
import java.util.*;

public class Main3 {

	public int solution(int n, int[][] board, int m, int[] move) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();
		for (int x : move) {
			int temp = 0;
			while (temp < n) {
				if (board[temp][x - 1] == 0)
					temp++;
				else {

					if (stack.size() > 0) {
						if (stack.peek() == board[temp][x - 1]) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(board[temp][x - 1]);
						}
					} else if (stack.size() == 0) {
						stack.push(board[temp][x - 1]);
					}

					board[temp][x - 1] = 0;
					break;
				}
			}

		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int[] move = new int[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++)
			move[i] = Integer.parseInt(st.nextToken());

		System.out.println(T.solution(n, board, m, move));

	}

}

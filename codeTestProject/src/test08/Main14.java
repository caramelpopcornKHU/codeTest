package test08;

import java.io.*;
import java.util.*;

public class Main14 {

	static int n, m;
	static ArrayList<Point> pizzaList, homeList;

	static int[] memory;

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	static int answer = Integer.MAX_VALUE;

	// 중복 X 조합
	public void combi(int L, int x) {

		if (L == m) {

			int sum = 0;

			for (Point home : homeList) {

				int dist = Integer.MAX_VALUE;

				/*
				 * 피자집 없는 상태 + m개의 조합만 고른 상태, 
				 * 각각의 home에서 피자집까지 맨하탄 거리 산출,
				 * 그 중에서 최소값을 dist에 저장
				 */
				for (int i = 0; i < m; i++) {
					Point select = pizzaList.get(memory[i]);

					int xDiff = Math.abs(home.x - select.x);
					int yDiff = Math.abs(home.y - select.y);

					dist = Math.min(dist, xDiff + yDiff);
				}
				sum += dist;
			}
			/*
			 * 각 조합의 거리합 중에 최소값을 저장
			 */
			answer = Math.min(sum, answer);

		} else {
			for (int i = x; i < pizzaList.size(); i++) {
				memory[L] = i;
				combi(L + 1, i + 1);
			}
		}

	}

	public void solution() {

		// 중복없이 피자집 골라서 가게 만들기
		memory = new int[m];
		combi(0, 0);

	}

	public static void main(String[] args) throws IOException {
		Main14 T = new Main14();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		pizzaList = new ArrayList<>();
		homeList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int value = Integer.parseInt(st.nextToken());
				if (value == 2) {
					pizzaList.add(new Point(i, j));

				} else if (value == 1) {
					homeList.add(new Point(i, j));
				}

			}
		}

		T.solution();
		
		System.out.println(answer);
		
	}

}

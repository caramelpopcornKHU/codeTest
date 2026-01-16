package test07;

import java.io.*;
import java.util.*;

public class Main8 {

	int answer = 0;

	int[] ch;
	int[] dis = { 1, -1, 5 };

	Deque<Integer> Q = new ArrayDeque<>();

	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();

			for (int i = 0; i < len; i++) {
				int x = Q.poll();

				for (int j : dis) {

					// next x 선언
					int nx = x + j;

					// 다음 값이 송아지 위치면 | 그 다음 level 리턴
					if (nx == e)
						return L + 1;

					// 범위가 1부터 만까지 중에 메모이제이션
					if (nx >= 1 && nx < 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}

			}

			L++;
		}
		return L;

	}

	public static void main(String[] args) throws IOException {
		Main8 T = new Main8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		System.out.println(T.BFS(s, e));

	}

}

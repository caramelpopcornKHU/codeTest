package test08;

import java.io.*;
import java.util.*;

public class Main8 {

	static int[] ch, arr;
	static int n;
	static boolean flag = false;

	public void BFS(int f) {

		Deque<Integer> Q = new ArrayDeque<>();
		for (int x : arr) {
			Q.offer(x);
		}

		while (Q.size() != 1) {
			// 앞에서 1개 먼저 꺼내기
			int nv1 = Q.poll();
			
			int size = Q.size();
			for (int i = 0; i < size; i++) {
				// 지금 꺼내기
				int nv2 = Q.poll();
				
				// 앞에서 꺼낸거랑 지금 꺼낸거 더해서 큐에 넣어주기
				Q.offer(nv1 + nv2);
				// 앞에서 꺼낸거를 지금 꺼낸것으로 교체
				nv1 = nv2;
			}

		}
		int answer = Q.poll();

		if (answer == f) {
			flag = true;
			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

	public void DFS(int L, int f) {
 		// 답이 나와버렸으 돌아가!
		if (flag)
			return;

		if (L == n) {
			// 이거 맞냐 function
			BFS(f);
		} else {
			for (int i = 1; i <= n; i++) {
				// 방문이 열렸으면 들어가
				if (ch[i] == 0) {
					ch[i] = 1;
					arr[L] = i;
					DFS(L + 1, f);
					// 빽트랙킹
					ch[i] = 0;
				}

			}
		}

	}

	public static void main(String[] args) throws IOException {
		Main8 T = new Main8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		arr = new int[n];
		ch = new int[n + 1];

		T.DFS(0, f);

	}

}

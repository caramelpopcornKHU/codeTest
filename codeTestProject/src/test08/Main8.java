package test08;

import java.io.*;
import java.util.*;

public class Main8 {

	static int[] b, p, ch;
	static int n, f;
	boolean flag = false;
	// 메모이제이션 용 배열
	int[][] dy = new int[35][35];

	public int combi(int n, int r) {
		// 메모이제이션 - 값 들어가있으면 반환
		if (dy[n][r] > 0)
			return dy[n][r];

		if (n == r || r == 0)
			return 1;
		else
			return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}

	public void DFS(int L, int sum) {
		if (flag)
			return;

		if (L == n) {
			if (sum == f) {
				// 정답 출력
				for (int x : p)
					System.out.print(x + " ");
				flag = true;
			}
		} else {
			for (int i = 1; i <= n; i++) {
				// 중복방지
				if (ch[i] == 0) {
					ch[i] = 1;
					// 순열 각 자리에 숫자 넣어보기
					p[L] = i;
					
//					sum = sum + (b[L] * p[L]);  (오답)
//					DFS(L + 1, sum);	 (오답)
					// 위에 주석이 안되는 이유: 재귀 후 sum 값이 원상복구가 안됨
					
					// 순열에 정해진 자리에 이항계수 값 곱해주기
					DFS(L + 1, sum + (b[L] * p[L])); // (정답)
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
		f = Integer.parseInt(st.nextToken());

		// 이항계수 배열
		b = new int[n];
		// 순열을 담을 배열
		p = new int[n];
		// 중복 방지 check 배열
		ch = new int[n + 1];

		// n-1을 넣는 이유: 5개 숫자면 4C0 + 4C1 + 4C2 + 4C3 + 4C4
		// n-1을 넣는 이유: 4개 숫자면 3C0 + 3C1 + 3C2 + 3C3
		for (int i = 0; i < n; i++) {
			b[i] = T.combi(n - 1, i);
		}

		// 위에서 이항계수가 완성되었으니 탐색 시작
		T.DFS(0, 0);

	}

	// 내 풀이
//	static int[] ch, arr;
//	static int n;
//	static boolean flag = false;
//
//	public void BFS(int f) {
//
//		Deque<Integer> Q = new ArrayDeque<>();
//		for (int x : arr) {
//			Q.offer(x);
//		}
//
//		while (Q.size() != 1) {
//			// 앞에서 1개 먼저 꺼내기
//			int nv1 = Q.poll();
//			
//			int size = Q.size();
//			for (int i = 0; i < size; i++) {
//				// 지금 꺼내기
//				int nv2 = Q.poll();
//				
//				// 앞에서 꺼낸거랑 지금 꺼낸거 더해서 큐에 넣어주기
//				Q.offer(nv1 + nv2);
//				// 앞에서 꺼낸거를 지금 꺼낸것으로 교체
//				nv1 = nv2;
//			}
//
//		}
//		int answer = Q.poll();
//
//		if (answer == f) {
//			flag = true;
//			for (int x : arr) {
//				System.out.print(x + " ");
//			}
//		}
//
//	}
//
//	public void DFS(int L, int f) {
// 		// 답이 나와버렸으 돌아가!
//		if (flag)
//			return;
//
//		if (L == n) {
//			// 이거 맞냐 function
//			BFS(f);
//		} else {
//			for (int i = 1; i <= n; i++) {
//				// 방문이 열렸으면 들어가
//				if (ch[i] == 0) {
//					ch[i] = 1;
//					arr[L] = i;
//					DFS(L + 1, f);
//					// 빽트랙킹
//					ch[i] = 0;
//				}
//
//			}
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main8 T = new Main8();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		int f = Integer.parseInt(st.nextToken());
//
//		arr = new int[n];
//		ch = new int[n + 1];
//
//		T.DFS(0, f);
//
//	}

}

package test07;

import java.io.*;
import java.util.*;

public class Main13 {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;

	public void BFS(int v) {
		Deque<Integer> queue = new ArrayDeque<>();
		ch[v] = 1;
		dis[v] = 0;

		queue.offer(v);

		while (!queue.isEmpty()) {
			// current vertex
			int cv = queue.poll();
			for (int nv : graph.get(cv)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					// cv로 부터 온 nv는 간선 길이 하나 추가됨
					dis[nv] = dis[cv] + 1;
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		Main13 T = new Main13();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		ch = new int[n + 1];
		dis = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			graph.get(from).add(to);
		}

		ch[1] = 1;
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}

	}
}

// 내 풀이
//public class Main13 {
//
//	static ArrayList<ArrayList<Integer>> graph;
//	static int n, m;
//	static int[] answer, ch;
//
//	public void BFS(int v) {
//		Deque<Integer> Q = new ArrayDeque<>();
//		Q.offer(v);
//		int L = 1;
//
//		while (!Q.isEmpty()) {
//			int len = Q.size();
//
//			for (int i = 0; i < len; i++) {
//				int nv = Q.poll();
//
//				for (int x : graph.get(nv)) {
//
//					if (ch[x] == 0) {
//						Q.offer(x);
//						answer[x] = L;
//						ch[x] = 1;
//					}
//				}
//			}
//			L++;
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main13 T = new Main13();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//
//		graph = new ArrayList<ArrayList<Integer>>();
//
//		// graph 는 1번 ~ n번까지
//		for (int i = 0; i <= n; i++) {
//			graph.add(new ArrayList<Integer>());
//		}
//
//		for (int i = 0; i < m; i++) {
//			st = new StringTokenizer(br.readLine());
//			int from = Integer.parseInt(st.nextToken());
//			int to = Integer.parseInt(st.nextToken());
//			graph.get(from).add(to);
//		}
//
//		ch = new int[n + 1];
//		ch[1] = 1;
//		answer = new int[n + 1];
//
//		T.BFS(1);
//
//		for (int i = 2; i <= n; i++) {
//			System.out.println(i + " : " + answer[i]);
//		}
//
//	}
//
//}
//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5

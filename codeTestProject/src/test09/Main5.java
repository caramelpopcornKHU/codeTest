package test09;

import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
	public int vex;
	public int cost;

	Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge ob) {
		// cost는 오름차순이 맞겠지?
		// 왜요? 비용이 낮은거부터 꺼내는게 좋겠지?
		return this.cost - ob.cost;
	}
}

public class Main5 {

	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;

	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		// 비어있는 queue에 현재 시작되는 정점을 넣어줌으로써 탐색 시작
		pQ.offer(new Edge(v, 0));
		dis[v] = 0;

		// 다익스트라
		// queue는 하나를 넣었기에 비어있지 않다.
		// 돌아간다.
		while (!pQ.isEmpty()) {
			// 우선순위 큐에서 Edge를 꺼내기
			// 그냥 꺼낼까?
			// Edge에서 compareTo에서 정의한 우선순위
			// cost 작은 순서대로
			Edge tmp = pQ.poll();

			// Edge가 향하는 정점
			int now = tmp.vex;
			int nowCost = tmp.cost;

			// cost가 크니까 뒤로 밀려나 있을탠데
			// 앞에 cost작은 것들로 계산이 되어있어
			// 굳이 또 cost큰 걸 또 계산할 필요 없다.
			if (nowCost > dis[now])
				continue;

			// 정점에 달려있는 정점을 다 꺼내볼게
			for (Edge ob : graph.get(now)) {
				if (dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Edge>>();

		// 0번은 더미
		// index 1 ~ 에서 정점 n까지
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}

		dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());

			graph.get(from).add(new Edge(to, value));
		}

		T.solution(1);
		for (int i = 2; i <= n; i++) {
			if (dis[i] != Integer.MAX_VALUE)
				System.out.println(i + " : " + dis[i]);
			else
				System.out.println(i + " :  impossible");
		}

	}

	// 내 풀이
//	static int n, m;
//	static int[] ch, answer;
//	static int[][] arr;
//
//	public void DFS(int cv, int sum) {
//
//		answer[cv] = Math.min(answer[cv], sum);
//
//		for (int i = 1; i <= n; i++) {
//			if (arr[cv][i] > 0 && ch[i] == 0) {
//				ch[cv] = 1;
//				DFS(i, sum + arr[cv][i]);
//				ch[cv] = 0;
//			}
//
//		}
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main5 T = new Main5();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//
//		arr = new int[n + 1][n + 1];
//		ch = new int[n + 1];
//
//		answer = new int[n + 1];
//
//		for (int i = 1; i <= n; i++) {
//			answer[i] = Integer.MAX_VALUE;
//		}
//
//		for (int i = 0; i < m; i++) {
//			st = new StringTokenizer(br.readLine());
//			int from = Integer.parseInt(st.nextToken());
//			int to = Integer.parseInt(st.nextToken());
//			int value = Integer.parseInt(st.nextToken());
//
//			arr[from][to] = value;
//
//		}
//
//		ch[1] = 1;
//		T.DFS(1, 0);
//
//		for (int i = 2; i <= n; i++) {
//			if (answer[i] != Integer.MAX_VALUE)
//				System.out.println(i + " : " + answer[i]);
//			else
//				System.out.println(i + " : impossible");
//
//		}
//
//	}

}

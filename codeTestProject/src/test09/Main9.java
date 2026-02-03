package test09;

import java.io.*;
import java.util.*;

public class Main9 {
	// 최소 스패닝 트리 - 프림 알고리즘
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}

		int[] ch = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());

			// 다익스트라는 방향 그래프였으니까 1개
			// 이건 무방향이니까 양쪽으로 두개 추가
			graph.get(from).add(new Edge(to, cost));
			graph.get(to).add(new Edge(from, cost));
		}

		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<Edge>();

		pQ.offer(new Edge(1, 0));

		while (!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int ev = tmp.vex;
			// check가 되어있냐?
			if (ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				// 그 정점 위에서 다음 선택지 쭉 보기
				for (Edge ob : graph.get(ev)) {
					// check안 된 정점만 대기열에 추가
					if (ch[ob.vex] == 0)
						pQ.offer(new Edge(ob.vex, ob.cost));
				}
			}

		}

		System.out.println(answer);

	}

}

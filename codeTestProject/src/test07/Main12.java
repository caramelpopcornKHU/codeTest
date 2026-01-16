package test07;

import java.io.*;
import java.util.*;

public class Main12 {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public void DFS(int v) {
		if (v == n)
			answer++;
		else {
			for (int nextV : graph.get(v)) {
				// 방문 안 했나?
				if (ch[nextV] == 0) {
					ch[nextV] = 1;
					DFS(nextV);
					ch[nextV] = 0;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Main12 T = new Main12();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();

		// 0번을 넣고 n개 해야해
		// 0번 + vertex 수만큼 뚫어야해 그러니까 0부터 n(포함)까지
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			graph.get(from).add(to);
		}

		ch = new int[n + 1]; // 0은 버리기때문에
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);

	}

}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5

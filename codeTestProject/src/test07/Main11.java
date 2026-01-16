package test07;

import java.io.*;
import java.util.*;

public class Main11 {
	
	// 인접 행렬 방식
	static int[][] graph;
	static int[] ch;
	static int n, m, answer = 0;

	public void DFS(int v) {

		// vertex가 목표하던 vertex랑 만나면 answer++;
		if (v == n)
			answer++;
		else {
			for (int i = 1; i <= n; i++) {
				// 몇번 vertex가 1인지(가능한지 찾고) - check가 되어있나 안 되어있나
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Main11 T = new Main11();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			graph[from][to] = 1;
		}
		// 출발점 1번 노드 체크
		ch[1] = 1;
		T.DFS(1);

		System.out.println(answer);

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

}

package test09;

import java.io.*;
import java.util.*;

class Edge2 implements Comparable<Edge2> {
	int v1;
	int v2;
	int cost;

	Edge2(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge2 o) {
		return this.cost - o.cost;
	}

}

public class Main8 {

	static int[] unf;

	public static int Find(int v) {
		if (v == unf[v]) {
			return v;
		} else {
			return unf[v] = Find(unf[v]);
		}
	}

	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if (fa != fb)
			unf[fa] = fb;
	}

	// 크루스칼 방식
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		unf = new int[v + 1];
		ArrayList<Edge2> arr = new ArrayList<>();

		for (int i = 0; i <= v; i++) {
			unf[i] = i;
		}

		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			arr.add(new Edge2(from, to, cost));
		}

		int answer = 0;
		int cnt = 0;
		// cost에 의해서 정렬됨
		Collections.sort(arr);

		// 회로가 안되는 것만 빼고 연결
		for (Edge2 ob : arr) {
			int fv1 = Find(ob.v1);
			int fv2 = Find(ob.v2);

			if (cnt > v - 1)
				break;

			if (fv1 != fv2) {
				answer += ob.cost;
				Union(ob.v1, ob.v2);
				cnt++;
			}
		}

		System.out.println(answer);
	}

}

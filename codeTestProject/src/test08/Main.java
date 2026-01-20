package test08;

import java.io.*;
import java.util.*;

public class Main {

	static HashMap<Integer, Integer> answer;
	static int[] arr, ch;
	static int n, cnt;

	public void DFS(int v) {

		if (v == n) {
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i < n; i++) {
				if (ch[i] == 1) {
					sum1 += arr[i];
				} else {
					sum2 += arr[i];
				}
			}

			answer.put(sum1, sum2);

		} else {

			ch[v] = 1;
			DFS(v + 1);
			ch[v] = 0;
			DFS(v + 1);

		}

	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		cnt = 0;

		arr = new int[n];
		ch = new int[n];
		answer = new HashMap<Integer, Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		ch[0] = 1;
		T.DFS(0);
		boolean flag = false;
		for (int x : answer.keySet()) {

			if(x == answer.get(x)) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		

	}

}

package test08;

import java.io.*;
import java.util.*;

public class Main4 {

	static int[] pm; // permutation
	static int n, m;

	public void DFS(int L) {
		if (L == m) {
			for (int x : pm)
				System.out.print(x + " ");
			
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		pm = new int[m];

		T.DFS(0);

	}

}

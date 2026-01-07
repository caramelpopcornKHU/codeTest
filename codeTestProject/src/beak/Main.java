package beak;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());

			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");

		}

		System.out.println(sb.toString());

	}

}

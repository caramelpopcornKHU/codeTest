package test06;

import java.io.*;
import java.util.*;

public class Main3 {
	// 삽입 정렬
	public int[] solution(int n, int[] arr) {

		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > tmp)
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = tmp;
		}

		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int x : T.solution(n, arr)) {
			bw.write(x + " ");
		}
		bw.flush();

	}

}

package test10;

import java.io.*;
import java.util.*;

public class Main3 {

	public int[] dy;

	public int solution(int n, int[] arr) {
		int answer = 0;

		dy = new int[n];
		dy[0] = 1;
		for (int i = 1; i < n; i++) {
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i] && dy[j] > max)
					max = dy[j];
			}

			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}

		return answer;
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

		System.out.println(T.solution(n, arr));

	}

}

package test06;

import java.io.*;
import java.util.*;

public class Main8 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		Arrays.sort(arr);

		// binary search 알고리즘
		int lt = 0;
		int rt = n - 1;

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (arr[mid] == m) {
				return mid + 1;
				
			} else if (arr[mid] > m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main8 T = new Main8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, m, arr));

	}

}

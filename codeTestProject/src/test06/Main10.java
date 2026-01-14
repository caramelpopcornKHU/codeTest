package test06;

import java.io.*;
import java.util.*;

public class Main10 {
	
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}

		return cnt;

	}

	public int solution(int n, int c, int[] arr) {
		int answer = 0;

		// 좌표 정렬
		Arrays.sort(arr);

		int lt = 1;
		int rt = arr[n - 1] - arr[0];

		// 두마리의 말 사이 거리의 최소 경우 ~ 최대 경우 사이에 무조건 답은 있다.

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}

		}

		return answer;

	}

	public static void main(String[] args) throws IOException {
		Main10 T = new Main10();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, c, arr));

	}

}

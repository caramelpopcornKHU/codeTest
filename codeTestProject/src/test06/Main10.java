package test06;

import java.io.*;
import java.util.*;

public class Main10 {

	public int count(int dist, int[] arr) {
		// 마구간 1개 스타트
		int cnt = 1;

		int lt = 0;

		for (int rt = 1; rt < arr.length; rt++) {
			if ((arr[rt] - arr[lt]) >= dist) {
				lt = rt;
				cnt++;
			}
		}
		return cnt;
	}

	public int solution(int n, int c, int[] arr) {
		int answer = -1;

		Arrays.sort(arr);

		// 1 2 4 8 9

		// 가까울수록 마구간 up
		// 멀수록 마구간 down

		int lt = 1;
		int rt = arr[n - 1] - arr[0];

		// lt rt거리 사이에 최적의 마구간 개수가있어
		while (lt <= rt) {

			int mid = (lt + rt) / 2;
			// 마구간 개수 count

			// 거리가 작아서 마구간 늘어나도 ok이야
			if (count(mid, arr) >= c) {
				answer = mid;
				lt = mid + 1;
			}
			// 하지만 거리가 너무 멀어서 마구간 부족하면 안되
			else {
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

package test06;

import java.io.*;
import java.util.*;

public class Main9 {

	// dvd 한장 용량이 capacity
	public int count(int[] arr, int capacity) {
		int cnt = 1; // dvd 장 수
		int sum = 0; // 곡의 수

		for (int x : arr) {

			// 2. dvd에 곡을 쌓다가 용량을 넘어가면
			if (sum + x > capacity) {
				cnt++; // 3. 그 다음 dvd
				sum = x; // 4. 새로운 dvd의 값 입력
			} else {
				// 1. dvd에 곡을 쌓는다
				sum += x;
			}
		}

		return cnt;

	}

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		// 결정 알고리즘을 위한 lt 에서 rt
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			// 이 용량으로 가능한가?
			if (count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
			// 용량으로 불가능하면
			else {
				lt = mid + 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main9 T = new Main9();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, m, arr));

	}

}

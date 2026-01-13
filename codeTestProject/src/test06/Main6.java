package test06;

import java.util.*;
import java.io.*;

public class Main6 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();

		int[] arr2 = arr.clone();
		Arrays.sort(arr2);

		for (int i = 0; i < n; i++) {
			if (arr[i] != arr2[i]) {
				answer.add(i + 1);
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main6 T = new Main6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

}

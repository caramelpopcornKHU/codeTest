package test04;

import java.util.*;
import java.io.*;

public class Main5 {

	public int solution(int n, int k, int[] arr) {
		int answer = -1;

		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x;
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(N, K, arr));

	}

}

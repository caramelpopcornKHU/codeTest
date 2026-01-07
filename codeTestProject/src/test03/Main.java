package test03;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;

		while (p1 < n && p2 < m) {
			if (arr1[p1] < arr2[p2]) {
				answer.add(arr1[p1++]);
			} else {
				answer.add(arr2[p2++]);
			}
		}
		
		while(p1<n) answer.add(arr1[p1++]);
		while(p2<m) answer.add(arr2[p2++]);
		

		return answer;

	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		//
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		for (int x : T.solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}

	}

}

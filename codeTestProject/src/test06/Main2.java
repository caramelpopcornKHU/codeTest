package test06;

import java.io.*;
import java.util.*;

public class Main2 {

	public void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
	// 버블 정렬
	public int[] solution(int n, int[] arr) {
		int a = n;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < a; j++) {
				if(arr[j] < arr[j-1])
					swap(j,j-1,arr);
			}
			a--;
		}
		
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
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

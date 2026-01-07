package test02;

import java.util.*;
import java.io.*;

public class Main6 {
	
	// 모범 답안
	public boolean isPrime(int n) {

		if (n == 1)
			return false;
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();

		// 하나씩 꺼내기
		for (int i = 0; i < n; i++) {
			// 뒤집기
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if (isPrime(res)) {
				answer.add(res);
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main6 T = new Main6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

	
	// 단건 조회에서는 불필요함. 이건 범위안에 모든 소수를 구할때만 씀
	
	// 내가 푼 풀이
//	public boolean isPrime(int a) {
//		int[] x = new int[a + 1];
//
//		for (int i = 2; i <= a; i++) {
//
//			if (i == a) {
//				if (x[a] == 0) {
//					return true;
//				}
//			}
//
//			for (int j = i; j <= a; j = j + i) {
//				x[j] = 1;
//			}
//
//		}
//
//		return false;
//	}
//
//	public ArrayList<Integer> solution(int n, String[] arr) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		for (String x : arr) {
//			int a = Integer.parseInt(new StringBuilder(x).reverse().toString());
//			if (isPrime(a))
//				list.add(a);
//		}
//
//		return list;
//	}
//
//	public static void main(String[] args) throws IOException {
//		Main6 T = new Main6();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String[] arr = new String[n];
//
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = st.nextToken();
//		}
//
//		for (int i : T.solution(n, arr)) {
//			System.out.print(i + " ");
//		}
//
//	}

}

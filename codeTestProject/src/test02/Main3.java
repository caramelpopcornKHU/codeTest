package test02;

import java.util.*;

public class Main3 {

	public char[] solution(int n, int[] a, int[] b) {
		char[] answer = new char[n];

		for (int i = 0; i < n; i++) {
			if(a[i] == b[i]) answer[i] = 'D';
			else if(a[i] == 1 && b[i] == 3) answer[i] = 'A';
			else if(a[i] == 2 && b[i] == 1) answer[i] = 'A';
			else if(a[i] == 3 && b[i] == 2) answer[i] = 'A';
			else answer[i] = 'B';
			
		}

		return answer;
	}

	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = kb.nextInt();
		}
		for (char c : T.solution(n, arr1, arr2)) {
			System.out.println(c);
		}
	}

}

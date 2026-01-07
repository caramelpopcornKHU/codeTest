package test02;

import java.util.*;

public class Main2 {

	public int solution(int[] arr) {
		int answer = 1;
		int tallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
				if(arr[i]>tallest) {
					tallest = arr[i];
					answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr));
	}

}

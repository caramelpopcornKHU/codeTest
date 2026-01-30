package test09;

import java.io.*;
import java.util.*;

class Body implements Comparable<Body> {
	int height;
	int weight;

	Body(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

//	@Override
//	public int compareTo(Body b) {
//		if (this.height == b.height) {
//			return this.weight - b.weight;
//		} else {
//			return this.height - b.height;
//		}
//	}

	@Override
	public int compareTo(Body b) {
		if (this.height == b.height) {
			return b.weight - this.weight;
		} else {
			return b.height - this.height;
		}
	}
}

public class Main {
	
	
	// Greedy algorithm - 지금 선택에서 가장 탐욕적이게 선택하는 것
	// 지금의 선택에서 가장 최선의 선택을하면 답이 나온다.
	public int solution(int n, ArrayList<Body> arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);

		for (Body b : arr) {
			if (max < b.weight) {
				answer++;
				max = b.weight;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		ArrayList<Body> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int height = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			arr.add(new Body(height, weight));

		}

		System.out.println(T.solution(n, arr));

	}

}

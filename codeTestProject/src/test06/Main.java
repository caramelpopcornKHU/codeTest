package test06;

import java.io.*;
import java.util.*;

class Patient {
	int id;
	int classification;

	Patient(int id, int classification) {
		this.id = id;
		this.classification = classification;
	}
}

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		Deque<Patient> queue = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			queue.offer(new Patient(i, arr[i]));
		}

		while (!queue.isEmpty()) {
			int maxVal = Integer.MIN_VALUE;
			int maxId = -1;

			for (int i = 0; i < queue.size(); i++) {
				if (queue.peek().classification > maxVal) {
					maxVal = queue.peek().classification;
					maxId = queue.peek().id;
				}
				queue.offer(queue.poll());
			}

			while (maxId != queue.peek().id) {
				queue.offer(queue.poll());
			}

			if (queue.poll().id == m)
				break;

			answer++;

		}

		return answer + 1;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
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

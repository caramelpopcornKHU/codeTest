package test05;

import java.io.*;
import java.util.*;

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

//class Patient {
//	int id;
//	int classification;
//
//	Patient(int id, int classification) {
//		this.id = id;
//		this.classification = classification;
//	}
//}

public class Main8 {
	// 내 코드
//	public int solution(int n, int m, int[] arr) {
//		int answer = 0;
//
//		Deque<Patient> queue = new ArrayDeque<>();
//
//		for (int i = 0; i < n; i++) {
//			queue.offer(new Patient(i, arr[i]));
//		}
//
//		while (!queue.isEmpty()) {
//			int maxVal = Integer.MIN_VALUE;
//			int maxId = -1;
//
//			for (int i = 0; i < queue.size(); i++) {
//				if (queue.peek().classification > maxVal) {
//					maxVal = queue.peek().classification;
//					maxId = queue.peek().id;
//				}
//				queue.offer(queue.poll());
//			}
//
//			while (maxId != queue.peek().id) {
//				queue.offer(queue.poll());
//			}
//
//			if (queue.poll().id == m)
//				break;
//
//			answer++;
//
//		}
//
//		return answer + 1;
//	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;

		Deque<Person> queue = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, arr[i]));
		}

		while (!queue.isEmpty()) {
			Person tmp = queue.poll();
			for (Person x : queue) {
				if (x.priority > tmp.priority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			// null이 아니게 나왔으면 가장 높은 놈이네
			if (tmp != null) {
				answer++;
				// null이 아니게 빠져나온 놈 중에 m인 환자
				if (tmp.id == m)
					return answer;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main8 T = new Main8();
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

package test09;

import java.io.*;
import java.util.*;

class Lecture implements Comparable<Lecture> {
	public int money;
	public int time;

	Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.time - this.time;
	}
}

public class Main4 {

	static int n, max = Integer.MIN_VALUE;

	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;

		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);

		/*
		 *
		 * 3일차 모두 넣고 break
		 * 우선순위 큐 이기때문에 우선순위의 가장 앞에 있는 값 poll
		 * 2일차까지 더 쏟아부은다음
		 * 우선순위 큐의 가장 큰 값 poll
		 * 1일차까지 더 쏟아 부은다음
		 * 우선순위 큐의 가장 큰 값 poll
		 */

		int j = 0;
		for (int i = max; i >= 1; i--) {
			for (; j < n; j++) {
				if (arr.get(j).time < i)
					break;
				pQ.offer(arr.get(j).money);
			}

			if (!pQ.isEmpty())
				answer += pQ.poll();
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());

		ArrayList<Lecture> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int pay = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			arr.add(new Lecture(pay, day));
			if (day > max)
				max = day;
		}

		System.out.println(T.solution(arr));
	}

}

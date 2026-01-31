package test09;

import java.util.*;
import java.io.*;

class Piro implements Comparable<Piro> {
	int num;
	char se;

	Piro(int start, char se) {
		this.num = start;
		this.se = se;
	}

	@Override
	public int compareTo(Piro o) {
		if (this.num == o.num) {
			return this.se - o.se;
		} else {
			return this.num - o.num;
		}
	}

}

public class Main3 {

	public int solution(ArrayList<Piro> arr) {
		int answer = 0;

		Collections.sort(arr);

		int cnt = 0;

		for (Piro p : arr) {

			if (p.se == 's') {
				cnt++;
			} else {
				cnt--;
			}

			answer = Math.max(answer, cnt);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		ArrayList<Piro> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			// 시작
			int num1 = Integer.parseInt(st.nextToken());
			char se1 = 's';
			arr.add(new Piro(num1, se1));

			// 끝
			int num2 = Integer.parseInt(st.nextToken());
			char se2 = 'e';
			arr.add(new Piro(num2, se2));
		}

		System.out.println(T.solution(arr));

	}

}

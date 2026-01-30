package test09;

import java.io.*;
import java.util.*;

class Time implements Comparable<Time> {
	int start;
	int end;

	Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time o) {
		if (this.end == o.end) {
			return this.start - o.start;
		} else {
			return this.end - o.end;
		}
	}

}

public class Main2 {

	public int solution(int n, ArrayList<Time> timeTable) {
		int answer = 0;
		Collections.sort(timeTable);
		int tmp = Integer.MIN_VALUE;
		
		// 끝나는 시간을 기준으로 정렬
		// 끝나는 시간이 같다면, 시작 시간을 오름차순으로 정렬
		for (Time t : timeTable) {
			if (tmp <= t.start) {
				tmp = t.end;
				answer++;
			}

		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		ArrayList<Time> timeTable = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			timeTable.add(new Time(start, end));
		}

		System.out.println(T.solution(n, timeTable));
	}

}

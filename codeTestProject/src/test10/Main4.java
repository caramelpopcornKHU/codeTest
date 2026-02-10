package test10;

import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick> {
	int width;
	int height;
	int weight;

	Brick(int width, int height, int weight) {
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Brick o) {
		return o.width - this.width;
	}

}

public class Main4 {

	static ArrayList<Brick> list;

	static int[] dy;

	public int solution(int n) {
		int answer = 0;

		Collections.sort(list);
		dy[0] = list.get(0).height;

		answer = dy[0];

		for (int i = 1; i < list.size(); i++) {
			int max_h = 0;

			for (int j = i - 1; j >= 0; j--) {
				if (list.get(j).weight > list.get(i).weight && dy[j] > max_h) {
					max_h = dy[j];
				}
			}

			dy[i] = max_h + list.get(i).height;
			answer = Math.max(answer, dy[i]);

		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		dy = new int[n];

		list = new ArrayList<Brick>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			list.add(new Brick(a, b, c));

		}

		System.out.println(T.solution(n));

	}

}

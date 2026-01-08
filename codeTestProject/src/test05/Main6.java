package test05;

import java.io.*;
import java.util.*;

public class Main6 {

	public int solution(int n, int k) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		int p = 0;

		while (p++ < n) {
			queue.offer(p);
		}

		int cnt = 1;
		while (queue.size() != 1) {
			if (cnt == k) {
				cnt = 1;
				queue.poll();
			} else {
				cnt++;
				queue.offer(queue.poll());
			}
		}
		
		return queue.poll();

	}

	public static void main(String[] args) throws IOException {
		Main6 T = new Main6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		System.out.println(T.solution(n, k));

	}

}

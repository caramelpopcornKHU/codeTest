package test04;

import java.io.*;
import java.util.*;

public class Main {

	public char solution(int n, String s) {
		char answer = ' ';

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		int max = Integer.MIN_VALUE;

//		System.out.println(map.containsKey('A'));
		
		System.out.println(map.size());
		System.out.println(map.remove('C'));
		System.out.println(map.size());
		
		for (char key : map.keySet()) {

			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();

		System.out.println(T.solution(n, s));

	}
}

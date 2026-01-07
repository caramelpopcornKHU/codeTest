package test04;

import java.io.*;
import java.util.*;

public class Main2 {

	public String solution(String a, String b) {
		String answer = "YES";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// map에 값 채우기
		for (char key : a.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		for (char x : b.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1);

		}

		return answer;
	}

	// 내 풀이
//	public String solution(String a, String b) {
//		StringBuilder sb = new StringBuilder("YES");
//
//		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
//		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
//
//		for (char key : a.toCharArray()) {
//			map1.put(key, map1.getOrDefault(key, 0) + 1);
//		}
//		for (char key : b.toCharArray()) {
//			map2.put(key, map2.getOrDefault(key, 0) + 1);
//		}
//
//		boolean flag = true;
//
//		for (char key : map1.keySet()) {
//			if (map1.get(key) != map2.get(key))
//				flag = false;
//		}
//		
//		if(!flag) {
//			// 틀리면
//			sb.setLength(0);
//			sb.append("NO");
//		}
//
//
//		return sb.toString();
//	}

	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();

		System.out.println(T.solution(a, b));

	}
}

package test01;

import java.util.*;

public class Main11 {

	public String solution(String s) {
		String answer = "";
		s = s + " ";
		int cnt = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				answer += s.charAt(i);
				if (cnt > 1) {
					answer += cnt;
				}
				cnt = 1;
			} else {
				cnt++;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		Main11 T = new Main11();
		Scanner kb = new Scanner(System.in);
		String input = kb.next();
		System.out.println(T.solution(input));

	}

}

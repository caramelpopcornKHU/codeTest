package test01;

import java.util.*;

public class Main5 {

	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while (lt < rt) {
			if (Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			} else if (!Character.isAlphabetic(s[lt]))
				lt++;
			else
				rt--;
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		Main5 T = new Main5();
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		System.out.println(T.solution(str));

		kb.close();
	}

}

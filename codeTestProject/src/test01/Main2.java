package test01;

import java.util.*;

public class Main2 {

	public String solution(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			// 1번 솔루션
//			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
//			else answer += Character.toUpperCase(x);

			// 2번 솔루션

			if (x >= 65 && x <= 90)
				answer += Character.toLowerCase(x);
			else
				answer += Character.toUpperCase(x);

		}

		return answer;
	}

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));

	}

}

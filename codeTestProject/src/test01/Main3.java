package test01;

import java.util.*;

public class Main3 {

	public String solution(String str) {
		String answer = "";

		// 1번 솔루션
//		int counter = 0;
//		for(String x : str.split(" ")) {
//			if(x.length() > counter) {
//				counter = x.length();
//				answer = x;
//			}
//		}

		// 2번 솔루션
		int m = Integer.MIN_VALUE, pos;

		while ((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			if (m < tmp.length()) {
				m = tmp.length();
				answer = tmp;
			}

			str = str.substring(pos + 1);
		}
		if (str.length() > m)
			answer = str;

		return answer;
	}

	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();

		System.out.println(T.solution(str));

	}

}

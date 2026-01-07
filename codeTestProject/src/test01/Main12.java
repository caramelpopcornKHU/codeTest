package test01;

import java.util.*;

public class Main12 {

	public String solution(int n, String s) {
		String answer = "";

		s = s.replace('#', '1').replace('*', '0');

		int lt = 0, rt = 7;

		for (int i = 0; i < n; i++) {
			String tmp = s.substring(lt, rt);
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;

			lt += 7;
			rt += 7;

		}
		return answer;
	}

	public static void main(String[] args) {
		Main12 T = new Main12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String input = kb.next();
		System.out.println(T.solution(n, input));
	}

}

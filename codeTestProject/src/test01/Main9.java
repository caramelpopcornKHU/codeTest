package test01;

import java.util.*;

public class Main9 {

	public int solution(String s) {
		int answer = 0;
		// 솔루션 1
//		for (char x : s.toCharArray()) {
//			if (x >= 48 && x <= 57)
//				answer = answer * 10 + (x - 48);
//		}
		
		// 솔루션 2
		s = s.toUpperCase().replaceAll("[A-Z]","");
		answer = Integer.parseInt(s);
		
		// 솔루션 3
//		int answer = 0;
//		String temp = "";
//		for (char x : str.toCharArray()) {
//			if (Character.isDigit(x)) {
//				temp += x;
//			}
//		}
//
//		return Integer.parseInt(temp);
		

		return answer;
	}

	public static void main(String[] args) {
		Main9 T = new Main9();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}

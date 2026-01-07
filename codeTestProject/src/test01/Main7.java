package test01;

import java.util.*;

public class Main7 {

	public String solution(String str) {
		// 정답 문자열
		String answer = "YES";
		// 대소문자 무시이기 때문에 대문자로 변환
		str = str.toUpperCase();
		
		StringBuilder sb = new StringBuilder(str);
		String strReverse = sb.reverse().toString();
		
		// 솔루션 1
//		char[] s = str.toCharArray();
//		int lt = 0, rt = str.length() - 1;
//		
//		// 회문 검사
//		for(int i = 0; i < str.length() / 2; i++) {
//			if(s[lt] != s[rt]) {
//				answer = "NO";
//				break;
//			}
//			
//			lt++;
//			rt--;
//		}

		// 솔루션 2
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
//				answer = "NO";
//		}
		// 솔루션 3
		if(!str.equals(strReverse)) {
			answer = "NO";
		}
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Main7 T = new Main7();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		T.solution(str);

		kb.close();
	}

}

package test01;

import java.util.*;

public class Main6 {

	public String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
//	public String solution(String str) {
//		String answer = "";
//		for(int i = 0; i < str.length(); i++) {
////			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
//			
//			// 문자열의 i번째 문자열의 처음 등장하는 index
//			if(i == str.indexOf(str.charAt(i)))
//				answer += str.charAt(i);
//		}
//		
//		System.out.println(answer
//				);
//		return answer;
//	}
	
//	public String solution(String s) {
//		String answer;
//		StringBuilder sb = new StringBuilder();
//		int[] checker = new int[s.length()];
//		char[] cArr = s.toCharArray();
//
//		for (int i = 0; i < s.length(); i++) {
//			if (checker[i] == 0) {
//				sb.append(cArr[i]);
//				for (int j = i; j < s.length(); j++) {
//					if (cArr[i] == cArr[j]) {
//						checker[j] = 1;
//					}
//				}
//			}
//		}
//		answer = sb.toString();
//		return answer;
//	}

	public static void main(String[] args) {
		Main6 T = new Main6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		T.solution(str);
		kb.close();
	}

}

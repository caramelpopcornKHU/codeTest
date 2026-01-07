package test01;

import java.util.*;

public class Main8 {
	public String solution(String str) {
		String answer = "YES";
		// 솔루션 1
//		str = str.toUpperCase();
//		String reverseStr = new StringBuilder(str).reverse().toString();
//		char[] strArray = str.toCharArray();
//		char[] reverseStrArray = reverseStr.toCharArray();
//
//		// 특수문자 제거 문자열 만들기
//		String cleanStr = "";
//		String cleanReverseStr = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			// strArray단어가 알파벳이면 참값
//			if (Character.isAlphabetic(strArray[i])) {
//				cleanStr += strArray[i];
//			}
//			// reverseStrArray단어가 알파벳이면 참값
//			if (Character.isAlphabetic(reverseStrArray[i])) {
//				cleanReverseStr += reverseStrArray[i];
//			}
//		}
//
//		if (!cleanStr.equals(cleanReverseStr)) {
//			answer = "NO";
//		}

		// 솔루션 2
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String strReverse = new StringBuilder(str).reverse().toString();
		if(!str.equals(strReverse)) {
			answer = "NO";
		}
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Main8 T = new Main8();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		T.solution(str);
		kb.close();
		
		String example = "afqw!@#!adq";
		example = example.replaceAll("[^a-z]","");
		System.out.println(example);
	}

}

package test01;

import java.util.*;

public class Main4 {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList();

		// 솔루션 1
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}

		// 솔루션 2
//		for (String x : str) {
//			char[] s = x.toCharArray();
//			for (int i = 0; i < x.length() / 2; i++) {
//				char tmp = s[i];
//				s[i] = s[x.length() - i - 1];
//				s[x.length() - i - 1] = tmp;
//			}
//
//			String tmp = String.valueOf(s);
//			answer.add(tmp);
//		}
		
		// 솔수션 3
//		for (String x : str) {
//			int lt = 0, rt = x.length() - 1;
//			char[] s = x.toCharArray();
//			while (lt < rt) {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//			String tmp = String.valueOf(s);
//			answer.add(tmp);
//		}

		return answer;
	}

	public static void main(String[] args) {
		Main4 T = new Main4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}

		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
		kb.close();

	}

}

package test05;

import java.util.*;
import java.io.*;

public class Main {

	public String solution(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char x : s.toCharArray()) {
			if (x == '(') stack.push('(');
			else if (x == ')') {
				if (stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if (stack.size() == 0) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		System.out.println(T.solution(s));
	}

}

package test05;

import java.io.*;
import java.util.*;

public class Main2 {

	public String solution(String s) {
		StringBuilder sb = new StringBuilder();

		Stack<Character> stack = new Stack<Character>();

		for (char x : s.toCharArray()) {

			if (x == '(')
				stack.push(x);
			else if (x == ')')
				stack.pop();
			else if (stack.size() == 0)
				sb.append(x);

		}

		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		System.out.println(T.solution(s));

	}

}
 
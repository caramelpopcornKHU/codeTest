package test05;

import java.io.*;
import java.util.*;

public class Main4 {

	public int solution(String s) {
		Stack<Integer> stack = new Stack<Integer>();

		for (char x : s.toCharArray()) {
			if (Character.isDigit(x))
				stack.push(Integer.parseInt(Character.toString(x)));
			else {
				int b = stack.pop();
				int a = stack.pop();
				
				if (x == '+') {
					stack.push(a + b);
				} else if (x == '*') {
					stack.push(a * b);
				} else if (x == '-') {
					stack.push(a - b);
				} else if (x == '/') {
					stack.push(a / b);
				}
			}
		}
		
		return stack.pop();
	}

	public static void main(String[] args) throws IOException {
		Main4 T = new Main4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		System.out.println(T.solution(s));

	}

}

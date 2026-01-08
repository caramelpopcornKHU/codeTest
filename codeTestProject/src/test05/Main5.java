package test05;

import java.util.*;
import java.io.*;

public class Main5 {

	public int solution(String input) {
		int answer = 0;

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				// push
				stack.push(input.charAt(i));
			} else if (input.charAt(i) == ')') {
				// 괄호가 완성되었으니 pop 진행
				stack.pop();
				// case 1: 앞이 '('
				if (input.charAt(i - 1) == ')') {
					answer += 1;
				}
				// case 2: 앞이 ')'
				else if (input.charAt(i - 1) == '(') {
					answer += stack.size();
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main5 T = new Main5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		System.out.println(T.solution(input));

	}

}

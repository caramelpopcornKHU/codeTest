package test05;

import java.io.*;
import java.util.*;

public class Main7 {

	public String solution(String essential, String plan) {
		Deque<Character> essentialQueue = new ArrayDeque<>();

		for (char x : essential.toCharArray()) {
			essentialQueue.offer(x);
		}

		for (char x : plan.toCharArray()) {

			if (essentialQueue.peek() == x)
				essentialQueue.poll();
			if (essentialQueue.isEmpty())
				break;
		}

		if (essentialQueue.isEmpty())
			return "YES";
		else
			return "NO";

	}

	public static void main(String[] args) throws IOException {
		Main7 T = new Main7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String essential = br.readLine();
		String plan = br.readLine();

		System.out.println(T.solution(essential, plan));
	}

}

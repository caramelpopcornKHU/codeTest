package test01;

import java.util.*;
import java.io.*;

public class Test2 {

	public String solution(int n, String s) {
		StringBuilder sb = new StringBuilder();
		int lt = 0, rt = 7;

		s = s.replace('#', '1').replace('*', '0');

		for (int i = 0; i < n; i++) {

			sb.append((char) Integer.parseInt(s.substring(lt, rt), 2));

			lt += 7;
			rt += 7;
		}

		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		Test2 T = new Test2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = Integer.parseInt(br.readLine());
		String str = br.readLine();

		System.out.println(T.solution(i, str));

	}
}

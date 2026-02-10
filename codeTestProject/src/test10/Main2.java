package test10;

import java.io.*;
import java.util.*;

public class Main2 {

	static int[] dy;

	public int solution(int n) {
		dy[1] = 2;
		dy[2] = 3;
		dy[3] = 5;
		
		for(int i = 3; i <= n; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		
		return dy[n];
		
	}
	
	public static void main(String[] args) throws IOException {
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		dy = new int[n+1];
		
		System.out.println(T.solution(n));

	}

}

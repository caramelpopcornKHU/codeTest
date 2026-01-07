package test03;

import java.io.*;
import java.util.*;

public class Main3 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		int sum = 0;
		
		// 처음 m개 합
		for(int i = 0; i < m; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for (int i = m; i < n; i++) {
			sum += arr[i];
			sum -= arr[i-m];
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n,m,arr));
		
	}

}

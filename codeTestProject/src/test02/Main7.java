package test02;

import java.io.*;
import java.util.*;

public class Main7 {

	public int solution(int n, int[] arr) {
		int answer = 0;
		
		int cnt = 0;
		
		// 하나씩 꺼내오기
		for (int i = 0; i < n ; i++) {
			// 오답일때
			if(arr[i] == 0) {
				cnt = 0;
			} else { // 정답일때
				cnt++;
				answer += cnt;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		Main7 T = new Main7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n,arr));
		
	}

}

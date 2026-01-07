package test02;

import java.io.*;
import java.util.*;

public class Main8 {

	public int[] solution(int n, Integer[] arr) {
		int[] answer = new int[n];
		
		for (int i = 0; i < n; i++) {
			answer[i] = n;
			
			for(int j = 0; j < n; j++) {
				if(j != i) {
					if(arr[j] <= arr[i]) {
						answer[i] -= 1;
					}
				}
			}
				
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		Main8 T = new Main8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
		
	}

}

package test04;

import java.util.*;
import java.io.*;

public class Test {

	public int solution(int n, int k, int[] arr) {
		int answer = -1;

		HashMap<Character, Integer> map = new HashMap<>();
		// 배열의 조합 3개의 모든 경우의 수를 중복없이 담을 자료구조
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int p = j + 1; p < n; p++) {
					
					int sum = arr[i] + arr[j] + arr[p];
					tSet.add(sum);
					
				}
			}
		}
		
		
		int cnt = 1;
		for(int x : tSet) {
			
			if(cnt == k)
				answer = x;
			
			cnt++;
		}
		
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Test T = new Test();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, k, arr));

	}

}

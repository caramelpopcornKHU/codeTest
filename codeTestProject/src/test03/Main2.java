package test03;

import java.util.*;
import java.io.*;

public class Main2 {
	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		// O(nlog(n)) Quick Sort 알고리즘
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1 = 0, p2 = 0;
		
		while(p1 < n && p2 < m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			} else if(a[p1] < b[p2]) {
				p1++;
			} else {
				p2++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) throws IOException{
		Main2 T = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] b = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int x : T.solution(n,m,a,b)) {
			System.out.print(x + " ");
		}
		
	}

}

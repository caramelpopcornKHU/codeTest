package test07;

import java.io.*;
import java.util.*;

public class Main6 {

	static int n;
	static int[] ch; // check 배열

	public void DFS(int L) {

		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			if (tmp.length() > 0)
				System.out.println(tmp);
		} else {
			// 분기 1: L번째 숫자를 부분집합에 포함 시키고 다음
			ch[L] = 1;
			DFS(L + 1); 
			
			// 분기 2: L번째 숫자를 부분집합에서 배재 시키고 다음
			ch[L] = 0;
			DFS(L + 1); 

		}

	}

	public static void main(String[] args) {
		Main6 T = new Main6();
		n = 3;
		ch = new int[n + 1];
		T.DFS(1);
		
	}

}

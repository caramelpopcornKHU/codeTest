package test07;

import java.io.*;
import java.util.*;

public class Main {

	public void DFS(int n) {

		if (n == 0)
			return;
		else {
			// 자신이 자신을 호출
			DFS(n - 1);
			System.out.print(n + " ");
		}

	}

	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3);

	}

}

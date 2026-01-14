package test07;

import java.io.*;
import java.util.*;

public class Main3 {

	public int DFS(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		Main3 T = new Main3();
		System.out.println(T.DFS(5));

	}

}

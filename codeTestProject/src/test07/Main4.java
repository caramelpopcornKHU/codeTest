package test07;

public class Main4 {

	public static int[] fibo;
	
	public int DFS(int n) {
		// 메모이제이션
		if (fibo[n] > 0)
			return fibo[n];

		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
	}

	public static void main(String[] args) {
		Main4 T = new Main4();
		int n = 30;
		fibo = new int[n + 1];
		T.DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.println(fibo[i] + " ");
		}
	}

}

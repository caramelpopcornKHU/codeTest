package test04;

import java.util.*;
import java.io.*;

public class Main3 {

	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		HashMap<Integer, Integer> HM = new HashMap<>();

		// 0 1 2 3 4 ... k-1 k ...n
		for (int i = 0; i < k - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}

		int lt = 0;

		for (int rt = k - 1; rt < n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			// key값이 몇개 있냐
			answer.add(HM.size());
			
			// getOrDefault 안쓰고 get하는 이유: 이미 값이 들어가 있어서
			HM.put(arr[lt], HM.get(arr[lt]) - 1);
			if(HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}
			
			lt++;

		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main3 T = new Main3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

}

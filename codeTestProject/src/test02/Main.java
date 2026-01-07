package test02;

import java.util.*;

public class Main {

	public ArrayList<Integer> solution(int n, int[] nums) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(nums[0]);
		for(int i=1;i<nums.length;i++) {
			if(nums[i] > nums[i-1]) {
				answer.add(nums[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = kb.nextInt();
		}
		for(int i : T.solution(n, nums)) {
			System.out.print(i + " ");
		}
	}
	

}

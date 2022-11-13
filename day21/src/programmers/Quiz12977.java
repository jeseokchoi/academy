package programmers;

import java.util.ArrayList;
import java.util.List;

//	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
//	숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
//	nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 
//	solution 함수를 완성해주세요.

class Solution {
	public boolean isPrimeNumber(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private void initList() {
		boolean[] arr = new boolean[1000 + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i = 2; i * i < arr.length; i++) {
			if(arr[i] && isPrimeNumber(i)) {
				for(int j = i + i; j < arr.length; j += i) {
					arr[j] = false;
				}
			}
		}
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i]) {
				list.add(i);
			}
		}
	}
	
	List<Integer> list = new ArrayList<Integer>();
	
	public int solution(int[] nums) {
		int answer = -1;
		initList();
		System.out.println(list);
		System.out.println(list.size());
		
		return answer;
	}
}

public class Quiz12977 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(1 == s.solution(new int[] { 1, 2, 3, 4 }));
//		System.out.println(4 == s.solution(new int[] { 1, 2, 7, 6, 4 }));
	}
}
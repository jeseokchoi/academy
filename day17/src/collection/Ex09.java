package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		List<Integer> list2 = new ArrayList<Integer>(list);
		
		System.out.println(list);	// 정렬하기 전
		System.out.println("list2 : " + list2);
		
		list.sort((a, b) -> a - b);	// 오름차순
		System.out.println(list);
		System.out.println("list2 : " + list2);
		// 현재 sort를 선택정렬로 예시를 들어서 보여줬지만,
		// sort는 기본적으로 리스트의 길이에 따라 병합 정렬,
		// 퀵 정렬을 빠르게 작업하는 것이 효율이 더 좋다
		
		list.sort((a, b) -> b - a);	// 내림차순
		System.out.println(list);
	}
}

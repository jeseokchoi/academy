package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set은 크기가 있지만, index는 없다(순서가 없다). *값의 중복을 허용하지 않는다*(set의 사용이유)
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println("set의 크기 : " + set.size());
		// set.get(0);		// index를 이용해서 특정 값을 불러올 수 없다
		
		System.out.println(set);
		
//		for(int i = 0; i < set.size(); i++) {
//			index 를 이용한 반복문을 사용할 수 없다면?
//		}
		// foreach문 (향상된 for문)
		for(Integer num : set) {		// set 안에 들어있는 각 원소를 Integer 타입의 num에 저장해서
			System.out.println(num);	// 각 정수를 화면에 출력한다
		}	// 순회(순서대로 조회할 수 있음)
		// iterator(반복자, 인터페이스)
		Iterator<Integer> it = set.iterator();	// 반복자
		while(it.hasNext()) {					// sc.hasNext();	비슷하다
			Integer num = it.next();			// sc.next();		(필요할 때 꺼내서 쓰는 방식)
			System.out.println("num : " + num);
		}
		
	}
}

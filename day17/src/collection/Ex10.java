package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// (다른 Item2 와)비교가 가능한 클래스 Item2
class Item2 implements Comparable<Item2> {	// Ex07의 Item을 가져왔음
	String name;
	int price;
	
	Item2(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %,d원", name, price);
	}
	
	@Override
	public int compareTo(Item2 o) {				// Item2의 CompareTo
		return this.name.compareTo(o.name);		// String의 CompareTo
		// Item2 의 객체 this와 Item2의 또 다른 객체 o를 비교하려면
		// this의 name과 o의 name을 비교하여 그 차이를  int로 반환하면 된다
	}
}

public class Ex10 {
	public static void main(String[] args) {
		
		String[] arr = { "이지은", "연우", "장원영", "김종국", "송지효" };
		List<String> list = Arrays.asList(arr);
		
		System.out.println(list);
		
		list.sort(null);		// Comparator를 전달하지 않았는데 왜 정렬이 되는가?
								// Serializable, CharSequence, *Comparable<String> * T - the type of objects that this object may be compared to
								// 정렬된 이유는 String 클래스에 내장이 되어있기 때문
		
		System.out.println(list);
		
		// Comparable 객체의 compareTo 메서드 테스트
		ArrayList<Item2> list2 = new ArrayList<Item2>();
		
		list2.add(new Item2("오레오", 2000));
		list2.add(new Item2("콘칩", 1900));
		list2.add(new Item2("바밤바", 1200));
		list2.add(new Item2("오예스", 2900));
		list2.add(new Item2("초코파이", 2500));
		
		list2.forEach(System.out::println);
		System.out.println();
		
		list2.sort(null);
		
		list2.forEach(System.out::println);
		System.out.println();
	}
}

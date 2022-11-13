package collection;

import java.util.ArrayList;
import java.util.List;

class Food implements Comparable<Food>{
	String name, menu;
	int price;
	
	Food(String name, String menu, int price){
		this.name = name;
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] %s : %,d원", name, menu, price);
	}
	@Override
	public int compareTo(Food o) {
		return o.price - this.price;
				
	}

}

public class Ex11 {
	public static void main(String[] args) {
		// 메인함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구형하세요
		
		Food f1 = new Food("BHC", "핫후라이드", 18000);
		Food f2 = new Food("BHC", "맛초킹", 18000);
		Food f3 = new Food("BBQ", "황금올리브", 20000);
		Food f4 = new Food("푸라닭", "블랙알리오", 18000);
		Food f5 = new Food("지코바", "순살양념숯불치킨", 20000);
		
		List<Food> list = new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		list.forEach(food -> System.out.println(food));
		System.out.println();
		list.sort(null);	// 기본정렬하면 가격 내림차순으로 정렬하기
		
		list.forEach(food -> System.out.println(food));
		System.out.println();
							// 여기에는 직접 기준을 지정하여, 브랜드 기준 오름차순으로 정렬하기
//		list.sort((a, b) -> { return a.brand.compareTo(b.brand); });
		list.sort((a, b) -> a.name.compareTo(b.name));
		
		list.forEach(food -> System.out.println(food));
		System.out.println();
		
	}
}

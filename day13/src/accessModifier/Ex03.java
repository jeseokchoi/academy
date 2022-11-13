package accessModifier;

class Food{							// 맴버필드
	private String name;		
	private int price;
	
	public Food(String name, int price) {		// 메서드

		this.name = name;
		this.price = price;
	}
	public Food() {}	// 따로 Food라는 비어있는 메서드를 만들면(선생님)
	
	// private 필드의 getter/setter를 자동으로 작성하기
	// source - generate getters and setters

	public String getName() {				
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 클래스의 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
//		Food fd1 = new Food("탕수육", 18000);
//		Food fd2 = new Food("깐풍기", 21000);
		
		Food ob1 = new Food();		// 비어있는 객체, 값을 담을 수는 있지만 "()"아직 없음
		Food ob2 = new Food();
		
		ob1.setName("치킨");			// ob1.name = "치킨";
		ob1.setPrice(20000);		// ob1.price = 20000;
		
		// 각 객체의 이름과 가격을 printf()를 이용하여 같은 서식으로 출력하세요
//		System.out.printf(fd1.getName() + "은 " + fd1.getPrice() + "원 이었나요? \n");
//		System.out.printf(fd2.getName() + "은 " + fd2.getPrice() + "원 일까요? ");
		
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice());
		
		ob1 = new Food("치킨", 20000);		// 두개의 필드에 대해 setter를 호출한 것과 같다
		ob2 = new Food("떡튀순", 15000);
		
		System.out.printf("%s : %,d원\n", ob1.getName(), ob1.getPrice());
		System.out.printf("%s : %,d원\n", ob2.getName(), ob2.getPrice());
		
	}

}

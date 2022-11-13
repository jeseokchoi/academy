package summary;

public class Human extends Object{

	String name;	// 필드(field)
	// 접근자(access modifier)
	public Human(String name) {	// 생성자(constructor)
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	public String getGive() {
//		return "건네";
//	}


	public void give(Companion c) {	// 메서드
		String form = "%s이 %s에게 %s %s준다\n";
		String feed = c.getFeed();
		
		String method = "";			// 슈퍼 클래스 타입으로 묶어서 받아도, 필요하면 구별할 수 있다
		if(c instanceof Animal)		method = "던져";
		if(c instanceof Human)		method = "건네";
		
		System.out.printf(form, name, c.getName(), feed, method);
		
	}

}

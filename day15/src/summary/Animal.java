package summary;
		// 슈퍼클래스를 이용한 상속방법
public abstract class Animal {
	
	String name;
	
	Animal(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	public String getGive() {
//		return "던져";
//	}
//	abstract String getFeed(); // 인터페이스에서 가져오기 때문에 없어도 문제없다
}

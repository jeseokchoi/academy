package airplane;

public class Doctor extends Human {
	void heal(Human other) {
		System.out.println(other.name + "치료");
	}
	
	Doctor(String name, String job){
		super(name, job);
	}
	
	@Override
	public void show() {
		System.out.printf("이름 : %s 직업 : %s\n", name, job);
	}

}

package airplane;

public class Lawyer extends Human{
	
	Lawyer(String name, String job){
		super(name, job);
	}

	@Override
	public void show() {
		System.out.printf("이름 : %s 직업 : %s\n", name, job);
	}
}

package airplane;

public class Singer extends Human {
	
	Singer(String name, String job){
		super(name, job);
	}
	
	@Override
	public void show() {
		System.out.printf("이름 : %s 직업 : %s\n", name, job);
	}

}

package abstractClass;

abstract class Button{
	// abstract 메서드는 상속받아서 써야하기 때문에 private으로 지정할 수 없다
	// protected 혹은 public으로 설정해야 한다
	// protected : 패키지가 달라도 상속관계에 있으면 접근 가능
	// public : 패키지나 상속여부에 상관없이 누구나 접근 가능
	protected abstract void onclick();
	
	public void click() {
		this.onclick();	// 어떻게 실행되는지 작성됨
	}
}
class MessageButton extends Button{

	@Override
	protected void onclick() {
		System.out.println("Hello World !!");
		
	}
	
	
}

class NotepadButton extends Button{

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "notepad";				// 실행할 명령어
			Process pro = rt.exec(cmd);			// 실행후 프로세스를 저장해두었다가
			Thread.sleep(2000);					// 2초 후
			pro.destroy();						// 프로세스를 종료한다
		} catch(Exception e) {}
	}
	
	
}

class CaltButton extends Button{

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "calc";				// 실행할 명령어
			rt.exec(cmd);
		
		}catch(Exception e) {}
		
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
//		Button btn1 = new Button();
		
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
		NotepadButton btn3 = new NotepadButton();
		btn3.click();
		
		Button btn4 = new CaltButton();	// 서브클래스의 객체를 슈퍼클래스로 참조한다
		btn4.click();
		// 추상 클래스가 직접 객체를 생성할 수는 없지만, 자료형으로써 참조변수를 사용하는 것은 가능하다
		
		// private int = 0; 안됨
		Button btn5 = new Button() {	// 익명 내부 클래스(즉석에서 만든 클래스 )
			private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";	// 클래스의 형식을 갖춘다
			private String url = " https://search.naver.com/search.naver?query=아이유";
			
			@Override
			protected void onclick() {
				try {
					Runtime rt = Runtime.getRuntime();
//					private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";	// 위에 객체와 둘다 사용가능함
//					private String url = " https://search.naver.com/search.naver?query=아이유";
					cmd += url;
					rt.exec(cmd);
				}catch(Exception e) {}
			}
		};
		btn5.click();
	}	

}

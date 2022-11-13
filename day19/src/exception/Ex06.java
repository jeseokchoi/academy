package exception;

class Test6 {
	// 현재 메서드 내부에서 발생하는 NullPointerException을 caller에게 전가시킨다
	void method1() {
		String str = null;
		
//		try {
		System.out.println(str.charAt(0));
//		} catch(NullPointerException e) {
//			System.out.println("null값에 대한 메서드를 호출할 수 없습니다");
//		}
	}
	
	void method2() {
		int[] arr = { 2, 7, 8, 4, 6 };

//		try {
		System.out.println(arr[5]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 인덱스는 길이보다 작아야 합니다");
//		}
		}
}

public class Ex06 {
	public static void main(String[] args) {
		// throws : 현재 함수에서 발생한 예외의 처리를 caller에게 전가시킨다
		// RunTimeException : 잠재적인 예외 요소이지만 넘어갈 수 있는 예외처리
		// NullPointerException 샹놈ㅋ
		Test6 ob = new Test6();

		try {
		ob.method1();
		ob.method2();
		} catch(Exception e) {	// 위에 try~catch를 사용하지않고 이렇게 처리해도 된다
			System.out.println("알수없는 예외가 발생");
		}
		
	}
}

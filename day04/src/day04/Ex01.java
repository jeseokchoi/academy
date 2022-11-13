package day04;

public class Ex01 {
				// 함수의 정의
	static int pow(int num, int count) {	// in num, int count = 매개변수, 매개체를 받아주는 함수
		int result = 1;						 
		for(int i = 0; i < count; i++) {
			result *= num;
		}
		return result;
	}

	public static void main(String[] args) {
		// 함수 : 특정 값을 만들어내는 수식(코드의 묶음), 동작을 만들어낸다 라고도 말함
		// x값에 따라서, 서로 다른  y값을 계산하여 반환하는 코드의 묶음
		// y = f(x)
		
		// 함수 = function = 기능 
		int n1 = pow(2, 10);	//함수의 호출		// pow는 2의 10승을 계산하는 함수이다 ()안의 값을 '인자'라고한다
		System.out.println("n1 : " + n1);
		
		// 함수의 정의 : 함수의 형태를 정의한다. 반환자료형, 함수이름, 매개변수를 작성하고
		//			 함수가 실행되면 수행할 코드를 {}안쪽에 작성한다
		//			 함수는 마지막에 반환자료형에 맞는 값을 반드시 return해야 한다
		
		// 함수의 호출 : 이미 정의되어 있는 함수의 이름을 부르면서(call) 인자값을 전달한다
		//			 함수를 호출하면 정의된 내용을 수행하고, 결과값을 호출자리로 반환한다
		
		// 자바의 함수는 반드시 반환자료형에 명시된 값을 반환해야 한다
		// 제어문에 의해 분기가 나누어지더라도 반드시 반환값을 처리해주어야 한다
		
		// 연습문제) 정수의 절대값을 반환하는 함수 abs를 작성하여 테스트하세요
		// 여기서 함수 호출코드를 작성합니다
		int n2 = abs(-9);
		System.out.println("n2 : " + n2);
		
		
		// 결과를 출력합니다
	}
	// 절대값을 반환하는 함수를 여기 아래에 작성(정의)합니다
	static int abs(int num2) {
		int result1 = num2 < 0 ? -num2 : num2;
		return result1;
		
	}
	
	
}

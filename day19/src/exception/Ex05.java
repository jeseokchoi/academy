package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException2 extends Exception{
	private static final long serialVersionUID = 1L;
}

public class Ex05 {

	static boolean insert(char oper) {
		if (oper == '+') {
			return false;
		}
		if (oper == '-') {
			return false;
		}
		if (oper == '*') {
			return false;
		}
		if (oper == '/') {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char oper;
		int result = 0;

		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다

		try {
			System.out.print("정수입력 : ");
			n1 = sc.nextInt();

			System.out.print("연산자 입력 : ");
			oper = sc.next().charAt(0);

			System.out.print("정수입력 : ");
			n2 = sc.nextInt();

			if (oper == '+')
				result = n1 + n2;
			if (oper == '-')
				result = n1 - n2;
			if (oper == '*')
				result = n1 * n2;
			if (oper == '/')
				result = n1 / n2;
			if(result > 2100000000 || result < -2100000000) {
				MyException2 ex = new MyException2();
				throw ex;
			}

			System.out.printf("%d %c %d = %d\n", n1, oper, n2, result);

		} catch (InputMismatchException e) {
			System.err.println("정수형 데이터를 입력해야 합니다");
		
		} catch (ArithmeticException e) {	// 정수를 0으로 나눌때 발생할 수 있는 예외
			System.err.println("올바른 정수를 입력해야 합니다");
			
		} catch (NumberFormatException e) {	// 문자열을 숫자로 변환할 때 발생할 수 있는 예외
			System.err.println("정수를 입력해야 합니다");
			
		} catch (MyException2 e) {
			System.err.println("출력가능한 값을 넘었습니다");

		} catch (Exception e) { // 모든 예외를 받아서
			e.printStackTrace(); // 예외 발생 현황을 추적하면서 출력한다 (기본값)
		} finally {
			sc.close();
		}
		System.out.println("종료");
	}
}

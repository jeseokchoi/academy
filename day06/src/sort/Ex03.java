package sort;

public class Ex03 {

	public static void main(String[] args) {
		// 두 변수의 값을 교환하기
		
		int n1 = 10, n2 = 20;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		
		int a1 = n2;
		int a2 = n1;
		System.out.printf("n1 : %d, n2 : %d\n", a1, a2);
		
		
		int tmp = n1;		// tmp : 임시 변수(잠깐 결과값을 옮기는 용도)
		n1 = n2;
		n2 = tmp;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
	}

}

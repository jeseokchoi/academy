package day05;

public class Quiz03 {
	// 선생님 풀이
	// 배열이나 문자열의 인덱스는 항상 0부터 시작하여 (길이 - 1)까지 존재한다
	static int min(int...args) {
		int ret = 10000000;
		// if문 사용
//		if(ret > args[0])	ret = args[0];
//		if(ret > args[1])	ret = args[1];
//		if(ret > args[2])	ret = args[2];
		// for문 사용
		for(int i = 0; i < args.length; i++) {
			int num = args[i];
			if(ret > num) {
				ret = num;
			}
		}
//		System.out.println(ret);
		return ret;
	}	
	// 내 풀이
//	static int min(int n1, int n2, int n3) {
//		int result = n1;
//		
//		if(n2 < result)
//			result = n2;
//		if(n2 < result)
//			result = n3;

//		return result;
//	}

	static int count(String str1, char ch2) {
		int num = 0;
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch == ch2) {  // ch2와 ch의 자료형은 char(primitive)
				num++;
			}
		}
		return num;
	}
	
	static boolean check(String str) {
		boolean flag = true;
		// 1) 길이가 일치하는가?
			if(str.length() !=19)
				flag = false;
			
		// 2) -의 개수가 일치하는가? (함수의 재사용)
			if(count(str, '-') != 3)
				flag = false;
			
		// 3) split으로 분리했을 때, 분리된 요소가 4개이고, 각 요소의 자릿수가 4인가
			String[] arr = str.split("-");
			if(arr.length != 4)
			flag = false;
			
		// 4) split으로 분리했을 때, 각 요소의 자릿수가 4인가	
			for(int i = 0; i < arr.length; i++) {
				String s = arr[i];
//				System.out.println("s : " + s); // 어떻게 돌아가는지 체크하기 위한것
				if(s.length() != 4)
					flag = false;
			}
			return flag;
	}
	
	public static void main(String[] args) {
		// 1) 정수를 여러개 전달받아서, 최소값을 반환하는 함수를 작성하세요
		int n1 = min(10, 5, 11);
		System.out.println("n1 : " + n1);
		
		// 2) 문자열에서 특정 글자가 몇개 포함되어있는지 반환하는 함수를 작성하세요 (for문)
		int n2 = count("Life is too short, you need python", 'e');
		System.out.println("n2 : " + n2);
		
		// 3) 문자열 형태로 카드번호를 입력받아서, 길이가 맞는지 확인하는 함수를 작성하세요
		// 전체길이, -의 개수, 분리했을때 각 단위의 길이가 맞아야 한다
		boolean b1 = check("1234-1234-1234-1234");		// true
		boolean b2 = check("867-2356123-1234567");		// false
		boolean b3 = check("930516-2345678");			// false
		boolean b4 = check("123-45678-9-1234567");		// false
		System.out.printf("%b, %b, %b, %b\n", b1, b2, b3, b4);
		

	}

}

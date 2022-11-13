package day04;

public class Ex03 {

	public static void main(String[] args) {
		// String 클래스의 메서드
		// 1) 문자열 객체에서 호출할 수 있는 함수
		String s1 = "Hello";
		
		char ch = s1.charAt(0);		// i번째 글자를 char형으로 반환하는 함수
		
		String s2 = s1.concat(", world !!");	// 문자열 덧셈(+)
		
		boolean b1 = s1.contains("lo");		// s1이 "lo"를 포함하는가? true/false
		
		boolean b2 = s1.endsWith("llo");	// s1이 "llo"로 끝나는가?
		
		boolean b3 = s1.equals("hello");	// s1이 "hello"와 같은 내용인가?
		
		int index1 = s1.indexOf("el");		// s1에서 el이라는 글자는 몇번째에 있는가?
		
		int lenght = s1.length();			// s1의 내용이 총 몇글자인가?
		
		int index2 = "ABCDEFG".indexOf("FA");	
		
		System.out.println(s1);
		System.out.println(ch);
		System.out.println(s2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(index1);
		System.out.println(lenght);
		System.out.println(index2);
		
		// 2) String 자료형에서 호출할 수 있는 함수 
	
	}

}

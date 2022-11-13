package day02;

import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) throws IOException {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력할 수 있어야 합니다
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 변수 선언
		String name, address;
		int age;
		
		// 2) 입력
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
//		age = sc.nextInt();
//		sc.nextLine();
		age = Integer.parseInt(sc.nextLine()); // 엔터키 함수값을 한번에 처리 가능(nextLine 포함해서)
		
		System.out.print("주소 입력 : ");
		address = sc.nextLine();
		
		// 3) 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
		// 4) 마무리
		sc.close();
	}

}

package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 사용자 입력 > main의 지역변수 > 클래스의 생성자로 전달 > 객체의 멤버필드에 저장 > 객체를 배열에 저장
		//		  (사용자 입력)int kor				(Student)int kor	arr[] 저장
			
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		Student ob;
		int select, row;
		String find, result, sub;
		String name;
		int kor, eng, mat, grade;
		
		do {
			System.out.println("\t학생점수 관리 프로그램\n\n");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색(단일)");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			
			case 1:		// 전체목록
				result = hd.selectAll();
				System.out.println(result);
				break;
			case 2:		// 추가
				System.out.print("이름 입력 : ");	name = sc.nextLine();
				System.out.print("국어 점수 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수 : ");	mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);
				row = hd.insert(ob);
				if(row == 1)	System.out.println("추가 성공");
				if(row == 0)	System.out.println("추가 실패");
				break;
			case 3:		// 검색(이름으로)
				System.out.print("검색할 이름입력 : ");
				find = sc.nextLine();
				result = hd.search(find);
				if(result != null)	System.out.println(result);
				if(result == null)	System.out.println("결과가 없습니다. ");
				break;
			case 4:		// 수정
				System.out.print("수정할 이름입력 : ");
				find = sc.nextLine();
				System.out.print("수정할 과목입력 : ");
				sub = sc.nextLine();
				System.out.print("점수 입력 : ");
				grade = Integer.parseInt(sc.nextLine());
				row = hd.upDate(find, sub, grade);
				if(row == 1)	System.out.println("수정 성공");
				if(row == 0)	System.out.println("수정 실패");
				break;
			case 5:		// 삭제
				System.out.print("삭제할 학생 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				if(row == 1)	System.out.println("삭제 되었습니다.");
				if(row == 0)	System.out.println("결과가 없습니다.");
				break;
			}
		} while(select != 0);
		System.out.println("=== 조옹료 ===");
		sc.close();
	}

}

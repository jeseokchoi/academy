package management;	// 기능을 수행하는 클래스

import java.util.Scanner;

import model.ComputerScieneceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		EnglishLinguisticStudent st1 = new EnglishLinguisticStudent("이지은", 90, 80, 60, 70, 70);
		ComputerScieneceStudent st2 = new ComputerScieneceStudent("최제석", 80, 90, 30, 60, 40, 48);
		handler.insert(st1);
		handler.insert(st2);
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		int select, row;
		String name;
		
		System.out.println("\n\t학생 관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				row = handler.showList();
				System.out.println(row == 1 ? "" : "목록 없음");
				break;
				
			case 2:
				System.out.print("학생 유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1)  st = makeEnglishLinguisticStudent(sc);
				if(select == 2)  st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달하여 일치하는 학생을 찾기
				if(st != null)	st.showDetail();
				else 			System.out.println(name + " 학생을 찾을 수 없습니다");
				break;
				
			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달받아서, 이름이 일치하는 학생 객체를 반환
				row = handler.delete(st);	// 그 학생을 전달하여 배열에서 제거
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");	
				break;
			}
			
		} while(select != 0);
		sc.close();
		System.out.println("종료");
		
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int kor, eng, mat, literature, translation;
		
		System.out.print("[영어영문학] : ");	name = sc.nextLine();
		System.out.print("국어 : ");			kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");			eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");			mat = Integer.parseInt(sc.nextLine());
		System.out.print("문학 : ");			literature = Integer.parseInt(sc.nextLine());
		System.out.print("번역 : ");			translation = Integer.parseInt(sc.nextLine());
		
		return new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);
		
	}
	
	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int kor, eng, mat, java, network, linux;
		
		System.out.print("[컴퓨터공학] : ");	name = sc.nextLine();
		System.out.print("국어 : ");			kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");			eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");			mat = Integer.parseInt(sc.nextLine());
		System.out.print("자바 : ");			java = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크 : ");		network = Integer.parseInt(sc.nextLine());;
		System.out.print("리눅스 : ");			linux = Integer.parseInt(sc.nextLine());
			
		return new ComputerScieneceStudent(name, kor, eng, mat, java, network, linux);
	}

}



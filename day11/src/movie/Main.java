package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		
		Movie t1 = new Movie("블랙아담", "자움 콜렛 세라", 
				"드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스윈들".split(","), 
				"액션", 125, sdf.parse("2022-10-19"), 7.63);		
		Movie t2 = new Movie("A", "B", "C,D,E".split(","), "F", 100, sdf.parse("2000-01-01"), 10.0);
		Movie t3 = new Movie("G", "H", "I,J".split(","), "K", 100, sdf.parse("2000-05-05"), 3.14);
		
		Handler.arr[0] = t1;	// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
	}


	
	public static void main(String[] args) throws ParseException {
		
		prepareDummy();
		System.out.println(Handler.getList());
		
		
		Scanner sc = new Scanner(System.in);
		int row = 0, menu;
		String keyword;
		
		do {
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 추가");
			System.out.println("3. 단일 검색");
			System.out.println("4. 다중 검색");
			System.out.println("5. 영화 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				keyword = Handler.getList();
				System.out.println(keyword);
				break;
				
			case 2: 
				Movie mv = input(sc);
				row = Handler.insert(mv);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 3: 
				System.out.print("검색어를 입력 : ");
				keyword = sc.nextLine();
				System.out.println(Handler.search(keyword)); 
				break;
			case 4: 
				System.out.print("검색어를 입력 : ");
				keyword = sc.nextLine();
				System.out.println(Handler.searchList(keyword)); 
				break;
			case 5:
				System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
				menu = Integer.parseInt(sc.nextLine());
				row = delete(sc, menu);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				
				
				
			}
				
		} while(menu != 0);
		System.out.println("=== 종료다 ===");
		sc.close();
	}
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String title;
		if(menu == 1) {	// 번호로 삭제하기
			System.out.print("영화 번호를 입력하세요 : ");
			index = Integer.parseInt(sc.nextLine());
			row = Handler.delete(index);
		}
		else if(menu == 2) {	// 제목으로 삭제하기
			System.out.print("영화 제목을 입력하세요 : ");
			title = sc.nextLine();
			row = Handler.delete(title);
		}
		else {
			System.out.println("메뉴 선택이 잘못되었습니다. 다시 시도해주세요");
		}
		return row;
	}



	static Movie input(Scanner sc) throws ParseException {
		String title, director, actors, genre;
		int runningTime;
		String openningDate;
		double grade;
		
		System.out.print("영화 제목 : ");	title = sc.nextLine();
		System.out.print("영화 감독 : ");	director = sc.nextLine();
		System.out.print("영화 배우 : ");	actors = sc.nextLine();
		System.out.print("영화 장르 : ");	genre = sc.nextLine();
		System.out.print("상영 시간 : ");	runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("영화 개봉일 : ");	openningDate = sc.nextLine();
		System.out.print("영화 평점 : ");	grade = Double.parseDouble(sc.nextLine());
		
		Movie mv = new Movie(title, director, actors.split(","), genre, runningTime, sdf.parse(openningDate), grade);
		return mv;
		
		}


}	



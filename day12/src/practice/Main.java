package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) throws ParseException {
		
		int select, row;
		String keyword, result;
		String title;		
		String director;	
		String[] actors;	
		String genre;		
		int runningTime;	
		Date openningDate;	
		double grade;		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler(); 
		
		do {
			System.out.println("1. 리스트");
			System.out.println("2. 영화검색");
			System.out.println("3. 영화추가");
			System.out.println("4. 영화수정");
			System.out.println("5. 삭제");
			System.out.println("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:	// 리스트
				result = hd.getList();
				System.out.println(result);
				break;
			case 2:	// 검색
				System.out.println("영화검색 : ");
				result = sc.nextLine();
				result = hd.search(result);
				if(result != null) System.out.println(result);
				if(result == null) System.out.println("결과가 없습니다.");
				break;
			case 3:	// 추가
				System.out.print("영화제목 : ");	title = sc.nextLine();
				System.out.print("감독 : ");		director = sc.nextLine();
				System.out.print("배우들 : ");		actors = sc.nextLine().split(",");
				System.out.print("장르 : ");		genre = sc.nextLine();
				System.out.print("상영시간 : ");	runningTime = Integer.parseInt(sc.nextLine());
				System.out.print("영화 개봉일: ");	openningDate = sdf.parse(sc.nextLine());
				System.out.print("평점 : ");		grade = Double.parseDouble(sc.nextLine());
				Movie ob = new Movie(title, director, actors, genre, runningTime, openningDate, grade);
				row = hd.insert(ob);
				if(row == 1)	System.out.println("추가 성공");
				if(row == 0)	System.out.println("추가 실패");
				break;
			case 4:	// 수정
				System.out.print("수정할 영화제목 입력 : ");
				keyword = sc.nextLine();
				System.out.println("변경할 영화제목 입력 : ");
				title = sc.nextLine();
				row = hd.update(keyword, title);
				if(row == 1) System.out.println("수정성공");
				if(row == 0) System.out.println("수정실패");
				break;
			case 5:	// 삭제
				System.out.println("영화검색 : ");
				keyword = sc.nextLine();
				row = hd.delete(keyword);
				if(keyword != null) System.out.println("삭제 성공");
				if(keyword == null) System.out.println("삭제 실패");
				break;
			}
			
		}while(select != 0);
		sc.close();
	}
}

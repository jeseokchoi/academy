package book;

import java.util.Scanner;

public class Main {
	
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		int list;
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		do {
			System.out.println("1. 책 추가");
			System.out.println("2. 책 목록");
			System.out.println("3. 책 목록삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			list = Integer.parseInt(sc.nextLine());
			
			switch(list){
			case 1:
				Book ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 2:  
				handler.show();
				break;
				
			case 3:
				Book ob1 = deleting(sc);
				result = handler.delete(ob1);
				System.out.println(result == 1 ? "삭제 성공" : "삭제 실패");
				break;
			}
			
		} while(list != 0);
		System.out.println("=== 프로그램 종료요 ===");
		sc.close();
	}
	
	static Book input(Scanner sc) {
		String title, writer, publisher;
		int price;
		double starPoint;
		
		System.out.print("제목 : "); 		title = sc.nextLine();
		System.out.print("작가 : "); 		writer = sc.nextLine();
		System.out.print("출판사 : "); 	publisher = sc.nextLine();
		System.out.print("가격 : "); 		price = Integer.parseInt(sc.nextLine());
		System.out.print("별점 : "); 		starPoint = Double.parseDouble(sc.nextLine());
		
		Book ob = new Book(title, writer, publisher, price, starPoint);
		return ob;
		
	}
	
	static Book deleting(Scanner sc) {
		String title, writer;
		
		System.out.print("제목 : ");		title = sc.nextLine();
		System.out.print("작가 : ");		writer = sc.nextLine();
		
		Book ob1 = new Book(title, writer);
		return ob1;
	}
}

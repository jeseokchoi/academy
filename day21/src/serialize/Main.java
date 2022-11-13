package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
		Handler handler = new Handler();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Scanner sc = new Scanner(System.in);
		int select;
		String title;
		Date date;
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("제목 : ");		
				title = sc.nextLine();
				System.out.print("날짜 : ");		
				date = sdf.parse(sc.nextLine());
				handler.insert(new Todo(title, date));
				break;
			case 3:
				System.out.print("삭제 데이터 입력 : ");
				title = sc.nextLine();
				System.out.print("날짜 입력 : ");
				date = sdf.parse(sc.nextLine());
				handler.delete(new Todo(title, date));
				break;
			case 0:
				handler.save();
				System.out.println("저장완료");
				break;
			}
			
		} while(select != 0);
		sc.close();
	}
}

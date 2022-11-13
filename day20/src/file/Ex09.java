package file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException{
		File f = new File("ex08.txt");
		Scanner sc = new Scanner(f);
		List<Menu> list = new ArrayList<Menu>();
		
		while(sc.hasNextLine()) {	// 줄바꿈이 있냐 없냐를 구분하는 단어(\n = true(있음=반복)/false(없음=종료))
			String line = sc.nextLine();
			String[] arr = line.split(":");
			String name = arr[0];
			int price = Integer.parseInt(arr[1]);
			Menu ob = new Menu(name, price);
			list.add(ob);
		}
		list.forEach(menu -> menu.show());
		
//		for(int i = 0; i < list.size(); i++) {	//forEach 해석
//			Menu menu = list.get(i);
//			menu.show();
//		}
		
		sc.close();
	}
}

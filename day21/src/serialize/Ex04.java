package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("ex03.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Todo> list = (ArrayList<Todo>) ois.readObject();
		ois.close();
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리하세요
		
		
		for(int i = 0; i < list.size(); i++) {						// array, list 둘다 가능
			Todo t = list.get(i);										// 제어문을 쓰냐 안쓰냐가 차이 반복문을 쓰냐 안쓰냐, 한 줄로 처리하는지가 중요
			System.out.println(t);											// list, set, map 포함
		}																		// 컬렉션은 함수를 이용해서 작업하고, 반복문을 사용해서 작업하는것을 선호하지 않는다
		System.out.println("\n=======================\n");
		
		for(Todo t : list) {										// array, list 둘다 가능
			System.out.println(t);
		}
		System.out.println("\n=======================\n");
		
		list.forEach(t -> System.out.println(t));					// list만 됨
		System.out.println("\n=======================\n");
		
		list.forEach(System.out::println);							// list만 됨
		System.out.println("\n=======================\n");
	}
}

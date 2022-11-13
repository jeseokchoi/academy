package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Handler {
	private ArrayList<Todo> list;
	public Handler() throws IOException, ClassNotFoundException{
		this.load();
		System.out.println("데이터를 불러왔습니다");
	}
	
	@SuppressWarnings("unchecked")
	private void load() throws IOException, ClassNotFoundException {		// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		FileInputStream fis = new FileInputStream("ex03.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();
	}
	
	public void showList() {
		for(Todo t : list) {
			System.out.println(t);
		}
		System.out.println("목록을 불러왔습니다");
	}
	
	public void save() throws FileNotFoundException, IOException {		// main에서 호출함. 리스트 객체를 파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
	}
	
	public void insert(Todo todo) throws IOException {	// 객체를 전달받아서 추가하기
		list.add(todo);
		}
	
	
	public void delete(Todo todo) {	// 선택한 객체의 index를 확인하여 제거하기
//		list.removeIf(t -> t.getTitle().equals(title));
//		System.out.println("삭제성공");
		
		list.removeIf(t -> t.toString().equals(todo.toString()));
		System.out.println("삭제성공");
		
	}
}

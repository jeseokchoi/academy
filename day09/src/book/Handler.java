package book;

public class Handler {
	
	Book[] arr = new Book[20];
	
	int insert(Book ob) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	int delete(Book ob1) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.equals(ob1.title)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	void show() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
		}
	}

}

package book;

public class Book {
	String title, title2;
	String writer, writer2;
	String publisher;
	int price;
	double starPoint;
	
	Book(String title, String writer, String publisher, int price, double starPoint){
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.starPoint = starPoint;
	}
	
	Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	void show() {
		String form = "%s ( %s | %s )\t%,d원 (★%.1f)";
		form = String.format(form, title, writer, publisher, price, starPoint);
		System.out.println(form);
	}
	
}

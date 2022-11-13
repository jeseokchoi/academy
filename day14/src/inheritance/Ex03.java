package inheritance;

class Super{
	int n1;
	Super(int n1){
		this.n1 = n1;
		System.out.println("Super 생성자 호출");
	}
}
class Sub extends Super{
	int n2;
	Sub(int n1, int n2){
		super(n1);	// 슈퍼 클래스에서 this.n1을 받아준다 따로 안적어도 됨
		this.n2 = n2;
		System.out.println("Sub 생성자 호출");	//  (따로 안적어줘도) 기본생성자이기 때문에 첫 줄에 Super가 들어가 있다(매개변수는 나중에 넣었음)
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Sub ob = new Sub(10, 20);
		System.out.printf("n1 : %d, n2 : %d\n", ob.n1, ob.n2);
	}

}

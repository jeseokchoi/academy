package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		
		Human h1 = new Doctor("최제석", "정신과 의사");
		Human h2 = new Doctor("이지은", "소아과 의사");
		Human h3 = new Singer("아이유", "국힙원탑");
		Human h4 = new Singer("쌈디", "래퍼");
		Human h5 = new Lawyer("우영우", "변호사");
		Human h6 = new Lawyer("남궁민", "변호사");
			
		air.entrance(h1);
		air.entrance(h6);
		air.entrance(h3);
		air.entrance(h4);
		air.entrance(h5);
		air.entrance(h2);
		
//		int num = air.emergency();
//		// 비행기 내부에서 의사가 있다면, 의사의 heal()함수를 호출하여 대상을 치료하는 코드를 작성하세요
//		for(int i = 0; i < air.arr.length; i++) {
//			if(air.arr[num] != air.arr[i] && air.arr[i] instanceof Doctor) {
//				Doctor d = (Doctor) air.arr[i];
//				System.out.println(d.name + d.job);
//				d.heal(air.arr[num]);
//				break;
//			}
//		}
		air.plaen();
		

		
		
		
	 }
		
}
	

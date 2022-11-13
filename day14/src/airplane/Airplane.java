package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();
	private boolean full = false;

	Human[] arr = new Human[5];
	//Human[] arr = { ㅇ, ㅇ, ㅇ, ㅇ, ㅇ}
	
	public int entrance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				System.out.println(c.name + " 탑승완료");
				return 1;
			}
		}
		System.out.println(c.name + " 탑승 불가");
		return 0;
	}

	public int emergency() {
		
		int index;
		int cnt = 0;
		do {
			index = ran.nextInt(arr.length);
			if(cnt > 100) {
				System.out.println("탑승객이 없습니다.");
				return - 1;
			}
			cnt++;
		}while(arr[index] == null);
		
		System.out.println(arr[index].name + " 고객이 아픕니다");
		return index;
	}
	public void plaen() {
		
		int num = emergency();
		// 비행기 내부에서 의사가 있다면, 의사의 heal()함수를 호출하여 대상을 치료하는 코드를 작성하세요
		for(int i = 0; i < arr.length; i++) {
			if(arr[num] != arr[i] && arr[i] instanceof Doctor) {
				Doctor d = (Doctor) arr[i];
				System.out.println(d.name + d.job);
				d.heal(arr[num]);
				break;
			}
		}
	}
	
}

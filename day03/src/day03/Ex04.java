package day03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		// 아래 코드의 실행을 확인하고, 코드의 흐름을 분석해보세요
		
		Scanner sc = new Scanner(System.in);
		int size = 100;
		int current;
		
		System.out.print("0 ~ 100 사이 입력: ");
		current = sc.nextInt();
		current = current * 100 / size;
		
		System.out.print("[");
		for(int i = 0; i < 50; i++) {		// 50=전체값 , 25=절반값
			if(i == 25) { 
				System.out.printf(" %3d%% ", current);
			}
			else if(i < current / 2) {
				System.out.print("#");
			}
			else{
				System.out.print("_");
			}
			Thread.sleep(100); 		// CPU에게 0.1초만큼 기다리게 한다
		}
		System.out.println("]");
		sc.close();
	}

}

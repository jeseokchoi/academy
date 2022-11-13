package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력받아서 합계를 누적시킨다
		// 만약 0을 입력하면 '더 이상 더하지 않겠다' 라는 의미로 생각하여 반복을 중단한다
		// (사용자가 0을 입력하지 않는동안 )while문 사용
		
		int input, sum = 0;
		
		while(true) {
			System.out.print("정수 입력(0 입력시 멈춤): ");
			input = sc.nextInt();
			sum += input;
			
		if(input == 0) {
			System.out.println("합계 : " + sum);
			break;
			
		   }
		
		
		}
		
//		while(true) {
//			System.out.printf("정수 입력 : ");
//			input = sc.nextInt();	// 입력된 값을 읽어오는 코드
//			sum += input;		//  sum += input, sum = sum + input, sum에 input(입력값)을 계속 더한다
//			
//			if(input == 0) {	// input이 0 이면은
//				System.out.println("합계 : " + sum);
//				break;			// 반복을 멈추기 위해
//				
//			}
//			
//			
//			
//		}
		
		sc.close();
		
	}

}

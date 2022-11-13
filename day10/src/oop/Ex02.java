package oop;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		// oop.Number 클래스(Ex01)를 사용하여 객체의 배열 생성
		
		Number[] arr = new Number[12];				// 객체는 0개 참조변수 12개
													// 배열은 데이터를 담을수 있는 변수(비어있는 그릇)
		// 배열(Number를 저장할 수 있는 참조변수 12개)만 생성했을 뿐,
		// Number타입의 객체(실체)는 아직 없다
		
		for(int i = 0; i < arr.length; i++) {		// 객체 0개(여기까지)
			System.out.println(arr[i]);
		}// 모든 칸이 비어있다
		
		for(int i = 0; i < arr.length; i++) {		// 여기서부터 객체생성으로 객체는 12개(배열의 길이만큼)로 볼 수 있다
			arr[i] = new Number(i + 1);
		}// 각 칸에  i + 1값으로 객체를 생성한다
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}// 모든 칸이 비어있지 않다
		
		Random ran = new Random();
		int n = ran.nextInt(12);		// 정수를 랜덤으로 지정하여
		Number cpu = arr[n];			// 컴퓨터가 n번째 카드를 뽑게 한다
		
		int m = ran.nextInt(12);
		Number you = arr[m];
		
		System.out.printf("cpu : %s, you : %s\n", cpu, you);
		System.out.println(cpu.num > you.num ? "패배" : "승리");
	}

}

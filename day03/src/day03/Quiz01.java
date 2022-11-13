package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Random ran= new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		int current;
				
		/*
		 * 		1층에서 15층 사이의 엘리베이터 3개가 있습니다
		 * 		사용자에게 현채 층을 입력받아서 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 		출력문을 만들어서 출력해주세요
		 */
		// 가장 가까운 엘리베이터
		// 거리가 최소값인 엘리베이터
		// 절대값(현재 층-대상 층)중에서 최소값을 가지는 엘리베이터
		
		// 꿀팁 : 문제를 처음읽고 필요한 요소를 잘 파악해야한다. 위 문제에서는 1~15라는 숫자와 3개의 엘리베이터
		//	그리고 현재의 위치에서 가장 가까운 엘리베이터를 호출 해야하기 때문에 현재층과 각 엘리베이터의 층수의 차이를 구해야한다.
		//	차이를 구하기 위해서는 현재의 층 (-) 엘리베이터의 층수 의 값을 구해야한다.
		
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		System.out.print("층 입력: ");
		current = sc.nextInt();			// 현재 층수를 입력받는다
		
		int d1 = current - n1;			// 현재 층과 각 엘리베이터 층수의 [차이]를 구한다
		int d2 = current - n2;
		int d3 = current - n3;
		
		d1 = d1 < 0 ? -d1 : d1;			// 위 혹은 아래 방향에 상관없이 [거리]를 구하기 위해 [절대값]처리한다
		d2 = d2 < 0 ? -d2 : d2;
		d3 = d3 < 0 ? -d3 : d3;
		
		int min = d1;					// [거리 중에서 최소값]을 찾아낸다
		if(min > d2)	min = d2;
		if(min > d3)	min = d3;
		
		// 최소값과 일치하는 요소가 이동하는 형식을 출력한다
		if(min == d1)	System.out.println("첫번째 엘리베이터가 움직입니다");
		if(min == d2)	System.out.println("두번째 엘리베이터가 움직입니다");
		if(min == d3)	System.out.println("세번째 엘리베이터가 움직입니다");
		
		sc.close();

		
		
		
//		current = n1;		
//		if(n1 < current)	
//			current = n2;
//		current = sc.nextInt();
//		if(n2 < current)	
//			current = n3;
//		current = sc.nextInt();
//		System.out.printf("가까운 엘리베이터는 %d층 입니다\n", n1, n2, n3, current);
   }

}

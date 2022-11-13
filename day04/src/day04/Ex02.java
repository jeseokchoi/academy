package day04;

public class Ex02 {
	// y = f(x)
	static int getMaxNum(int a, int b, int c) {
		int max = a;
		if(max < b)		max = b;
		if(max < c)		max = c;
		return max;
	}
	
	static int getReverseNumber(int n2) {
		int num1 = n2;
		int num2 = 0;
		
		while(num1 != 0) {
			num2 = num2 * 10;
			num2 += num1 % 10;
			num1 /= 10;
			
		}
		return num2;
	}
	// 선생님 풀이 (2번)
//	static int getReverseNumber(int num) {
//		int ret = 0;
//		while(true) {
//			ret += num % 10;
//			ret *= 10;
//			num /= 10;
//			if(num < 10) {
//				return ret + num;	
				// 반복문 안에서 return을 수행하면 반복문과 상관없이 함수가 즉시 종료된다
//			}
//		}
//	}
	
	static int getFee(int n3){
		int fee = 3000;
		int overcost;
		
		if(n3 > 30) {
			if(n3 % 10 != 0) {
			overcost = (((n3 - 30) / 10) + 1) * 500;	
			}
			else {
				overcost = ((n3 - 30) / 10) * 500;
			}
			fee += overcost;
		}
		return fee;
	}
	
	// 선생님 풀이 (3번)
//	static int getFee(int time) {
//		int over = ((time - 21) / 10) * 500;
//		return time > 30 ? 3000 + over : 3000;
		// 삼항 연산은 값을 결정하고, return 은 값을 반환하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다
//	}
	

	static int getSummary(int s, int d) {
		int num4 = 0;
		
		for(int i = s; i <= d; i++) {
			num4 += i;
			}
		return num4;
	}
		
		// 다른 방법으로도 가능, 등차수열의 합을 구하는 법(알고리즘 방법(개념) - 자바에 익숙해질때까지 할 필요가 없음)효율적인 방식
//		return (s + d) * (d - s + 1) / 2;
		

	
	public static void main(String[] args) {
		
		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(2, 5, 3);
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요(while)
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요(if)
		int n3 = getFee(40);
		System.out.println("n3 : " + n3);
		
		// 4) 두 정수 a, b를 전달 받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요(for)
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
	}

}

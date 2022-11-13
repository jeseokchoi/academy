package day02;

public class Quiz03 {

	public static void main(String[] args) {
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요
		int n1 = 1234;
		int n2 = 0;

//		n2 *= 10;			// n2 = 0
//		n2 += n1 % 10;		// n2 = 4
//		n1 /= 10;			// n1 = 123
//		
//		n2 *= 10;			// n2 = 40
//		n2 += n1 % 10;		// n2 = 43
//		n1 /= 10;			// n1 = 12
//		
//		n2 *= 10;			// n2 = 430
//		n2 += n1 % 10;		// n2 = 432
//		n1 /= 10;			// n1 = 1
//		
//		n2 *= 10;			// n2 = 4320
//		n2 += n1 % 10;		// n2 = 4321
//		n1 /= 10;			// n1 = 0
		
		while(n1 > 0) {
			n2 *= 10;			
			n2 += n1 % 10;		
			n1 /= 10;			
		}
		
		System.out.println("n2 : " + n2);	// 4321
		
			
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int oddSum = 0, evenSum = 0;	// 250000, 250500
		
//		int i =1;
//		
//		if(i % 2 == 0) evenSum += i;
//		else		   oddSum += i;
//		i++;
//		
//		if(i % 2 == 0) evenSum += i;
//		else		   oddSum += i;
//		i++;
//		
//		if(i % 2 == 0) evenSum += i;
//		else		   oddSum += i;
//		i++;
//		
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
		
	
	}

}

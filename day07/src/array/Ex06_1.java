package array;

public class Ex06_1 {
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	// 이차원 함수
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		guide(arr);
		
		show(arr);
		
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++num;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		show(arr);
		// if -else 문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i % 2 == 0) {
					arr[i][j] = i * 5 + j + 1;
				}
				else {
					arr[i][j] = i * 5 + ( 5 - j);
				}
				
			}
		}
		show(arr);
		// 삼항연산자
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i * 5;
				
//				int tmp;
//				if(i % 2 == 0) {
//					tmp = j + 1;
//				}
//				else {
//					tmp = 5 - j;
//				}
				//        이 값을 기준으로       맞으면         틀리면      tmp에 대입한다
				int tmp = i % 2 == 0 ? j + 1 : 5 - j;
				arr[i][j] = i * 5 + tmp;
			}
		}
		show(arr);
		
	}
}
		
package array;

public class Quiz_1 {
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
		int num = 0;
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][4] = 6;
		arr[2][4] = 7;
		arr[3][4] = 8;
		arr[4][4] = 9;
		
		arr[4][3] = 10;
		arr[4][2] = 11;
		arr[4][1] = 12;
		arr[4][0] = 13;
		
		arr[3][0] = 14;
		arr[2][0] = 15;
		arr[1][0] = 16;
		
		arr[1][1] = 17;
		arr[1][2] = 18;
		arr[1][3] = 19;
		
		arr[2][3] = 20;
		arr[3][3] = 21;
		
		arr[3][2] = 22;
		arr[3][1] = 23;
		
		arr[2][1] = 24;
		
		arr[2][2] = 25;
		
		show(arr);
	}
}

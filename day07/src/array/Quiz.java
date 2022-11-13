package array;

public class Quiz {
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
		// while안의 for문 사용 권장
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				
//
//				
//			if(i == 0) {
//				arr[i][j] = i * 5 + (j + 1);
//			}
//			else if(j == 4){
//				arr[i][j] = j + (i + 1);
//			}
//			else if(i == 4) {
//				arr[i][j] = i - j + 9;
//			}
//			else if(i >= 1 && i <= 3 && j == 0) {
//				arr[i][j] = i - j + 11;
//			}
//				
//	
//			}
//			show(arr);
//		}

		int num = 1;
		int i = 0;
		int j = 0;
		int width = 5;
		int height = 4;
		
		while(num <= 25) {
			for(int a = 0; a < width; a++) {
				arr[i][j] = num;
				j++;
				num++;
			}width--;i++;j--;
			
			for(int a = 0; a < height; a++) {
				arr[i][j] = num;
				i++;
				num++;
			}height--;i--;j--;
			
			for(int a = 0; a < width; a++) {
				arr[i][j] = num;
			}
		}
	}
}


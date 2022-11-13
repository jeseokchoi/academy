package array;

public class Quiz_2 {
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
		
		arr[0][0] = num++;
		arr[0][1] = num++;
		arr[0][2] = num++;
		arr[0][3] = num++;
		arr[0][4] = num++;
		
		arr[1][4] = num++;
		arr[2][4] = num++;
		arr[3][4] = num++;
		arr[4][4] = 
		
		arr[4][3] = ++num;
		arr[4][2] = ++num;
		arr[4][1] = ++num;
		arr[4][0] = ++num;
		
		arr[3][0] = ++num;
		arr[2][0] = ++num;
		arr[1][0] = ++num;
		
		arr[1][1] = ++num;
		arr[1][2] = ++num;
		arr[1][3] = ++num;
		
		arr[2][3] = ++num;
		arr[3][3] = ++num;
		
		arr[3][2] = ++num;
		arr[3][1] = ++num;
		
		arr[2][1] = ++num;
		
		arr[2][2] = ++num;
		
		show(arr);
	}
}

package sort;

public class Ex07_2 {
	public static void main(String[] args) {
		// 선생님 풀이
		String str = "Helloworld";
		char[] arr = str.toCharArray(); 	// String을 char[] 로 바꿔주는 함수
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 정렬을 수행한다면?
		for(int i = 0; i < arr.length - 1; i++) {		// index는 int
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {					// 값은 char
					char tmp = arr[i];	// 대입연산에서 좌변과 우변의 자료형은 같아야 한다
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
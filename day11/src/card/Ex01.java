package card;

public class Ex01 {
	// ┌, │, ─, ┐, ┘, └
	
	static void draw(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
//				if(i == 0 || j == 0 || i == height - 1 || j == width - 1) {
					if(i == 0 && j == 0) {
						System.out.print("┌");
					}
					else if(i == height - 1 && j == 0) {
						System.out.print("└");
					}
					else if(i == 0 && j == width - 1) {
						System.out.print("┐");
					}
					else if(i == height - 1 && j == width - 1) {
						System.out.print("┘");
					}
					else if(i == 0 || i == height - 1) {
						System.out.print("──");
					}
					else if (j == 0 || j == width - 1) {
						System.out.print("│");
					}
//				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int width = 5;
		int height = 7;
		
		draw(width, height);
	}
}

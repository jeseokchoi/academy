package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) throws IOException {
			
//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// 웹 상의 이미지 주소를 작성
//		String path = "https://postfiles.pstatic.net/MjAyMTA4MTJfNTkg/MDAxNjI4NzUwMzk5MjIw.UgdXf0tYgGooZbhTOC_UWVbCtx_xN2h_rXv225AOs9Yg.u3GqRV8GWCBMGGGBaCnpSNmEu9Xk9ahKgQvgqjKIWP8g.JPEG.ttoa1109/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%ED%8C%8C%EC%9D%BC%EF%BC%8D35.jpg?type=w966";
//		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20160511_226%2Fqkrwnstlr112_1462954272054adhe5_JPEG%2Fhanzo-concept.jpg&type=sc960_832";
		String path = "https://postfiles.pstatic.net/MjAyMTA4MTJfMTI2/MDAxNjI4NzUwNDAwMDM0.gUXlhbehxio8h6aHGhaG1uu9y59agHkVXhQToUq7RqAg.jEw48q_drfgECG1GHfzijQQ_U6CTiAPh4YNvxfqeGzEg.JPEG.ttoa1109/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%ED%8C%8C%EC%9D%BC%EF%BC%8D34.jpg?type=w966";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 연결된 자원의 컨텐트 유형을 문자열 형태로 확인할 수 있다
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다");
		System.out.print("원하는 파일 이름을 입력하세요 : ");
		fileName = sc.nextLine();
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
		sc.close();
	}
}
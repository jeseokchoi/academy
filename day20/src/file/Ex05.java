package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		
		// 파일에 출력(기록)할 때 FileWriter를 사용하면 된다
		FileWriter fw = new FileWriter(f, true);	// append : true/false
		// autoFlush : 자동으로 flush 하게끔 되어있음
		
		fw.append("Hell");
		fw.append(", ");
		fw.append("World\n");
		
		fw.close();
		System.out.println("끝");
	}
}

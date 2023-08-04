package java_day14.ioEX;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//기반 스트림 얻어오기
			//파일
			
			FileWriter w = new FileWriter("res/output.txt");
			w.write("ㅎㅇ");
			w.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

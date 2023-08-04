package java_day14.ioEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			// 데이터가 들어오는 통로
			FileInputStream fis = new FileInputStream("res/Test");

			//파일이 생성될때  -1 파일의끝을 알리는문자 생성
			while (true) {
				int num;

				num = fis.read();
				if (num == -1)
					break;
				System.out.println((char)num);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

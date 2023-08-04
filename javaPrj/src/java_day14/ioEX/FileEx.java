package java_day14.ioEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//기반스트림
		try {
			FileInputStream fis = new FileInputStream("res/Test");

			
			int data1 = fis.read();
			System.out.println((char)data1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			

		}
		
	}
}


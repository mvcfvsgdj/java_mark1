package java_day14.ioEX;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//보조 스트림은 기반 스트림 정보를 받는다
		
		//한 문자씩 읽어옴
		InputStreamReader is =new InputStreamReader(System.in);
		
		try {
			int data = is.read();
			System.out.println( (char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
	}

}

package java_day14.ioEX;

import java.io.IOException;

public class 키보드연속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while(true) {
			
		try {
			int data =	System.in.read();
			System.out.println((char)data);
			if(data =='\n') break;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}

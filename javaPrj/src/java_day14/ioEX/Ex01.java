package java_day14.ioEX;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한바이트로 읽어옴
		try {
			
		int num=	System.in.read();
		System.out.println(num);
		num= System.in.read();
		System.out.println(num);
		//keycode
		//'1' ->49	(48)
		//'0' ->48
		//'a' ->97 (32)
		//'A' ->65
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

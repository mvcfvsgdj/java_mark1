package java_day14.ExceptionEx;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		// byte 읽어옴(아스키코드)
		
		//예외가 발생시 대비코드 작성
		try {
		int a= System.in.read();
		System.out.println(a);
		}catch (IOException e){
			System.out.println("비상비상");
		}
	}

}

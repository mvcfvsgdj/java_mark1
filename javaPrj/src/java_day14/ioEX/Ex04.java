package java_day14.ioEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data =bs.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package java_day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java_1_4_FileEX3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout= new FileOutputStream("res/dataCopy2.txt");

		int x;
		
		
		while( (x=fin.read()) != -1 ) {//파일의 끝이 아닐동안
			
			fout.write(x);
		}
		
	
	
		
	}

}

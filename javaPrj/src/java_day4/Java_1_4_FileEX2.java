package java_day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java_1_4_FileEX2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout= new FileOutputStream("res/dataCopy2.txt");

		int x;
		
		
		for(int i=1 ; i<=10; i++) {
			x= fin.read();
			fout.write(x);
		}
		
		
		
	
	
		
	}

}

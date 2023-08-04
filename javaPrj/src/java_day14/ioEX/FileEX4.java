package java_day14.ioEX;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bf =new BufferedReader(new FileReader("res/acorn.txt"));
		
			while(true) {
			String data= bf.readLine();
			if(data == null)break;
			System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

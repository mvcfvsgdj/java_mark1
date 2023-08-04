package java_day14.ioEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEX9 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream oi = new ObjectInputStream( new FileInputStream("res/output2.txt"));
		
			while(true) {
				
				Score s =(Score)oi.readObject();
				System.out.println(s);
			}
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

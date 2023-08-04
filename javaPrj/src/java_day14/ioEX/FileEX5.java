package java_day14.ioEX;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/kor.txt"));

			int sum = 0;
			double avg;
			int cnt = 0;
			while (true) {
				String data = bf.readLine();
				cnt++;
				if (data == null)
					break;
				System.out.println(data);
				int dataNumber = Integer.parseInt(data);
				sum += dataNumber;
			}
			avg = sum / cnt;		
			System.out.println(avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

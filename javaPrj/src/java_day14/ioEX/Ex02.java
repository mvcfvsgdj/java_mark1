package java_day14.ioEX;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) {

		// 입출력 스트림
		// 입력 스트림 (data 들어오는 길 (입력전용 메모리버퍼)
		// 출력 스트림 (data 나가는 길 (출력전용 메모리버퍼)
	
		// 기반 스트림	(실제 data 읽고씀)
		// 보조 스트림 (부가기능)
	
		// 바이트스트림
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 한 문자를 읽는 보조 스트림을 사용
	
	}
}

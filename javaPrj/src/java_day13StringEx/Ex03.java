package java_day13StringEx;

import java.awt.desktop.SystemSleepEvent;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열을 변경해야하는경우
		
		StringBuilder s = new StringBuilder("hello");
		
		s.setCharAt(1, 'a');
		
		System.out.println(s);
		s.append("i like java");
		System.out.println(s);
	}

}

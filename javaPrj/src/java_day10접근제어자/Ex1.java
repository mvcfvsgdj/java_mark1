package java_day10접근제어자;

import java_day10접근제어자.test.C;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//접근제어자
		//public : 오픈
		//private : 내 클래스 안에서만 접근허용
		//default : 접근에대해 명시하지않으면 default 접근제어자

	  A.메서드1();
	  A.메서드2();
	  
	  B.메서드1();
	  B.메서드2();
	  //접근제어자가 생략되서 작동불가
 	 // C.메서드1();
	 // C.메서드2();
	}
	
	

}

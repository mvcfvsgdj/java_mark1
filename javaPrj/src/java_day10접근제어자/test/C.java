package java_day10접근제어자.test;

public class C {

	//접근제어자를 명시하지않을때 기본으로 가지는 값은 default 
	// default - 같은 패키지 안에있는 클래스에만 접근허용
	
	static void 메서드1() {
		System.out.println("메서드1동작");
	}
	static void 메서드2() {
		System.out.println("메서드2동작");
	}
}

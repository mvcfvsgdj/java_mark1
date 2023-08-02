package java_day11다형성예제;

//매서드 선언부 
//매서드 정의부 (구현부) { }
abstract class Person2 {
//추상매서드를(매서드의 선언부만 가지는 매서드) 하나라도 가지면 추상 클래스가 됨.
//일반매서드도 가질수있음.

	// dance라는 메서드는 구현된 코드
	public void dance() {

	}

	public void walk() {
		System.out.println("walk.");
	}

	public abstract void test(); // 미완성 코드 abstract
}

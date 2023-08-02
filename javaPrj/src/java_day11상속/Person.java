package java_day11상속;

public class Person {

	// 인스턴트변수 new 를 통해 변수가 만들어짐 *객체
	String name;
	String id;

	// 생성자 객체의 초기화담당 ,기본생성자 제공
	// 하나라도 만들면 기본생성자는 만들어지지않음.

	// new호출시 한번만 호출됨 (첫줄)

	public Person() {
		this("가나다", "test1"); // 매개변수가 있는 생성자 호출
								// 생성자 ->생성자 호출가능
	}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

}

package java_day12ObjectEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.toString());

		Object o = a; 
		// 상속관계에서 업캐스팅
		// 부모형으로 축소
		// 오버라이드 된 매서드가 우선권을 갖는다(오버라이드된 객체의 매서드 호출)
		// a객체의 toString 매서드가 호출
		
		
	}

}

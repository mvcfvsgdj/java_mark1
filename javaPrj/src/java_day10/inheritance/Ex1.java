package java_day10.inheritance;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat ();
		c.쥐를잡는다();

		// 상속관계 
		// Animal : 부모 (상위)
		// Cat : 자식 (하위)
		// 상속관계에서 부모형참조형변수를 다룰수있음 
		// 부모의내용이 있음 = 부모형으로 다룸
		// 상속관계에서 upcasting 가능
		// 단부모형으로 해석이 축소됨
		Animal animal = new Cat(); //upcasting *자동형변환
	

		//부모형으로 다루면 부모형의 값만큼 인식
		//animal로 다루면 쥐를잡는다()기능이 인식되지않음.
		//type : 크기 ㅡ 해석
		
		//다운캐스팅 , new 된 실체가 중요함
		Cat c2= (Cat)animal; //downcasting *명시적변환
		c2.쥐를잡는다();
	
		Animal animal2 = new Animal();
		Cat cat3 =(Cat)animal2;
		cat3.쥐를잡는다();//문법적 허용 // error

	
	}
	
	
	

}

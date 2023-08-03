package java_day12ObjectEx;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1 = new B(5);
		B b2 = new B(5);

		
		//두 개의 객체가 만들어짐.

		
		//true,false => false
		if(b1.equals(b2)) { //b1 ,b2 
			System.out.println("두객체는 같다");
		}
		
		//Object 의 equals() 는 객체의 래퍼런스를 비교
		
		
	}

}

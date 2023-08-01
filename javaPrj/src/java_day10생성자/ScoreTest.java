package java_day10생성자;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 객체는 new(동적메모리) 방식으로 공간확보 확보된 공간의 주소 (레퍼런스) 저장한뒤 사용 참조형변수 필요 참조형변수 : 주소(레퍼런스)를
		 * 저장함 참조형변수 기본값 :null null = 참조하지 않은 상태
		 */

		Score s = null; // 참조형변수
		s = new Score();
		s.calResult();
		s.printInfo();

		Score s2 = new Score("a", 100, 100, 100);
		s2.calResult();
		s2.printInfo();

		Score s3 = new Score("b");
		s3.calResult();
		s3.printInfo();

		Score s4 = new Score("c", 100, 100, 100);
		s4.calResult();
		s4.printInfo();

		// 메서드오버로딩
		// 매서드의이름이 동일하고 매개변수의 정보가 다른것을 말함

		System.out.println("i fla");
		System.out.println(30);
		System.out.println(25.3);
		System.out.println(new char[] { '2', '3', '4' });

	}

}

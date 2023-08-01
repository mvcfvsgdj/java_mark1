package java_day10변수종류;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//참조형변수로 다룸
		//참조형변수(리모콘변수)
		//1. new를 통해 공간확보
		//2. 생성자에 의해 공간값 초기화
		//3. 생성된 객체의 정보 s1 참조형변수 저장
		//4. 참조형변수를 통해 객체의 정보를 저장하거나 이용
		//5. 객체지향은 매서드를 통해서 값을 이용
		Student2 s = new Student2("fsd",100,99); //new 대상 -> 객체
		Student2 s1 = new Student2("fsㅇd",40,62);
		Student2 s2 = new Student2("fsㅁd",60,40);
		Student2 s3 = new Student2("fsㅋd",80,39);
		
	System.out.println(s.toString());
		
	}

}

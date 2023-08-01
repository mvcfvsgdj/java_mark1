package java_day10변수종류;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//참조형변수로 다룸
		//참조형변수(리모콘변수)
		//1. new를 통해 공간확보
		//2. 생성자에 의해 공간값 초기화
		//3. 생성된 객체의 정보 s1 참조형변수 저장
		//4. 참조형변수를 통해 객체의 정보를 저장하거나 이용
		//5. 객체지향은 매서드를 통해서 값을 이용
		Student s = new Student("fsd",100,99,"ㅁㄴㄹ"); //new 대상 -> 객체
		Student s1 = new Student("fsㅇd",40,62,"ㄱㄴㄹ");
		Student s2 = new Student("fsㅁd",60,40,"ㅁㅂㄴ");
		Student s3 = new Student("fsㅋd",80,39,"ㅎㄴㄹ");
		
	System.out.println(s.toString());
		
	}

}

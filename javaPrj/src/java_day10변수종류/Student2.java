package java_day10변수종류;

//학생 한명이 가져야할 정보 표현하는 자료형
public class Student2 {

	String name;
	int kor;
	int eng;
	double avg;
	static String teacher="ㅇㅇㅇ";  //클래스변수 : 클래스 안에서 하나만 만들어짐
					 //클래스 안에서 공통적으로 사용하는 값을 저장하기 위한변수
					//클래스 변수는 프로그램시작 ~ 프로그램종료 까지
	public Student2() {
		
	}


	// 생성자	
	public Student2(String name, int kor, int eng) {

	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.avg = (kor+eng)/2.0;

}
	public String toString() {
		return name + kor + " " + eng + " " + avg + teacher;
	}
}

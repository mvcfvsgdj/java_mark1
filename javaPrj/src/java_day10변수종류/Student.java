package java_day10변수종류;

//학생 한명이 가져야할 정보 표현하는 자료형
public class Student {

	String name;
	int kor;
	int eng;
	double avg;
	String teacher;

	public Student() {
		
	}


	// 생성자	
	public Student(String name, int kor, int eng,  String teacher) {

	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.avg = (kor+eng)/2.0;
	this.teacher = teacher;
}
	public String toString() {
		return name + kor + " " + eng + " " + avg + teacher;
	}
}

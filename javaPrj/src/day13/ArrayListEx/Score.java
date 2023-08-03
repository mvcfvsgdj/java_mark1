package day13.ArrayListEx;

//성적데이터를 처리하기 위한 자료형 필요

public class Score {

	// 멤버변수
	private String name;
	private int kor;
	private int eng;
	private String result;

	// 생성자
	// this : 참조형변수 , 자기참조형변수
	// 단 static 메서드에는 this가 전달되지않음.
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;

		calResult();

	}

	public void calResult() {
		// TODO Auto-generated method stub
		int sum = kor + eng;
		double avg = sum / 2.0;
		if (avg >= 80)
			result = "ㄱㄱ";
		else
			result = "ㄴㄴ";
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Score [name=" + name + " , kor=" + kor + " , eng=" + eng + " result =" + result;
	}
	// static 메서드
	/*
	 * private static void print() { System.out.println("$$$$"); 멤버변수(인스턴트변수를
	 * 사용할수없음)
	 * 
	 * }
	 */

	// 써터 set첫글자 대문자 규칙
	// 게터 get첫글자 대문자 규칙

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}

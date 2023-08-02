package java_day11객체배열;

public class Score {

	// 멤버변수
	String no;
	int kor;
	int eng;
	int tot;

	public Score() {
	}

	public Score(String no, int kor, int eng, int tot) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
	}

	@Override
	//부모의 매서드를 재정의
	public String toString() {

		return no + " " + kor + " " + eng + " " + tot;

	}
}

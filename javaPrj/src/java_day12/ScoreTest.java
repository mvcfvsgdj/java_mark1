package java_day12;

public class ScoreTest {

	public static void main(String[] args) {

		Score s = new Score("sss", 40, 90);

		s.calResult(); // calResult() 메서드는 객체가 생성된이후 사용가능

		String result = s.toString();
		System.out.println(result);
		System.out.println(s);
	}

}

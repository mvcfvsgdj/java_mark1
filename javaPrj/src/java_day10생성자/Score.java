package java_day10생성자;

//학생성적정보를 담을수있는 자료형
//멤버변수 +멤버 메서드 (멤버변수를 사용하는메서드)
//멤버메서드는 객체생성 이후 사용가능
//type 정의 : 변수가 만들어진게 아님
public class Score {

	// 멤버변수 (인스턴트 변수)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private boolean result;

	/*
	 * 생성자 값의 초기화 담당 = > 특별한 메서드 생성자 반환타입 x 
	 * 이름이 클래스명과 동일 객체가 생성될 때 값으 초기화를 담당함 (new를 통한생성)
	 * 생성자를 하나도 만들지 않으면 기본생성자 제공 생성자를 만들지 않으면 기본생성자 제공 x
	 * Score Type이 메모리에 생성됨
	 * 
	 * 
	 */

	/*
	 * 생성자 오버로딩 오비로딩 :매서드의 이름은 같고 매개변수가 다름 (개수 type 다름) 
	 * 오버로딩시 반환타입이 다른건 오버로딩이 안됨.
	 * 
	 */

	public Score() {
	}

	// 생성자에게 객체변수 초기화
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public Score(String name) {

		this(name, 60, 60, 60);
		/*
		 * 생성자끼리 호출가능 . 첫줄에와야함 생성자호출시 this()로표현
		 */

	}

	public void calResult() {
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		if (avg >= 80) {
			result = true;
		} else {
			result = false;
		}

	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(result);
	}

	// 현재 객체정보를 문자열로 반환
	public String toString() {
		return name + " " + kor + " " + eng + " " + math;
	}
}
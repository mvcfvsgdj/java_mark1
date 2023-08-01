package java_day10생성자;

public class MovieClass2 {

	private String title;	//클래스형의 값은 null
	private String genre;
	private String runningtime;
	private String rating;
	

	
	//생성자 . 매개변수가있는 생성자
	//생성자 규칙 : Class명과 동일
	//			반환타입을 명시하면 안됨.
	//생성자는 기본생성자를 제공함 (default)
	//			매개변수가 없는 생성자
	//프로그래머가 생성자를 만들면 기본생성자는 제공되지않음
	//프로그래머가 기본생성자를 만들어야함
	
	
	public MovieClass2(String title, String genre, String runningtime, String rating) {
		this.title=title; 
		this.genre=genre;
		this.runningtime=runningtime;
		this.rating=rating;
	}
	
	
	public MovieClass2() {
		
	}
	
	public void printInfo() {
		System.out.println("제목:"+title);
		System.out.println("장르:"+genre);
		System.out.println("상영시간:"+runningtime);
		System.out.println("관람가:"+rating+"\n");
		
	}
	
}

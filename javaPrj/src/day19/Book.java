package day19;

public class Book {

	// Book book = new Book(); 
	
	String 책이름;
	int 가격;
	String 출판사;

	// 생성자
public Book() {
	// TODO Auto-generated constructor stub
}

	public Book(String 책이름, int 가격, String 출판사) {
		super();
		this.책이름 = 책이름;
		this.가격 = 가격;
		this.출판사 = 출판사;
	} 
	
	// toString
	
	// 매서드 - 객체 생성된 이후 ( 맴버 변수가 만들어진 이후부터 사용가능)
	public void 매서드() {
	System.out.println("매서드");	
	}

	
	
}

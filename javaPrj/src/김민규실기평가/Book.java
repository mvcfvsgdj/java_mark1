package 김민규실기평가;

public class Book {
//문제7
	String bookCode;
	String booTitle;
	String anuthor;
	
	public Book() {
		
	}

	public Book(String bookCode, String booTitle, String anuthor) {
		super();
		this.bookCode = bookCode;
		this.booTitle = booTitle;
		this.anuthor = anuthor;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", booTitle=" + booTitle + ", anuthor=" + anuthor + "]";
	}
}

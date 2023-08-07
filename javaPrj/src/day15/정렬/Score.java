package day15.정렬;

public class Score  implements MyComparable {

	private String name;
	private int kor;
	private int eng;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	//생성자
	public Score() {
		
	}
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	@Override
	public int CompareTo(Object obj) {
		Score s =(Score)obj;
		
		return this.getKor()-s.getKor();
	}
	


	
}

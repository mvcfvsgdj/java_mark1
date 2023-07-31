package java_day9_classType;

//정의 부분
//틀
public class 커피데이타3 {
	//클래스 변수
	private int 설탕;
	private	int 프림;
	private	int 물;
	private int 원두;
	private int 매출금액;

	
	//지역변수
	public void input(int 설탕, int 프림, int 원두 , int 물) {
		this.설탕 = 설탕;
		this.프림 = 프림;
		this.원두 = 원두;
		this.물  = 물;
		
	}
	
	public void printInfo() {
		System.out.println(물);
		System.out.println(원두);
		System.out.println(프림);
		System.out.println(설탕);
		System.out.println(매출금액);


	}
	
	
}

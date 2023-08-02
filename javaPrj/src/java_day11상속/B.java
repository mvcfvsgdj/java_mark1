package java_day11상속;

public class B extends A {

	int c;
	
	public B(String a, String b , int c) {
		super(a,b);//부모의 매개변수가 있는 생성자를 호출
				  //명시적으로 부모의 생성자를 호출하는코드가 없으면
				//부모의 기본생성자 super()를 호출
		this.c=c;
		
	}
	public String toString(){
		return a + b + " " + c ;
		
	}
	
}

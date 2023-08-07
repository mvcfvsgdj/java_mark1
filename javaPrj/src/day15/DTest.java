package day15;

public class DTest {

	public static void main(String[] args) {
		D d = new D();
		E e = new E();
		// MyRunnable 인터페이스를 구현한 객체를 넘겨야함
		d.메서드(e);  // 매게변수로 인터페이스가 있다면 ->인터페이스를 구현한 객체를 인자로 넘겨야함
		d.메서드(new F()); //일회성 객체 생성시 new 인터페이스이름(){}
		d.메서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드");
				for(int i=1 ; i <=3 ; i++) {
					System.out.println("★");
				}
				
			}});
		
		d.메서드(new MyRunnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("9단!!");
				for(int i=1; i<=9 ; i++) {
					System.out.println(9*i);
				}
					
			}});
		
		//인터페이스를 구현할 때
		//이름이 있는 클래스 작성 implements 해야함
		//이름이 없는 클래스를 (익명클래스)=>상속받은 클래스를 만들때만 익명클래스 가능
		
		d.메서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("ㄱㄱㄱ");
				
				
			}});
		
	}
}

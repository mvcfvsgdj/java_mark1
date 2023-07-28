package java_day8_class자료형;

public class Ja_1_1Customer {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		//자료형  변수
		//배열 ,객체 : 메모리에 공간을 확보 할때 new로 heap 메모리 사용 강제
	
		Customer c = new Customer()  ;
		c.name="가나다";
		c.id="abc";
		c.age=25;
		
		Game d = new Game ();
		d.game = "서든";
		d.time = "1시간";
		System.out.println(d.game);
		System.out.println(c.id);
		System.out.println(c.age);
		
		
	}

}

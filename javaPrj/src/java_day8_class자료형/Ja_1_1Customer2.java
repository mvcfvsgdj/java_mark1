package java_day8_class자료형;

public class Ja_1_1Customer2 {
	String name; 
	String id;
	int age;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		//자료형  변수
		//배열 ,객체 : 메모리에 공간을 확보 할때 new로 heap 메모리 사용 강제
	
		Ja_1_1Customer2 c = new Ja_1_1Customer2()  ;
		c.name="가나다";
		c.id="abc";
		c.age=25;
		
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.age);
		
		
	}

}

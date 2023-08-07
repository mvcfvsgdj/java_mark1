package day15;

public class CTest {
	public static void main(String[] args) {
		C c = new C();

		try {
			c.메서드(5);

		} catch (OverNumberException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			
		}

		System.out.println("종료");
	}
}

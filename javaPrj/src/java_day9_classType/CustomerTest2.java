package java_day9_classType;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자료형이 있을때 자료형 변수를 만들수있어햐함
		
		
		int a;
		a=10;
	
		//Customer 형 변수
		
		
		/*Customer customer ;//customer형 변수가 만들어지지않음.
		customer = new Customer();//customer를 통해 변수생성
					// customer 변수 참조형변수
					// Customer 형 변수가 있는 위치 , 레퍼런스를 저장하는 참조형변수	  
		 */
		
		//참조형변수의 초기값 = null
		//참조형변수 초기화 필요시 null로 초기화
		// null => 아무것도 참조하지않음
		
		Customer customer = null;
		customer = new Customer();
		// customer 변수가 만들어지지 않음
		// 오류 발생 (NullPointerException)
		
		customer.id="test01";
		customer.pw="1201";
		customer.name="Afs";
		customer.address="seoul";
		
		System.out.println(customer.id);
		System.out.println(customer.pw);
		System.out.println(customer.name);
		System.out.println(customer.address);
		
		
		
		
	
	}

}

package java_day9_classType;

public class 자판기프로그램_객체지향 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//변수의 지역성
		//함수안에서 만든 변수는 함수에서만 사용가능
		커피데이타2 coffee =null;
		coffee = new 커피데이타2();
		
		coffee.printInfo();		
		coffee.fillCoffee();
		coffee.printInfo();
		
		/*
		 *  printInfo(coffee);		
			fillCoffee(coffee);
			printInfo(coffee);
		 * 
		 */
	
		int money =100;
		
	 //String result = 밀크커피만들기(coffee , money);
	 	String result = coffee.밀크커피만들기(money);
		System.out.println(result);
	}


	
}

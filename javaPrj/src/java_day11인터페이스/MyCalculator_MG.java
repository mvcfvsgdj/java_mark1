package java_day11인터페이스;

//인터페이스 상속
//인터페이스를 구현한다는 의미를 가짐
//implements 키워드를 사용함
public class MyCalculator_MG implements CalculatorI {
	@Override
	public int add(int num1, int num2){
		System.out.println("더하기");
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2){
		System.out.println("뺴기");
		return num1-num2;
	}
	@Override
	public int multi(int num1, int num2){
		System.out.println("곱하기");
		return num1*num2;
	}
	@Override
	public int divide(int num1, int num2){
		System.out.println("나누기");
		return num1/num2;
	}

	

	
}

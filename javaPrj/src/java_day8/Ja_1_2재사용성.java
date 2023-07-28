package java_day8;

public class Ja_1_2재사용성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 재사용성
		
		int num=9, num2=5;
		
		int sum = num+num2;
		
		System.out.println(sum);

		int su3=5 , su4=6;
		int result = adder(su3,su4);
		System.out.println(result);
	
	}
	
			//반환  type (1개) , 함수명 (입력정보)
			//반환 없을때 void
			//복잡한 데이터를 반환해야 할 때 배열이나 객체를 사용

	
	/* 기능:		두 수를 더해주는 기능 , (함수명작명 : 첫글자 소문자)
	 * 작성자:	이름
	 * 입력정보:	두개의 정수 
	 * 반환정보:	두수의 합  
	 * 
	 */
	
	
	public static int adder(int num , int num2) {
		int sum= num+num2;
		
		return sum;	
	}
	
	
}

package java_day7;

public class Java_1_1_함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		printSum();
	


	
	}
			 //반환값 x : void
			//반환 type 함수명()  // (입력정보)
	public static void printSum() {
		int sum = 0;
		for(int i= 0 ; i<=10; i++) {
			sum+=i;
			
		}
		
		System.out.println(sum);
	}

}

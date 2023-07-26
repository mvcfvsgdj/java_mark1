package java_day6;

public class Java_1_2_함수5 {

	// 함수 :약속된 함수(프로그램을 실행하기 위해 약속된함수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = a(5);
		System.out.println(result);

		int result2= b('c');
		System.out.println(result2);
	
		char result3= c(0);
		System.out.println(result3);

		double result4= d();
		System.out.println(result4);
		
		String result5= e();
		System.out.println(result5);
			
	}

	// 반환타입 //입력정보
	public static int a(int a) {
		System.out.println("call a");
		return 3;
	}

	public static int b(char a) {
		return 4;
	}

	public static char c(int a) {
		return 'c';
	}

	public static double d() {
		return 2.5;
	}

	public static String e() {
		return "안녕";
	}

}

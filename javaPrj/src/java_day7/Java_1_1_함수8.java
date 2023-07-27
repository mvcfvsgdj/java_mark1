package java_day7;



public class Java_1_1_함수8 {
	 
	public static void main(String[] args) {

		//지역변수 : 함수안에서 만든변수는 그 함수안에서 유효하다.
		
		//변수의 유효범위
		//main에서 만든 변수는 main에서만 유효함
		String[] days= new String[3];  //인자정보 활용
		int i = 0;	
		insertDay(days, i);
		
		selectDay(days);
		
		
	}

	public static void selectDay(String[] days) {
		for(String day : days) {
			System.out.println(day);
		}
	}

	public static void insertDay(String[]a, int index) {
		a[index]="놀러가기";
	}
}


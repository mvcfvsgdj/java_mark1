package java_day13StringEx;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("hi");

		// 문자열(속성 (char[]) +기능 (매서드=>함수))

		// 문자열수정 불가

		char result = str.charAt(0);
		System.out.println(result);

		// str 문자열 객체의 내용은 바꿀 수 없음
		// 원본의 문자열이 수정되는것은 아님

		//문자열 내용변경 (주의: 새로운 문자열을만듬)
		String result2 = str.replace('i', 'a');
		System.out.println(result2);
		System.out.println("원본수정안됨 " + str);

		//대문자 변경
		String result3 = str.toUpperCase();
		System.out.println(result3);
		String date = new String("2023-08-03");

		
		//문자열 분리
		String[] result4 = date.split("-");
		for(int i=0 ; i<result4.length ; i++) {
		System.out.println(result4[i]);
		}
		
		//오버로딩 , 매서드이름이같음 , 식별은 매개변수차이로 식별
							//시작인덱스 =0
		String result5 =date.substring(5);
		System.out.println(result5);
		
	String result6=	date.substring(5,7);
		System.out.println(result6);
	
		System.out.println("문자열의길이 = " +date.length());
	
		String s1= "hello";
		String s2= "hello";
		
		//문자열의 비교는 equals() 매서드사용
			boolean result7 =s1.equals(s2);
		System.out.println(result7);
		
	}

}

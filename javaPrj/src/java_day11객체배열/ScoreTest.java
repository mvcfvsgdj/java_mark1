package java_day11객체배열;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score s = new Score("01", 100, 80, 50);
		Score s1 = new Score("02", 90, 40, 82);
		Score s2 = new Score("03", 80, 70, 63);
		

//		System.out.println(s.toString()); //toString생략가능
//		System.out.println(s1);
//		System.out.println(s2);


		//s, s1 ,s2와같이 참조형 변수로만든것
		//참조형변수의 기본값은  null로 초기화
		Score[] arr =new Score[3];
//		String result = arr[0].toString();
//		System.out.println(result);
		arr[0] = new Score("01", 100, 80, 50);
		arr[1] = new Score("02", 90, 40, 82);
		arr[2] = new Score("03", 80, 70, 63);
		
		for(Score score : arr) {
			System.out.println(score);
		}
	}			

}

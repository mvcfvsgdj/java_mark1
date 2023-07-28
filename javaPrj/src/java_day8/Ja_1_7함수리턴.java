package java_day8;

public class Ja_1_7함수리턴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int [] {9,8,7};
		printArry(arr); // 호출되면 코드를 수행하고 호출한곳으로 돌아옴
		
		
	}//종료

	public static void printArry(int[] a) { //함수시작
		for(int number : a){
			System.out.println(number);
		}
		
	}
}

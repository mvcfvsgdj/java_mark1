package java_day8;

public class Ja_1_3CallbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, b = 10;
		int result = adder(a, b);

		int c = 9; // main에서 만든 c변수
		int  result2=input(c);  // input함수에서 c 값을 변화 가능?
				   // 변화  x 

		c=result2;
	}

	// call by value
	public static int adder(int su1, int su2) {
		return su1 + su2;
	}

	public static int input(int su) {
		return 5;
	}
}

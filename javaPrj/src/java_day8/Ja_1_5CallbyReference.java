package java_day8;

public class Ja_1_5CallbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//
		int[] kors = new int [3];
		
		kors[0] =4;
		kors[1] =14;
		kors[2] =24;
		
		input(kors);
	
		
		//	등록
		
		//	조회
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);

	}
	public static void input(int [] a) {
		
		a[0] = 64;
		a[1] = 22;
		a[2] = 35;
	}
}

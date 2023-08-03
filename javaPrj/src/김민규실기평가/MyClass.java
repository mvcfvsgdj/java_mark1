package 김민규실기평가;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int getTotal=0;
		getTotal =getTotal(getTotal);
		System.out.println(getTotal);
	}

	public static int getTotal(int su) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력");
		
		int num = sc.nextInt();
		int sum =0;
		for(int i = 1 ; i<=num; i++) {
			sum += i;
			
		}
		return sum;
	}

}

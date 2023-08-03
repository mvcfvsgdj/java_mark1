package 김민규실기평가;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
				System.out.println("원하는 단을 입력하시오");
		int num = sc.nextInt();
	;
		for(int i =1; i<=9 ; i++) {
			int	result = num*i;
			System.out.println(result);
		}
	}

}

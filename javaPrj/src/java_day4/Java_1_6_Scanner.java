package java_day4;

import java.util.Scanner;

public class Java_1_6_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum =kor+eng+math;
		double avg = sum/3.0;
		
		
		System.out.println(name+ " "+ kor + " "+ eng + " "+ math+ " " + sum + " " + avg);

		
		
		
		
		
		
		
	}

}

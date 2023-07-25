package java_day4.quiz;

import java.util.Scanner;

public class Java_2_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적구하기
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		
		final int MAX=5;
		final int SUBJECT=3;
		
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum;
		double avg;
		double kor_sum;
		double eng_sum;
		double math_sum;
	 
		for(avg>=90;){
			sum=kor+eng+math;	
			avg=sum/SUBJECT;
			System.out.println(name+" "+"EXC");	
		}if(avg=<60){
			
		
		System.out.println(name+" "+"fail");

		}
		}
	}
}

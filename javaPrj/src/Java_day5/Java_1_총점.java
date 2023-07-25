package Java_day5;

import java.util.Scanner;

public class Java_1_총점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double avg; //개인평균
		double kor_avg , eng_avg , math_avg;
			
		String name;
		int kor ,eng ,math ;
		//
		
		int sum;
		int kor_sum=0 ,eng_sum=0,math_sum=0;
		
		Scanner sc = new Scanner (System.in);
		
		
		final int MAX = 5;
		final int SUBJECT = 3;
		
		for(int i=1 ; i<=MAX ; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			sum = kor+eng+math;
			avg =(double) sum/SUBJECT; //나누기 정수연산 ,실수연산
			
			kor_sum +=kor;
			eng_sum +=eng;
			math_sum +=math;
			
			if(avg>=90) {
				System.out.println(name + " " + kor + " " + eng + " " + math + "Excellent");
				System.out.println(avg + "평균");
			}else if (avg <60) {
				System.out.println(name + " " + kor + " " + eng + " " + math + "FAIL");
				System.out.println(avg + "평균");
			}else {
				System.out.println(name + " " + kor + " " + eng + " " + math + "FAIL"); 
				System.out.println(avg + "평균");
			}	
		}
		
		kor_avg = (double) kor_sum / MAX;
		eng_avg = (double) eng_sum / MAX;
		math_avg = (double) math_sum /MAX;
		
		System.out.println("국어평균 "+kor_avg);
		System.out.println("영어평균 "+eng_avg);
		System.out.println("수학평균 "+math_avg);
	
	}
	
}

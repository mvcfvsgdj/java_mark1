package java_day4;

import java.util.Scanner;

public class 요일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Scanner sc =new Scanner (System.in);
		
		int menu;
		
		loop:while(true) {
			
			int day=sc.nextInt();
			System.out.println("선택 1.월 2.화 3.수 4.목 5.금 6.토 7.일 나머지 error");
			
			switch (day) {
			case 1:
				System.out.println("월");
				break;

			case 2:
				System.out.println("화");
				break;
			case 3:
				System.out.println("수");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			case 7:
				System.out.println("일");
				break;
			case 8:
				System.out.println("요일이아님");
				break loop;
			default:
				System.out.println("error");
			}
			
		}
		

	}

}

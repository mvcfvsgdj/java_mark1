package java_day4.quiz;

import java.util.Scanner;

public class Java_10_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//qty 주문수량 메뉴 menu
		//출력 amount 주문금액
		//준비 메뉴단가
		
		int qty;
		String menu;
		int amount;
		int 아메리카노=2000;
		int 카푸치노=2900;
		int 모카라떼=3200;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("메뉴");
		menu =sc.next();
		qty =sc.nextInt();
		
		switch(menu) {
		case "아메리카노" :
			amount = 아메리카노 *qty;
			break;
		case "카푸치노" :
			amount = 카푸치노 *qty;
			break;
		case "모카라떼" :
			amount = 모카라떼 *qty;
			break;
		default :
			System.out.println("ㄴㄴ");
			amount =0;
			
		}
		System.out.println(amount);
	
		
	}
}

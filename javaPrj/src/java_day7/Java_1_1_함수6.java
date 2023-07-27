package java_day7;

import java.util.Scanner;

public class Java_1_1_함수6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//일정관리 프로그램 작성
		 String [] days = new String[10];
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int menu;
		 int index=0;
		 
		loop : while(true) {
			 System.out.println("메뉴선택: 1.등록 , 2.조회 , 3.변경 , 4.삭제 , 5.종료");
			
			 String menu_ = sc.nextLine();
			 menu =Integer.parseInt(menu_);
			 // "25"  -> 25  (변환 기능)
			 
			 /* 입력한 내용이 어딘가에 저장됨 :String
			 Integer: 정수로 변환해주는 매서드 */ 
	
			 switch(menu) {
			 case 1:
				 System.out.println("일정을 입력하세요");	
				 String day  =sc.nextLine();
				 days[index]= day;
				 index++;
				 break;
			 case  2:
				 System.out.println( "일정을 조회합니다. ");
				 for( int i=0; i< index; i++) {
					 System.out.println( days[i]);
				 }				  
				 break;
			 case 3:
				 System.out.println("변경");

				 System.out.println( "일정을 조회합니다. ");
				 for( int i=0; i< index; i++) {
					 System.out.println( (i+1)+"." + days[i]);
					 //1.놀러가기
					 //2.산책하기
				 }
				 System.out.println("변경할 순번과 내용");
				
				 String updateIndex_=sc.nextLine();
				 
				 int updateIndex =Integer.parseInt(updateIndex_);
				 String updateDay = sc.nextLine();
				 days[updateIndex-1]= updateDay; 
				 
				 
				 break;
			 case 4:
				 System.out.println("삭제");
				 
				 System.out.println( "일정을 조회합니다. ");
				 for( int i=0; i< index; i++) {
					 System.out.println( (i+1)+"." + days[i]);
						 }
				 System.out.println("삭제하고 싶은 일정");
				 String deleteIndex_ = sc.nextLine();
				 int deleteIndex = Integer.parseInt(deleteIndex_);
				 days[deleteIndex-1]=" ";
				 System.out.println(deleteIndex);
				 
				 break;
			 case 5:
				 System.out.println("종료");
				 break loop;
				default:
					System.out.println("error");
					 }
			 
		 }//while
		 
		System.out.println("끝");
	} //main 종료
}


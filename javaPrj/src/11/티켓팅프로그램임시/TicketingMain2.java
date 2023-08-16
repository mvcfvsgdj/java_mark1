package 티켓팅프로그램임시;

import java.util.Scanner;

public class TicketingMain2 {

	public static void main(String[] args) {
		String FolderPath = "res/Concert";
	
		String[] FilePath = {
				"res/Concert/sectorA.txt",
				"res/Concert/sectorB.txt",
				"res/Concert/sectorS.txt",
				"res/Concert/sectorV.txt",
		};

		//폴더 자동 생성
		Init.InitFolder(FolderPath);
		for(int i = 0; i<FilePath.length; i++) {
			Init.InitFile(FilePath[i]);
		}
		
		
		Concert_Program cp = new Concert_Program();
		
	       Scanner sc = new Scanner(System.in);

	        char ConcertA[] = new char[10];
	        char ConcertB[] = new char[10];
	        char ConcertS[] = new char[10];
	        char ConcertV[] = new char[7];
	        
	        
	        System.out.println(" ");
			System.out.println("--좌석을 조회합니다.--");
			System.out.println(" ");
			for (int i = 0; i < ConcertV.length; i++) {
				System.out.print("  " + "VIP " + ConcertV[i] + " ");

			}
			System.out.println(" ");
			for (int i = 0; i < ConcertA.length; i++) {
				System.out.print("A열  " + ConcertA[i] + " ");
			}
			System.out.println(" ");
			for (int i = 0; i < ConcertB.length; i++) {
				System.out.print("B열  " + ConcertB[i] + " ");
			}
			System.out.println(" ");
			for (int i = 0; i < ConcertS.length; i++) {
				System.out.print("S열  " + ConcertS[i] + " ");
			}
			System.out.println(" ");
		
			System.out.println(" ");
	        System.out.println("--좌석 구역과 좌석을 선택해주세요--");
	        System.out.println(" ");
	        
	        char Concert_Insert = sc.next().charAt(0);

	        switch (Concert_Insert) {
	            case 'A':
	                selectSeat(ConcertA);
	                break;
	            case 'B':
	                selectSeat(ConcertB);
	                break;
	            case 'S':
	                selectSeat(ConcertS);
	                break;
	            case 'V':
	                selectSeat(ConcertV);
	                break;
	            default:
	                System.out.println("잘못된 구역입니다.");
	        }
	    	System.out.println(" ");
			System.out.println("--좌석을 조회합니다.--");
			System.out.println(" ");
			for (int i = 0; i < ConcertV.length; i++) {
				System.out.print("  " + "VIP " + ConcertV[i] + " ");

			}
			System.out.println(" ");
			for (int i = 0; i < ConcertA.length; i++) {
				System.out.print("A열  " + ConcertA[i] + " ");
			}
			System.out.println(" ");
			for (int i = 0; i < ConcertB.length; i++) {
				System.out.print("B열  " + ConcertB[i] + " ");
			}
			System.out.println(" ");
			for (int i = 0; i < ConcertS.length; i++) {
				System.out.print("S열  " + ConcertS[i] + " ");
			}

			System.out.println(" ");
			System.out.println("변경할 좌석을 선택하세요");
			
		}
	    

    public static void selectSeat(char[] seatArray) {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌석을 선택해주세요:");
        int index = sc.nextInt();

        if (index >= 0 && index < seatArray.length) {
            seatArray[index] = 'X'; // 선택된 좌석을 'X'로 표시
            System.out.println("선택이 완료되었습니다.");
        } else {
            System.out.println("잘못된 좌석 번호입니다.");
        }
}
}

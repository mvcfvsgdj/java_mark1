package 티켓팅프로그램임시;

import java.util.Arrays;
import java.util.Scanner;

public class TicketingMain7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Area SectorA = new Area("res/Concert/sectorA.txt",10,"SectorA");
		Area SectorB = new Area("res/Concert/sectorB.txt",10,"SectorB");
		Area SectorS = new Area("res/Concert/sectorS.txt",10,"SectorS");
		Area SectorV = new Area("res/Concert/sectorV.txt",7,"SectorV");

		Area[] Sector = {
				SectorV,
				SectorS,
				SectorA,
				SectorB,	
		};
		
		//폴더 생성
		FileManager.InitFolder();
		
		//파일, 배열 생성
		for(int i = 0; i<Sector.length; i++) {
			FileManager.InitFile(Sector[i]);
		}
		
		int menu = 0;

		System.out.println("콘서트 티켓팅 프로그램");

		loop: while (true) {
			System.out.println("\n\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("\n--좌석 구역과 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");
				등록(sc, Sector);
				break;
			case 2:
				조회(Sector);
				break;
			case 3:
				System.out.println("좌석을 변경합니다.");
				변경(sc, Sector);
				break;
			case 4:
				삭제(sc,Sector);
				break;
				
			case 5:
	        	 totalPrice(Sector);
	        	 break;

				
			case 6:
				System.out.println("종료합니다");
				//파일 저장
				for(int i = 0; i<Sector.length; i++) {
					FileManager.FileSave(Sector[i]);
				}
				break loop;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");

			}
		}
	}

	public static void 조회(Area[] Sector) {
		System.out.println(" ");
		System.out.println("--좌석을 조회합니다.--");
		System.out.println(" ");
		for (int i = 0; i < Sector[0].Concert.length; i++) {
			System.out.print("  " + "VIP " + Sector[0].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[1].Concert.length; i++) {
			System.out.print("S열  " + Sector[1].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[2].Concert.length; i++) {
			System.out.print("A열  " + Sector[2].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[3].Concert.length; i++) {
			System.out.print("B열  " + Sector[3].Concert[i] + " ");
		}

	}

	public static void 등록(Scanner sc, Area[] Sector) {
		char Concert_Insert = sc.next().charAt(0);

		switch (Concert_Insert) {
		case 'V':
			selectSeat(Sector[0]);
			break;
		case 'S':
			selectSeat(Sector[1]);
			break;
		case 'A':
			selectSeat(Sector[2]);
			break;
		case 'B':
			selectSeat(Sector[3]);
			break;
		default:
			System.out.println("잘못된 구역입니다.");
		}
	}

	// 삭제
	public static void 삭제(Scanner sc, Area[] Sector) {
		System.out.println("\n--좌석 구역과 삭제할 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

		char Concert_Update = sc.next().charAt(0);

		switch (Concert_Update) {
		case 'V':
			deleteSeat(Sector[0]);
			break;
		case 'S':
			deleteSeat(Sector[1]);
			break;
		case 'A':
			deleteSeat(Sector[2]);
			break;
		case 'B':
			deleteSeat(Sector[3]);
			break;
		default:
			System.out.println("잘못된 구역입니다.");
		}
	}

	// 변경
	public static void 변경(Scanner sc, Area[] Sector) {

		삭제(sc, Sector);
		System.out.println("\n--변경할 좌석을 다시 입력해주세요--, 구역:A,B,S,VIP \\n ");
		등록(sc, Sector);

	}

	public static void deleteSeat(Area sector) {
		System.out.println("좌석을 선택해주세요:");
		int index = sc.nextInt();

		if (index >= 0 || index < sector.Concert.length) {
			if (sector.Concert[index - 1] == '■') {
				sector.Concert[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("이미 빈 좌석입니다.");
			}
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}
	}

	public static void selectSeat(Area sector) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌석을 선택해주세요:");
		int index = sc.nextInt();

		if (index >= 0 || index < sector.Concert.length) {
			sector.Concert[index - 1] = '■'; // 선택된 좌석을 'X'로 표시
			System.out.println("선택이 완료되었습니다.");
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}

	}
	
	 
	   // 선택된 좌석 수 구하기
	   public static int countSelectedSeats(Area sector) {
	 	    int count = 0;
	 	    for (char seat : sector.Concert) {
	 	        if (seat == '■') {
	 	            count++;
	 	        }
	 	    }
	 	    return count;
	 	}
	   
	   // 금액 구하기
	   public static void totalPrice(Area[] Sector) {
		   
		   int totalPrice = countSelectedSeats(Sector[0])*150000 +countSelectedSeats(Sector[1])*120000 +  countSelectedSeats(Sector[2])*100000 +   countSelectedSeats(Sector[3])*100000;
	             
	       System.out.println("총수익은 "+totalPrice+"원 입니다");     
		   
	   }
}

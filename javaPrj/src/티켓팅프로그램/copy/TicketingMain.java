package 티켓팅프로그램.copy;

import java.util.Scanner;

public class TicketingMain {
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
		
		String menu = "0";

		System.out.println("콘서트 티켓팅 프로그램");

		loop: while (true) {
			System.out.println("\n\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");
			menu = sc.next();

			switch (menu) {
			case "1":
				System.out.println("\n--좌석 구역과 좌석을 선택해주세요--, 구역:A,B,S,V \n ");
				기능구현.등록(sc, Sector);
				break;
			case "2":
				기능구현.조회(Sector);
				break;
			case "3":
				System.out.println("좌석을 변경합니다.");
				기능구현.변경(sc, Sector);
				break;
			case "4":
				기능구현.삭제(sc,Sector);
				break;
				
			case "5":
				기능구현.totalPrice(Sector);
	        	 break;

				
			case "6":
				System.out.println("종료합니다");
				//파일 저장
				for(int i = 0; i<Sector.length; i++) {
					FileManager.FileSave(Sector[i]);
				}
				break loop;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break ;

			}
		}
	}


}

package 티켓팅프로그램.copy.copy;

import java.util.Scanner;

public class TicketingMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Area sectorA_DaysA = new Area("res/Concert/sectorA_DaysA.txt", 10);
		Area sectorB_DaysA = new Area("res/Concert/sectorB_DaysA.txt", 10);
		Area sectorS_DaysA = new Area("res/Concert/sectorS_DaysA.txt", 10);
		Area sectorV_DaysA = new Area("res/Concert/sectorV_DaysA.txt", 7);

		Area sectorA_DaysB = new Area("res/Concert/sectorA_DaysB.txt", 10);
		Area sectorB_DaysB = new Area("res/Concert/sectorB_DaysB.txt", 10);
		Area sectorS_DaysB = new Area("res/Concert/sectorS_DaysB.txt", 10);
		Area sectorV_DaysB = new Area("res/Concert/sectorV_DaysB.txt", 7);

		Area sectorA_DaysC = new Area("res/Concert/sectorA_DaysB.txt", 10);
		Area sectorB_DaysC = new Area("res/Concert/sectorB_DaysB.txt", 10);
		Area sectorS_DaysC = new Area("res/Concert/sectorS_DaysB.txt", 10);
		Area sectorV_DaysC = new Area("res/Concert/sectorV_DaysB.txt", 7);

		Area[][] SectorAll = { { sectorV_DaysA, sectorS_DaysA, sectorA_DaysA, sectorB_DaysA }, 
							   { sectorV_DaysB, sectorS_DaysB, sectorA_DaysB, sectorB_DaysB }, 
							   { sectorV_DaysC, sectorS_DaysC, sectorA_DaysC, sectorB_DaysC } };
		
		Area[] Sector = null;
		String singer = "0";
		singer = sc.next();

		loop: while (true) {
			switch (singer) {
			case "1":
				Sector = SectorAll[0];
				break loop;
			case "2":
				Sector = SectorAll[1];
				break loop;
			case "3":
				Sector = SectorAll[2];
				break loop;

			default:
				break loop;
			}

		}

		// 폴더 생성
		FileManager.InitFolder();

		// 파일, 배열 생성
		for (int i = 0; i < Sector.length; i++) {
			FileManager.InitFile(Sector[i]);
		}

		System.out.println("콘서트 티켓팅 프로그램");

		loop: while (true) {
			System.out.println("\n\n 1.등록 2.조회 3.변경 4.삭제 5.총수익 6.종료");
			String menu = "0";
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
				기능구현.삭제(sc, Sector);
				break;

			case "5":
				기능구현.totalPrice(Sector);
				break;

			case "6":
				System.out.println("종료합니다");
				// 파일 저장
				for (int i = 0; i < Sector.length; i++) {
					FileManager.FileSave(Sector[i]);
				}
				break loop;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;

			}
		}
	}

}

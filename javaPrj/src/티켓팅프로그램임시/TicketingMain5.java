package 티켓팅프로그램임시;

import java.util.Arrays;
import java.util.Scanner;

public class TicketingMain5 {

	public static void main(String[] args) {

		String FolderPath = "res/Concert";

		String[] FilePath = { "res/Concert/sectorA.txt", "res/Concert/sectorB.txt", "res/Concert/sectorS.txt",
				"res/Concert/sectorV.txt", };

		// 폴더 자동 생성
		Init.InitFolder(FolderPath);
		for (int i = 0; i < FilePath.length; i++) {
			Init.InitFile(FilePath[i]);
		}

		Concert_Program cp = new Concert_Program();

		Scanner sc = new Scanner(System.in);

		char ConcertA[] = new char[10];
		char ConcertB[] = new char[10];
		char ConcertS[] = new char[10];
		char ConcertV[] = new char[7];
		Arrays.fill(ConcertA, '□');
		Arrays.fill(ConcertB, '□');
		Arrays.fill(ConcertS, '□');
		Arrays.fill(ConcertV, '□');

		int menu = 0;

		System.out.println("콘서트 티켓팅 프로그램");

		loop: while (true) {
			System.out.println("\n\n 1.등록 2.조회 3.변경 4.삭제 5.종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:

				System.out.println("\n--좌석 구역과 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

				등록(sc, ConcertA, ConcertB, ConcertS, ConcertV);

				break;
			case 2:

				조회(ConcertA, ConcertB, ConcertS, ConcertV);

				break;

			case 3:
				변경(sc, ConcertA, ConcertB, ConcertS, ConcertV);
				break;

			case 4:
				삭제(sc, ConcertA, ConcertB, ConcertS, ConcertV);
				break;

			case 5:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");

			}
		}

//		String updateIndex_ = sc.nextLine();
//		 int updateIndex = Integer.parseInt(updateIndex_);
//		 String updateSeat = sc.nextLine();

	}

	public static void 조회(char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
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
	}

	public static void 등록(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
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
	}

	// 삭제
	public static void 삭제(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
		System.out.println("\n--좌석 구역과 변경할 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

		char Concert_Update = sc.next().charAt(0);

		switch (Concert_Update) {
		case 'A':
			deleteSeat(ConcertA);
			break;
		case 'B':
			deleteSeat(ConcertB);
			break;
		case 'S':
			deleteSeat(ConcertS);
			break;
		case 'V':
			deleteSeat(ConcertV);
			break;
		default:
			System.out.println("잘못된 구역입니다.");
		}
	}

	// 변경
	public static void 변경(Scanner sc, char[] ConcertA, char[] ConcertB, char[] ConcertS, char[] ConcertV) {
		System.out.println("\n--좌석 구역과 변경할 좌석을 선택해주세요--, 구역:A,B,S,VIP \n ");

		char Concert_Update = sc.next().charAt(0);

		switch (Concert_Update) {
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
	}

	public static void deleteSeat(char[] seatArray) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌석을 선택해주세요:");
		int index = sc.nextInt();

		if (index >= 0 && index < seatArray.length) {
			if (seatArray[index - 1] == '■') {
				seatArray[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("이미 빈 좌석입니다.");
			}
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}
	}

	public static void selectSeat(char[] seatArray) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌석을 선택해주세요:");
		int index = sc.nextInt();

		if (index >= 0 && index < seatArray.length) {
			seatArray[index - 1] = '■'; // 선택된 좌석을 'X'로 표시
			System.out.println("선택이 완료되었습니다.");
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}

	}
}

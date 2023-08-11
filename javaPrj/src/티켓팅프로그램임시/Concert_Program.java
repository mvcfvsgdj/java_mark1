package 티켓팅프로그램임시;

import java.util.Scanner;

public class Concert_Program implements ConcertTicketing {

	@Override
	public void Concert_Insert() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//A , B, S , V, 좌석 선택
		char ConcertA_Insert[] = new char[10];
		char ConcertB_Insert[] = new char[10];
		char ConcertS_Insert[] = new char[10];
		char ConcertV_Insert[] = new char[7];

		int index = 0;
		System.out.println(" ");
		System.out.println("--좌석 구역과 좌석을 선택해주세요--");

		char Concert_Insert = sc.next().charAt(0);
		
		if(index <ConcertV_Insert.length) {
		ConcertV_Insert[index] = Concert_Insert;
		index++;
		}


		if(index <ConcertA_Insert.length) {
		ConcertA_Insert[index] = Concert_Insert;
		index++;
		}



		if(index <ConcertB_Insert.length) {
		ConcertB_Insert[index] = Concert_Insert;
		index++;
		}


		if(index <ConcertS_Insert.length) {
		ConcertS_Insert[index] = Concert_Insert;
		index++;
		}
	
	     // 출력 부분
        System.out.println("ConcertV_Insert:");
        for (char seat : ConcertV_Insert) {
            System.out.print(seat + " ");
        }
        System.out.println();

        System.out.println("ConcertA_Insert:");
        for (char seat : ConcertA_Insert) {
            System.out.print(seat + " ");
        }
        System.out.println();

        System.out.println("ConcertB_Insert:");
        for (char seat : ConcertB_Insert) {
            System.out.print(seat + " ");
        }
        System.out.println();

        System.out.println("ConcertS_Insert:");
        for (char seat : ConcertS_Insert) {
            System.out.print(seat + " ");
        }
		
		
	}

	@Override
	public void Concert_Search() {
		// TODO Auto-generated method stub

		char ConcertA_Search[] = new char[10];
		char ConcertB_Search[] = new char[10];
		char ConcertS_Search[] = new char[10];
		char ConcertV_Search[] = new char[7];

		System.out.println("--좌석을 조회합니다.--");
		System.out.println(" ");
		for (int i = 0; i < ConcertV_Search.length; i++) {
			System.out.print("  " + "VIP " + ConcertV_Search[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < ConcertA_Search.length; i++) {
			System.out.print("A열  " + ConcertA_Search[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < ConcertB_Search.length; i++) {
			System.out.print("B열  " + ConcertB_Search[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < ConcertS_Search.length; i++) {
			System.out.print("S열  " + ConcertS_Search[i] + " ");
		}

	}

	@Override
	public void Concert_Change() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Concert_Delete() {
		// TODO Auto-generated method stub

	}

}

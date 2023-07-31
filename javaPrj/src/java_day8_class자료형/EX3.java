package java_day8_class자료형;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
	    String[][] weekSchedule = new String[7][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("월요일부터 일요일까지 각각 하루에 최대 5개까지 일정을 입력하세요.");

        for (int j = 0; j < 7; j++) {
            System.out.println(week(j) + "의 일정을 입력하세요:");

            for (int i = 0; i < 5; i++) {
                System.out.print("일정 " + (i + 1) + " (시간 내용): ");
                String input = sc.nextLine();

            
                

                weekSchedule[j][i] = input;
            }
        }

        // 일정 출력
        System.out.println("\n주간 일정:");
        for (int j = 0; j < 7; j++) {
            System.out.println(week(j) + "의 일정:");

            for (int i = 0; i < 5; i++) {
                if (weekSchedule[j][i] != null) {
                    System.out.println("일정 " + (i + 1) + ": " + weekSchedule[j][i]);
                }
            }
            System.out.println();
        }
    }

    public static String week(int day) {
        String[] daysOfWeek = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        return daysOfWeek[day];
    }
}

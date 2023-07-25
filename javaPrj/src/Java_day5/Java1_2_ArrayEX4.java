package Java_day5;

import java.util.Scanner;

public class Java1_2_ArrayEX4 {

	public static void main(String[] args) {


		//짝수저장
		int[] arr = new int[10]; 
		int a = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
        for (int i = 0; i < 10; i++) {
            System.out.print("숫자 입력 ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
            	arr[a] = num;
                a++;
            }
        }


        
        System.out.println("짝수 배열");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

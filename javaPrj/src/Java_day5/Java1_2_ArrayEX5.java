package Java_day5;

import java.util.Scanner;

public class Java1_2_ArrayEX5 {

	public static void main(String[] args) {


		//배열합
		int[] arr = new int[10]; 
		int a = 0;// 
		
		
		
		Scanner sc = new Scanner(System.in);
		
        for (int i = 0; i < 10; i++) {
            System.out.print("숫자 입력 ");
            arr[i] = sc.nextInt();
           
          }
        System.out.println("배열");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        
       
        
        //총합 구하는 반복문
        for (int i = 0; i < 10; i++) {
        	a+=arr[i]; // 0에서 배열의 받은 숫자만큼 더해줌 
        
       
        }
        
        System.out.println("총합"+ a);
       
    }
}

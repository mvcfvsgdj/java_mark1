package Java_day5;

import java.util.Scanner;

public class Java1_3_ArrayEX1 {

	public static void main(String[] args) {


			
		int [][] even = new int [3][3];
		
		even [0][0]=2;
		even [0][1]=4;
		even [0][2]=6;
		
		even [1][0]=8;
		even [1][1]=10;
		even [1][2]=12;
		
		even [2][0]=14;
		even [2][1]=16;
		even [2][2]=18; 
		
		for(int i =0 ; i<even.length;i++) {
			for(int j=0 ; j<even.length; j++) {
			System.out.print(even[i][j]+" ");
			
			}
			System.out.println();
		}
		
		int [][] odd =new int [3][3];
		int a =1;
		for(int i = 0 ; i<odd.length;i++) {
			for(int j = 0 ; j<odd[i].length;j++) {
		
				odd[i][j]=a;
				a+=2;
			}
		}
		
		for(int i = 0 ; i<odd.length;i++) {
			for(int j=0 ; j<odd.length;j++) {
				System.out.print(odd[i][j]+" ");
			}
			System.out.println();;
		}
		
    }
}

package Java_day5;

import java.util.Scanner;

public class Java1_3_ArrayEX2 {

	public static void main(String[] args) {


			
		int [][] even = {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		};
		

		int [][] odd = {
				{1,3,5},
				{7,9,11},
				{13,15,19}
		};
		for(int i=0 ; i<even.length;i++) {
			
			for(int j=0;j<even.length;j++) {
				
				System.out.print(even[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0 ; i<odd.length;i++) {
			for(int j=0; j<odd.length;j++) {
				
				System.out.print(odd[i][j]+" ");
			}
			System.out.println();
		}
		
    }
}

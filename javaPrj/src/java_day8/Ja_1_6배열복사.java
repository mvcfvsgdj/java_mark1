package java_day8;

import java.util.Arrays;

public class Ja_1_6배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 3, 5, 9 };
		// int [] arr = {3,5,9} ;

		// 배열 복사
		int[] newArr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
			
		
	}

}

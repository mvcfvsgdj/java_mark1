package java_day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ja_1_6배열복사2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 3, 5, 9 };
		// 	t새배열	
		int [] newArr = new int[3];
		
						//원본배열,시작위치 //새 배열, 시작위치
		System.arraycopy(arr, 0, newArr, 0, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
			
		
	}

}

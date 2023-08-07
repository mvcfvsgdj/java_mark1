package day15.정렬;

import java.util.Arrays;
import java.util.Comparator;

import day15.MyArrays.Score;

public class 객체정렬라이브러리 {

	public static void main(String[] args) {

		Score[] arr = new Score[3]; // null로 초기화

		arr[0] = new Score("홍길동", 100, 90);
		arr[1] = new Score("김길동", 80, 75);
		arr[2] = new Score("이길동", 75, 85);

		Arrays.sort(arr, new Comparator<Score>() {

			@Override
			
			public int compare(Score o1, Score o2) {
				Score s1 = (Score)o1;
				Score s2 = (Score)o2;
				
				return s1.getEng() -s2.getEng();
			}}); 
		
		for(Score s : arr)
			System.out.println(s);
		
	
		
		Arrays.sort(arr ,new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				
				return o1.getKor()- o2.getKor();
				
		
		}});
	
		//Arrays.sort(arr);
	}

	
}

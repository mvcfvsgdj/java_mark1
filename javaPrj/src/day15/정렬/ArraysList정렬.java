package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraysList정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Score> lis = new ArrayList();
		
	
		Collections.sort(lis , new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				
				return s1.getKor()- s2.getKor();
			}
			
		});
		for(Score score : lis ) {
			System.out.println(score);
		}
		Collections.sort(lis , new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				
				return s1.getKor()- s2.getKor();
			}
			
		});
	}
}

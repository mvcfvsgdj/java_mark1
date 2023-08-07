package day15.정렬;

public class MyArraysTest {

	public static void main(String[] args) {
	
		Score[] arr = new Score[3]; // null로 초기화

		arr[0] = new Score("홍길동", 100, 90);
		arr[1] = new Score("김길동", 80, 75);
		arr[2] = new Score("이길동", 75, 85);

		// MyArrays.sort(배열,MyComparator 인터페이스)
		MyComparatorImp m = new MyComparatorImp();
		
		MyArrays.sort(arr,m );
		System.out.println("정렬후");
		for(Score score:arr)
			System.out.println(score);
		
		//익명 클래스 객체생성
		
		MyArrays.sort(arr, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 =(Score)o1;
				Score s2 =(Score)o2;
				
				return s1.getEng()-s2.getEng();
			}});
		System.out.println("영어정렬후");
		for(Score score:arr)
			System.out.println(score);
	}

}

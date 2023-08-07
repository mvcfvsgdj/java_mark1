package day15.정렬;

public class 객체직접연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score[] arr = new Score[3]; // null로 초기화

		arr[0] = new Score("홍길동", 100, 90);
		arr[1] = new Score("김길동", 80, 75);
		arr[2] = new Score("이길동", 75, 85);

		MyArrays.sort(arr);
		for(Score s: arr)
			System.out.println(s);
	}

}

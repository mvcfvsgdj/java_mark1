package java_day14.ExceptionEx;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예외처리 : 예외발생시 대비코드
		// 필수 : checked : 반드시 해야함
		// 선택 :	 unchecked //배열범위가 벗어나면 0으로나눔
		// 방법 = > 1개 try{}catch()이용
		try {
			int[] arr = new int[3];
			arr[3] = 50;

			System.out.println(arr[3]);
		} catch (Exception e) {
			// 예외가 발생되었을때 해야할일
		}
		System.out.println("정상종료");
	}

}

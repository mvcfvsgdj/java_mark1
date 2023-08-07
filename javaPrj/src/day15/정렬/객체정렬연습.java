package day15.정렬;

public class 객체정렬연습 {

	public static void main(String[] args) {

		// 객체참조형변수를 배열로 만든것 * Score형 객체생성안됨
		Score[] arr = new Score[3]; // null로 초기화

		arr[0] = new Score("홍길동", 100, 90);
		arr[1] = new Score("김길동", 80, 75);
		arr[2] = new Score("이길동", 75, 85);

		// 정렬 전

		for (Score score : arr) {
			System.out.println(score);// score.toString()
		}

		// 정렬 후

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getKor() > arr[j].getKor()) {

					Score tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬후");
		for (Score s : arr)
			System.out.println(s);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) { // 비교했을때 기준이 크면 양수
														// 비교했을때 기준이 작으면 음수
				if (arr[i].getName().compareTo(arr[j].getName()) > 0) {

					Score tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}

		System.out.println("이름순");
		for (Score score : arr) {
			System.out.println(score);
		}

	}
}

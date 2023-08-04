package java_day14.equal오버라이드복습;

import java.util.ArrayList;

public class ScoreTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체배열

		ArrayList list = new ArrayList();

		// 학생 등록하기

		Score s = new Score("ㄱㄱㄱ", 100, 99);
		Score s2 = new Score("sss", 20, 40);

		list.add(s);
		list.add(s2);
		list.add(new Score("ㅎㅎㅎ", 99, 100));

		// 삭제하기
		System.out.println("정보삭제하기");
		int index = 1;
		list.remove(index - 1);

		// 조회하기
		System.out.println("조회하기");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Object => toString()
		// Score => toString() 재정의 (오버라이드)

		Object obj = new Score("ㄱㄱㄱ", 100, 99);
		System.out.println(obj);
		// 부모형으로 참조해도 오버라이드된 실제 객체의 매서드호출

		// ㅎㅎ정보찾기

		System.out.println("ㅎㅎㅎ찾기");
		String searchName = "ㅎㅎㅎ";
		for (int i = 0; i < list.size(); i++) {

			Object o = list.get(i);
			String name = ((Score) o).getName();

			if (name.equals(searchName)) {

				System.out.println(o);
			}
		}
		// ㄴㄴㄴ 정보변경
		System.out.println("ㄴㄴㄴ정보변경");
		for (int i = 0; i < list.size(); i++) {
			Score score = (Score) list.get(i);
			if (score.getName().equals("ㄴㄴㄴ")) {
				// 국어점수변경

				score.setKor(99);
			}
		}

		System.out.println("조회");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}

package day13.ArrayListEx;

import java.util.ArrayList;

import java_day12.Score;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Score> list = new ArrayList<>();

		Score s = new Score("가나다", 100, 99);
		Score s2 = new Score("마바사", 20, 40);

		// 등록하기
		System.out.println("등록하기");

		list.add(s);
		list.add(s2);
		list.add(new Score("아자카", 99, 100));

		// 조회하기
		System.out.println("조회하기");

		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);

			System.out.println(score);
		}
		System.out.println("마바사 조회");
		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			String name = score.getName();
			if (name.equals("마바사")) {
				System.out.println(score);
			}
		}

		// 삭제하기
		int index = 1;
		list.remove(index - 1);
		System.out.println("전체 조회하기");
		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);
		}

		// 아자카 성적 변경

		System.out.println("아자카 값 변경");
		String searchName = "아자카";
		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			if (score.getName().equals(searchName))
				;

			score.setEng(98);

		}
		System.out.println("전체 조회하기");
		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);
		}

	}
}

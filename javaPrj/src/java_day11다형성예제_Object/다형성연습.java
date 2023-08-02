package java_day11다형성예제_Object;

import java.util.ArrayList;

public class 다형성연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// car , cat ,person 참조형변수
		// 상속을 받아도 기본적으로 Object를 상속받음
		// 모든 객체는 Object 로 다룰수있음
		// java의 라이브러리 class에서 Object 사용

		Car car = new Car();
		Cat cat = new Cat();
		Person person = new Person();
		Wolf wolf = new Wolf();

		// 참조형변수 4개를 배열로 만듬 객체가 만들어진게 아님

		Object[] arr = new Object[4];
		arr[0] = car;
		arr[1] = cat;
		arr[2] = person;
		arr[3] = wolf;

		// 반복문

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}

		// 가변길이배열, 순서, 중복허용
		ArrayList list = new ArrayList();
		list.add(person);
		list.add(car);
		list.add(cat);
		list.add(wolf);

		for (Object o : list) {
			System.out.println(o.toString());

			if (o instanceof Cat) {
				((Cat) o).쥐를잡는다();
			}
		}
		String str = "ifjfj";
		char result = str.charAt(0);
		boolean result2 = str.equals("ifjfj");

		Object obj = str; // 업캐스팅

		String str1 = "one";
		String str2 = "two";
		String str3 = "three";

		ArrayList strList = new ArrayList();
		strList.add(str1);
		strList.add(str2);
		strList.add(str3);

		for (int i = 0; i < strList.size(); i++) {
			Object o = strList.get(i);
			System.out.println(o);

			if (o instanceof String) {
				String rtn =((String) o).toUpperCase();
			System.out.println(rtn);
			}
		}

	}

}

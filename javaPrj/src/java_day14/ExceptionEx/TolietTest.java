package java_day14.ExceptionEx;

import java.util.Scanner;

public class TolietTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" (남자/여자)중 성별을 입력하세요 잘못입력시 문이열리지 않음");
		Toilet Toilet = new Toilet();
		String  gender1 = sc.next();
		
		try {
			Toilet.gender(gender1);
		} catch (MensTolietException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

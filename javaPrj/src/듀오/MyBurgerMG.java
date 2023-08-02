package 듀오;

public class MyBurgerMG extends HamP {

	// 부모에서 받아옴
	public MyBurgerMG(String 햄버거이름, String 소스, String 빵, String 패티, String 야채) {
		super(햄버거이름, 소스, 빵, 패티, 야채);

	}
	// 햄버거의 내용물 나열
	public String toString() {
		return "햄버거이름 : " + 햄버거이름 + " 소스 : " + 소스 + " 빵 : " + 빵 + " 패티 : " + 패티 + " 야채 : " + 야채;
	}

}

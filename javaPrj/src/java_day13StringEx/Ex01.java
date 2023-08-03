package java_day13StringEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열을 생성하는 두가지

		// 한 번 생성
		// 정적 영역(상수영역에 생성)
		// 같은 문자열을 사용할때는 별도의 공간을 확보하지않고
		// 래퍼런스(주소) 만 제공
		String str0 = "hi";  //"hi"한개
		String str1 = "hi";
		// 문자열 수정불가

		
		// 2개 각각 생성됨
		// heap 메모리에 각각생성
		String str2 = new String("hi"); 
		String str3 = new String("hi");
		// 문자열 수정불가 (final char[] value)
	

		}
	}



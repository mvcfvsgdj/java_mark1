package java_day14.equal오버라이드복습;

public class ScoreTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score score = new Score("김씨" ,800 ,80);
		Score score2 = new Score("김씨", 100 ,80);
	
		if(score.equals(score2)) {
			System.out.println("같은사람");
		}else {
			System.out.println("다른사람");
		}
		///
		Object o = score; //업캐스팅
		Object o2 = score2;
		
		
		if(o.equals(o2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
	}

}

package java_day4;

public class Java_1_5_ContinueEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue  반복문에서 다음 반복으로 진행 명령
		//홀수합구하기
		//1 3 5 7 9
		
		
		int sum=0;
		for(int i=1 ; i<=10;  i++) {
			if(i%2==0) {
				continue;
		}
			sum+=i;
		}
		System.out.println(sum);
		
		
	}

}

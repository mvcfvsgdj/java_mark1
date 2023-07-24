package java_day4;

public class Java_1_2_BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch
		// while , for 반복문에서 break;
		// 자신이 속한 반복문 빠져나옴
		//1-10까지합
		
		
		int i=0;
		int sum=0;
		while(true) {
			i++;
			sum =sum+i;
			if(i >=10 )break;
		
			
		} //무한, 탈출조건
		
		System.out.println(sum);
	
	}

}

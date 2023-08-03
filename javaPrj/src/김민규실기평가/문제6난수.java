package 김민규실기평가;

import java.util.Random;

public class 문제6난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Random random = new Random();
        int randomNum = random.nextInt(); // 정수형 난수 생성
        if(randomNum<0) {
        	randomNum*=-1;
        }
        
        System.out.println("난수: " + randomNum);	
	}

}

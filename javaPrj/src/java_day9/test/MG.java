package java_day9.test;


public class MG {

	public static int[] getYak(int num) {
		// TODO Auto-generated method stub

       
        int[] yak = new int[20];
 
        int cnt = 0; // 배열시작 0...19
        for (int i = 1; i <= num; i++) {   //   i:  12  => 12/1  ~12/12   
            if (num % i == 0){//약수 구하는식 
                yak[cnt] = i; // i 가 배열에 들어가게함
                cnt++;	
            }
        }
        
        return yak;
        

        
    }
}
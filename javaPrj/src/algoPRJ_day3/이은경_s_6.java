package algoPRJ_day3;

public class 이은경_s_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//등비수열 각항에 *3씩 적용
		//등비 : 3
		//1 2 3 4 5 6 7...
		//2 6 18 54 162 486
		
		int sum = 2;
		int n = 2;
		int i = 1;
		
		System.out.print(n+ ",");
		
		while (i < 7) {
			n=(n*2)+n;		//항을 구한다
			sum=sum+n; //항을 누적한다
			i++;		
		System.out.print(n + ",");
			
			
		}
		System.out.println("\n sum="+sum);

	}

}

package java_day7;

public class Java_1_1_함수3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n=5;
		int result = getSum3(n);
		System.out.println(result);
		
	
	}

	public static int getSum3(int n) {
		
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum+=i;
			
		}
		
		return sum;
	}

	

	}



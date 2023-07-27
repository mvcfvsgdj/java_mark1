package java_day7;

public class Java_1_1_함수4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result =a();
	    for(int i=0; i<result.length; i++) {
	    	   System.out.println(result);
	    }
	 

	    
	    int [][] result2 = b();
	    for(int i = 0 ; i<result2.length;i++) {
	    	for(int j=0 ; j<result2.length;j++) {
	    		System.out.println(result2[i][j]+ " ");
	    	}
	    	System.out.println( );
	    }
	}
	
	// 반환은 한개만 가능함
	// 배열 , 객체
	// 			반환type int[]
	public static int[] a( ) {
		int[] result = {3,5};
		return result;

	}

	
	//
	public static int[][] b() {
		int[][] result = { { 1, 2 },
						   { 3, 4 } };
		return result;
		
		
	}

}

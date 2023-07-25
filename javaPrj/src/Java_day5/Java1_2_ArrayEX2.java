package Java_day5;

public class Java1_2_ArrayEX2 {

	public static void main(String[] args) {

	 	/*String[] arr1= new String[5];
	 	
	 	arr1[0]="포도";
	 	arr1[1]="망고";
	 	arr1[2]="배";
	 	arr1[3]="감";
	 	arr1[4]="귤";
		for(int i=0;i<arr1.length;i++) {
	 	System.out.print(arr1[i]);
	}*/
		
		//2차원 [행]세로[열]가로 
		
		//String[][] favor = new String[2][5];
		
		String[][] favor = {{"1","2","3","4","5"},
							{"6","7","8","9","10"}};
		
		System.out.println(favor[1][2]);
		System.out.println(favor[0][3]);
		System.out.println(favor[0][1]);
	}
 
}

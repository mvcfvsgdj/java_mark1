package Java_day5;

public class Java1_2_ArrayEX3 {

	public static void main(String[] args) {


		String[][] favor = {{"개","똥","아"},
							{"똥","쌌","니"},
							{"아","니","오"}};
		
		/*System.out.print(favor[0][0]);
		System.out.print(favor[1][0]);
		System.out.println(favor[2][0]);
		*/
		
		for(int i=0;i<favor[0].length;i++) {
			System.out.print(favor[0][i]);
		}
		/*System.out.print(favor[1][0]);
		System.out.print(favor[1][1]);
		System.out.println(favor[1][2]);*/
		for(int i=0;i<favor[1].length;i++) {
			System.out.print(favor[1][i]);
		}
		/*System.out.print(favor[2][0]);
		System.out.print(favor[2][1]);
		System.out.println(favor[2][2]);
		*/
		for(int i=0;i<favor[2].length;i++) {
			System.out.print(favor[2][i]);
		}

	/*	for(int i=0 ; i<favor.length ; i++) {
			for(int j=0; j<favor.length ; j++)
			System.out.println(favor[i][j]);
		}*/
	}
 
}

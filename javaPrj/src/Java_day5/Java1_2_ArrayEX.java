package Java_day5;

public class Java1_2_ArrayEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열
		
		//배열사용후 이해
		
		
		//변수 5개 선언
	 	//int a , b, c, d ,e ;
	 	//1차원배열
	 	//자바는 배열부터 heap 메모리 강제한다.
	 
	 	//c에서 배열을 선언하는 코드 자바는 사용불가
	 	//c언어에서 배열을 선언하는 두가지
	 	//int arr[5];
	 	//int* arr2 =(int*)malloc(sizeof(int)*5);
	 	
	 	//자바에서 배열 선언하는 방법
	 	
	 	//int[] kors = new int[5];
	 	//int[] kors2 = {90,80,99,100,89};//배열의 초기화 블럭 사용가능
		
	 	int a=10 , b=5,c=8,d=9,e=25;
	 	int sum=a+b+c+d+e;
	 	System.out.println(sum);
	 	
	 	int[] arr=new int [5];
	 	
	 	
	 	arr[0]=10;
	 	arr[1]=5;
	 	arr[2]=9;
	 	arr[3]=9;
	 	arr[4]=25;
	 	//int sum2= arr[0]+arr[1]+ arr[2] + arr[3] +arr[4];
	 	
	 	/*System.out.println(a);
	 	System.out.println(b);
	 	System.out.println(c);
	 	System.out.println(d);
	 	System.out.println(e);*/
	 	
	 	//변수 사용가능
	 	//반복문 사용가능
	 	/*System.out.println(arr[0]);
	 	System.out.println(arr[1]);
	 	System.out.println(arr[2]);
	 	System.out.println(arr[3]);
	 	System.out.println(arr[4]);*/
	 	
	 	for(int i=0 ; i<arr.length; i++) {
	 		System.out.println(arr[i]);
	 	}
	 	
	 	//5개
	 	
	 	//char[] arr=new char[5];
	 	//double[] arr2= new double[5];
	 	//String[] arr3= new String[5];
	 	//int [] arr4 = new int[5];
	 	
	 	
	 	String[] arr1= new String[5];
	 	
	 	arr1[0]="안";
	 	arr1[1]="녕";
	 	arr1[2]="하";
	 	arr1[3]="세";
	 	arr1[4]="요";
		for(int i=0;i<arr1.length;i++) {
	 	System.out.print(arr1[i]);
	}
		
	}
 
}

package java_day9_classType;


// 관련있는 data + data를 다루는 함수 => 하나의 단위로 작성
// class 단위로 프로그래밍하는것 

//데이터 + 데이터를 더하는함수
public class 커피데이타2 {
	//data ( 멤버변수 ) 
	
	int 설탕=1000;
	int 프림=1000;
	int 물=10000;
	int 원두=1000;
	int 매출금액=0;

	//
	//static 제거 
	// public void fillcoffee(커피데이타2 this):
	public  void fillCoffee() { //this 참조형변수 자동으로 제공함 
		this.물 +=1000;			//static 빠진 메서드는 this 제공
		this.원두 +=100;			//static 
		this.설탕 +=100;
		this.프림 +=100;
	}

	public  void printInfo() {
		System.out.println("현재 커피 출력");
		System.out.println(this.매출금액);
		System.out.println(this.물);
		System.out.println(this.설탕);
		System.out.println(this.원두);
		System.out.println(this.프림);
	}
	
	
	public  String 밀크커피만들기(int 돈) {
		
		if(돈==100) {
			System.out.println("밀크커피 제조");
			this.물 -=10;
			this.설탕 -=20;
			this.원두 -=10;
			this.프림 -=10;
			
			return "밀크커피rr";
		}
		
		return "ㄴㄴ" ;
		
	}
	
	
}

package java_day10.inheritance;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cat a = new Cat ();
		/*
		 * Cat이 Animal을 상속받았다면
		 * Cat형 객체는 Cat형으로 다룰수 있고 Animal형으로 다룰수있음
		 */
		Dog b = new Dog ();
		/*
		 * Dog이 Animal을 상속받았다면
		 * Dog형 객체는 Cat형으로 다룰수 있고 Animal형으로 다룰수있음
		 */
		
		print(a);
		print(b);
		printCat(a);
		printDog(b);
	}						
								//Animal형을 매개변수로받음
								//Cat형과 Dog형을 Animal로 다룰수있음
	public static void print (Animal animal) {
		animal.짖는다();
	
	}
	public static void printDog (Dog dog) {
		dog.짖는다();
	}
	public static void printCat (Cat cat) {
		cat.짖는다();
	
	}


}

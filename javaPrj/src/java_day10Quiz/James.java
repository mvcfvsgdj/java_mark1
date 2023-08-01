package java_day10Quiz;


public class James {

	
	/*age = 40
	name= "james"
	isMarried = true
	children = 3*/
	
	private	int age;
	private	String name;
	private	boolean isMarried;
	private	int children;
	
	public  James() {
		
	}
	
	public  James(int age , String name , boolean isMarried , int children) {
		this.age =40;
		this.name="james";
		this.isMarried=true;
		this.children=3;}

	
	public String toString() {
		
		return age + " " + name + " " + isMarried + " " + children;
	}
	
		
	}
	

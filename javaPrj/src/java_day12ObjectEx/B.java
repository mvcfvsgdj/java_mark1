package java_day12ObjectEx;

public class B {

	int number;

	public B() {

	}

	public B(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return number + "이다";
	}

	@Override
//public boolean equals(B this ,Object obj) {
	public boolean equals(Object obj) {

		boolean result = false;
	
		B b = (B) obj;

		if (this.number == b.number)
			result = true;

		return result;

	}
}

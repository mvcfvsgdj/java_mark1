package java_day9_classType;

public class Mile2 {

	int mile;
	double kiloMeter;

	public double calCulator(int mile ) {
		this.mile = mile;
		this.kiloMeter = mile*1.60934;
		return kiloMeter;
	}
}
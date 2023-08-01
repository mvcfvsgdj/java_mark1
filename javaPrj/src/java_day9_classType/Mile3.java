package java_day9_classType;

public class Mile3 {

	private int mile;
	private double kiloMeter;

	private double calCulator(int mile ) {
		this.mile = mile;
		this.kiloMeter = mile*1.60934;
		return kiloMeter;
	}
	
	public double getkiloMeter(int mile) {
		double result= calCulator(mile);
		return result;
	}
}
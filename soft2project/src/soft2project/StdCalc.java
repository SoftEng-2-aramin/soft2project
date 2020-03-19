package soft2project;

import static java.lang.Math.abs;


public class StdCalc {
	
	private StdCalc() {}
	
	public static double mulitiply(double a, double b) {
		double c = a * b;
		return c;
	}
	public static double divide(double d, double e) {
		double f = d / e;
		return f;
	}
	public static double add(double g, double h) {
		double i = g + h;
		return i;
	}
	public static double subtract(double j, double k) {
		double m = j - k;
		return m;
	}
	public static double absolute(double n) {
		return abs(n);
	}
	
}


package finaltestbasic;

public class Problema1 {

	public static double harmonicAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}
		return ((2 * a * b) / (a + b));
	}

}

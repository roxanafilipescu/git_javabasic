package trivial;

import java.util.Scanner;// pe site in editor imi da FAIL

public class TestTR8 {

	public static double divide(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti primul numar real: ");
		double a = scanner.nextDouble();

		System.out.print("Introduceti al doilea numar real: ");
		double b = scanner.nextDouble();

		if (b == 0) {
			System.out.println(Double.MAX_VALUE);
		} else {
			double result = divide(a, b);
			System.out.println("Rezultatul impartirii lui " + a + " la " + b + " este " + result);
		}
		scanner.close();
	}
}
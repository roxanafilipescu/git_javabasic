package trivial;

import java.util.Scanner;

public class TestTR7 {

	public static double fahrenheitToCelsius(double temperature) {
		return (temperature - 32) * 5 / 9.0;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti temperatura in Fahrenheit: ");
		int temperature = scanner.nextInt();
		double temperatureCelsius = fahrenheitToCelsius(temperature);

		System.out.println("FahrenheitToCelsius( " + temperature + " ) -> " + temperatureCelsius);
		scanner.close();
	}
}
package trivial;

import java.util.Scanner;

public class TestTR5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti suma in RON: ");
		int sumaRON = scanner.nextInt();

		System.out.print("Introduceti cursul valutar: ");
		double curs = scanner.nextDouble();

		int sumaEUR = (int) (sumaRON / curs);
		int restRON = (int) (sumaRON % curs);

		System.out.println("Suma in EUR: " + sumaEUR);
		System.out.println("Suma in RON: " + restRON);

		scanner.close();
	}
}
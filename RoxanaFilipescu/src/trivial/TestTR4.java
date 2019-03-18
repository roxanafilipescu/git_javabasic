package trivial;

/* Primesc eroarea asta la compilare
	-Exception in thread "main" java.util.InputMismatchException
	-at java.util.Scanner.throwFor(Unknown Source)
	-at java.util.Scanner.next(Unknown Source)
	-at java.util.Scanner.nextDouble(Unknown Source)
	-at exercises.TestTR4.main(TestTR4.java:13) */

import java.util.Scanner;

public class TestTR4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti suma in EUR ");
		double EUR = scanner.nextDouble();

		System.out.print("Introduceti cursul valutar ");
		double curs = scanner.nextDouble();

		System.out.println("Suma in RON este: " + EUR * curs);

		scanner.close();
	}
}
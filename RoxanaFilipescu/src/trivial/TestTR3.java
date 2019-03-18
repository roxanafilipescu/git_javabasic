package trivial;

import java.util.Scanner;

public class TestTR3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti un numar de la tastatura: ");

		int numar = scanner.nextInt();

		System.out.println("Patratul numarului " + numar + " este: " + numar * numar);
		System.out.println("Cubul numarului " + numar + " este: " + numar * numar * numar);

		scanner.close();
	}
}
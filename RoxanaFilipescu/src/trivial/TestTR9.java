package trivial;

import java.util.Scanner;

public class TestTR9 {

	public static boolean inPitagoraRelation(int a, int b, int c) {
		return ((a * a + b * b == c * c) && ((a + b + c) % 10) == 0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti primul numar: ");
		int a = scanner.nextInt();

		System.out.print("Introduceti al doilea numar: ");
		int b = scanner.nextInt();

		System.out.print("Introduceti al treilea numar: ");
		int c = scanner.nextInt();

		boolean result = inPitagoraRelation(a, b, c);
		if (result == true) {
			System.out.println("Numerele " + a + ", " + b + ", " + c + " sunt pitagorice si divizibile cu 10.");
		} else {
			System.out.println("Numerele " + a + ", " + b + ", " + c + " nu indeplinesc cel putin una din conditii !");
		}
		scanner.close();

	}
}

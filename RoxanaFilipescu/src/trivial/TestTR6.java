package trivial;

import java.util.Scanner;

public class TestTR6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti primul numar: ");
		int a = scanner.nextInt();

		System.out.print("Introduceti al doilea numar: ");
		int b = scanner.nextInt();

		double average = avg(a, b);
		System.out.println("Media aritmetica a lui " + a + " si " + b + " este:" + average);

		scanner.close();
	}

	public static double avg(int a, int b) {

		return (a + b) / 2.0;
	}
}

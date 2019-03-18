package trivial;

import java.util.Scanner;

public class TestTR11 {

	public static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti numarul pe care il doriti sa ii verificati paritatea: ");
		int n = scanner.nextInt();

		boolean result = isEven(n);

		if (result == true) {
			System.out.println("Numarul " + n + " este par");
		} else {
			System.out.println("Numarul " + n + " este impar");
		}
		scanner.close();
	}
}
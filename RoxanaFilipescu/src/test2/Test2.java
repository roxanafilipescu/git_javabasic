package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti o expresie:");
		String s = scanner.nextLine();

		char operator = s.charAt(1);
		char operand1 = s.charAt(0);
		char operand2 = s.charAt(2);
		if (operator == '+') {
			System.out.println(Integer.parseInt("" + operand1) + Integer.parseInt("" + operand2));
		} else if (operator == '-') {
			System.out.println(Integer.parseInt("" + operand1) - Integer.parseInt("" + operand2));
		}

		scanner.close();
	}
}

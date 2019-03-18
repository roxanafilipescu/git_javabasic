package teme;

import java.util.Scanner;

public class Minicalculator {

	public static void main(String[] args) {
		int temporal = 0;
		System.out.println(temporal);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(">");
			String s = scanner.nextLine();

			if (s.contains("=")) {
				int index = s.indexOf("=");
				temporal = Integer.parseInt(s.substring(index + 1));
			}

			if (s.contains("+")) {
				int index = s.indexOf("+");
				temporal += Integer.parseInt(s.substring(index + 1));
			}

			if (s.contains("-")) {
				int index = s.indexOf("-");
				temporal -= Integer.parseInt(s.substring(index + 1));
			}
			if (s.contains("*")) {
				int index = s.indexOf("*");
				temporal *= Integer.parseInt(s.substring(index + 1));
			}
			if (s.contains("/")) {
				int index = s.indexOf("/");
				temporal /= Integer.parseInt(s.substring(index + 1));
			}

			if (s.contains("x")) {
				break;
			}

			// else Invalid operation
			System.out.println(temporal);

		}
		scanner.close();
	}
}

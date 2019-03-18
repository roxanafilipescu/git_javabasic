package teme;

import java.util.Scanner;

public class DigitalNumber {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[][] panel = new char[3][120]; // A 20 digit panel!
		int digXIndex = 0;
		int digYIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			int dig = Integer.valueOf("" + s.charAt(i));
			panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 1 && dig != 4)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			panel[digXIndex][digYIndex] = 32;

			digYIndex = 3 * i;
			digXIndex++;
			// if (s.charAt(i) == 2 || s.charAt(i) == 5)
			// panel[digXIndex][digYIndex] = 111;
			if (dig != 1 && dig != 2 && dig != 3 && dig != 7)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 1 && dig != 0 && dig != 7)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 6 && dig != 5)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;

			digYIndex = 3 * i;
			digXIndex++;
			// if (s.charAt(i) == 2 || s.charAt(i) == 5)
			// panel[digXIndex][digYIndex] = 111;
			if (dig != 6 && dig != 8 && dig != 2 && dig != 0)
				panel[digXIndex][digYIndex] = 32;
			else
				panel[digXIndex][digYIndex] = '|';
			digYIndex++;
			if (dig != 7 && dig != 4 && dig != 1)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 2)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;

			digXIndex = 0;
			digYIndex += (i * 3) + 1;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 120; j++)
				if (panel[i][j] != 0)
					System.out.print((panel[i][j]));
				else
					System.out.print("");
			System.out.println();
			System.out.println(Integer.valueOf("" + s.charAt(i)));
		}
		scanner.close();
	}

}

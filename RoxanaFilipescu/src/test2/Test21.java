package test2;

public class Test21 {

	public static int operation(String s) {
		int c = 0;
		String firstOperand = null;
		String secondOperand = null;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				c = i;
				firstOperand = s.substring(0, c);
				secondOperand = s.substring(c + 1, s.length());
				if (c == '+') {
					System.out.println(Integer.parseInt("" + firstOperand) + Integer.parseInt("" + secondOperand));
				} else if (c == '-') {
					System.out.println(Integer.parseInt("" + firstOperand) - Integer.parseInt("" + secondOperand));
				}
			}
		}
		System.out.println(firstOperand);
		System.out.println(secondOperand);
		return 0;

	}

	public static void main(String[] args) {
		operation("100+90");
	}
}

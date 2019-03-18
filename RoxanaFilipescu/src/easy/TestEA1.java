package easy;

public class TestEA1 {
	public static int reverse(int n) {
		int invers = 0;
		if (n == 0) {
			return invers = 0;
		}
		while (n > 0) {
			int lastDigit = n % 10;
			invers = invers * 10 + lastDigit;
			n /= 10;
		}

		return invers;
	}

	public static void main(String[] args) {
		System.out.println(reverse(500));
	}
}

package basic;

public class TestBA3 {
	public static int factorial(int n) {
		int produs = 1;
		if (n == 0) {
			return 1;
		}

		for (int i = 1; i <= n; i++) {

			produs *= i;
		}
		return produs;
	}
}

package easy;

public class TestEA4 {
	public static int cmmmc(int a, int b) {
		int max = Integer.max(a, b);

		for (int i = max; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}

		return -1;
	}

}

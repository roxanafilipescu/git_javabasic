package easy;

public class TestEA5 {
	public static int cmmdc(int a, int b) {
		int min = Integer.min(a, b);

		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(cmmdc(30, 6));
	}
}

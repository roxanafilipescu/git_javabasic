package basic;

public class TestBA5 {
	public static int product(int[] sir) {
		int produs = 1;
		int zeros = 0;
		if (sir.length == 0) {
			return 1;
		} else
			for (int i = 0; i < sir.length; i++) {
				if (sir[i] == 0) {
					zeros += 1;
					if (zeros == sir.length) {
						return 1;
					}
				}
				if (sir[i] != 0) {
					produs *= sir[i];
				}
			}
		return produs;
	}

	public static void main(String[] args) {
		System.out.println(product(new int[] { 1, 0, 3, 0, 5, 0 }));
	}
}

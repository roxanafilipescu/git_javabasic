package basic;

public class TestBA4 {
	public static int max(int[] sir) {

		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < sir.length; i++) {
			if (maximum < sir[i]) {
				maximum = sir[i];
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		System.out.println(max(new int[] { -6, -4, -8, -5, -2, -1 }));
	}
}
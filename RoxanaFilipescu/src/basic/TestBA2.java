package basic;

public class TestBA2 {

	public static int countNegatives(int[] sir) {
		int c = 0;
		for (int element : sir) {
			if (element < 0)

				c += 1;
		}
		return c;
	}
}

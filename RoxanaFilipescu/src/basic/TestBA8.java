package basic;

import java.util.Arrays;

public class TestBA8 {
	public static int[] reverse(int[] sir) {

		for (int i = 0; i < sir.length / 2; i++) {
			int temporal = sir[i];
			sir[i] = sir[sir.length - i - 1];
			sir[sir.length - i - 1] = temporal;

		}
		return sir;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[] { 1, 2, 8, 7 })));
	}

}
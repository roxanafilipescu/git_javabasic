package easy;

import java.util.Arrays;

public class TestEA7 {

	public static int[] ascendingOrder(int[] sir) {

		int temp;
		for (int i = 0; i < sir.length; i++) {
			for (int j = i + 1; j < sir.length; j++) {
				if (sir[i] > sir[j]) {
					temp = sir[i];
					sir[i] = sir[j];
					sir[j] = temp;
				}
			}
		}
		return sir;

	}

	public static int nthSmallest(int[] sir, int n) {
		if (n > sir.length) {
			return -1;
		}
		sir = ascendingOrder(sir);
		return sir[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ascendingOrder(new int[] { 6, 8, 2, 1, 4, 9 })));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 3));
	}

}

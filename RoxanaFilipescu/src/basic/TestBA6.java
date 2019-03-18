package basic;

public class TestBA6 {
	public static int arrayToNumber(int[] sir) {

		int number = 0;
		if (sir.length == 0) {
			return -1;
		}
		for (int i = 0; i < sir.length; i++) {
			if ((sir[i] >= 0) & (sir[i] <= 9)) {
				number *= 10;
				number += sir[i];
			} else {
				return -2;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(arrayToNumber(new int[] { 7, 8, 7 }));
	}
}
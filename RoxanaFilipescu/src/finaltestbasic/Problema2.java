package finaltestbasic;

public class Problema2 {

	public static boolean isSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;

			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSorted(new int[] { 0, 10, 1, 2, 3, 7, 9 }));
	}
}

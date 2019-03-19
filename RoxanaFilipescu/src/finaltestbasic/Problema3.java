package finaltestbasic;

public class Problema3 {
	public static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] == n) && i == (arr.length - 1))
				return -1;
			else if (arr[i] == n)
				return arr[i + 1];
		}
		return -2;
	}

	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 5, 7, 2, 4 }, 7));
		System.out.println(next(new int[] { 1, 5, 7, 2, 4 }, 14));
	}
}

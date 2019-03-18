package basic;

public class testone {
	public static int findSumPosition(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			if (sum == arr[i]) {
				return i;
			}
			sum += arr[i];

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(findSumPosition(new int[] { 1, 12, 4, 7, 24, 13, 15, 24 }));
	}
}

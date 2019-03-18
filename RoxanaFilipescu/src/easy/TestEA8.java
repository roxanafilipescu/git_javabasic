package easy;

public class TestEA8 {
	public static boolean contains(int[] a, int[] b) {
		int[] c = new int[b.length];
		int d = -1;

		if (a.length == 0) {
			return false;
		}
		if (b.length == 0) {
			return true;
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = d + 1; j < a.length; j++) {

				if (b[i] == a[j]) {
					c[i] = b[i];
					d = j;
					System.out.println("c= " + c[i]);
					break;
				}
			}
		}
		if (c[b.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 1, 4, 3 }));

	}
}

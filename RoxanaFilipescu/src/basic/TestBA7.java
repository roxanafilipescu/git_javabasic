package basic;

public class TestBA7 {
	public static int find(int[] sir, int n) {

		for (int i = 0; i < sir.length; i++) {
			if (sir[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(find(new int[] { 3, 4, 7, 7 }, 8));
	}
}

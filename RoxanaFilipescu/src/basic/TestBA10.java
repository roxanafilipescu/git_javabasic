package basic;

public class TestBA10 {
	public static int getSecondaryDiagonalSum(int[][] matrix) {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][matrix.length - 1 - i];
		}

		return sum;
	}
}
package basic;

public class TestBA1 {
	public static double avg(int[] sir) {

		int sum = 0;
		for (int element : sir) {
			sum += element;

		}
		return (double) sum / sir.length;
	}
}

package trivial;

import java.util.Scanner;
/*Primesc eroarea 
							- * Exception in thread "main" Media marginilor sirului este
							-java.lang.IllegalStateException: Scanner closed
							-	at java.util.Scanner.ensureOpen(Unknown Source)
							-	at java.util.Scanner.next(Unknown Source)
							-	at java.util.Scanner.nextInt(Unknown Source)
							-	at java.util.Scanner.nextInt(Unknown Source)
							-	at exercises.TestTR10.main(TestTR10.java:24)
							-
							- */

public class TestTR10 {

	public static int marginsAverage(int[] arr) {
		if (arr.length == 0) {
			return -1;

		}
		return (arr[0] + arr[arr.length - 1]) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti numarul de elemente al sirului: ");
		int n = scanner.nextInt();

		int arr[] = new int[n];
		System.out.println("Introduceti elementele: ");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();

			int result = marginsAverage(arr);

			if (result == -1) {
				System.out.println("Sirul are lungimea 0.");
			} else {
				System.out.println("Media marginilor sirului este " + result);
			}
			scanner.close();

			System.out.println("Media marginilor sirului este");
		}
	}
}
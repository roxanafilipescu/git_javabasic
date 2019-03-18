package teme;

public class Watch {

	public static String DigitalDisplay(String expression) {
		char[][] panel = new char[3][120]; // A 20 digit panel!
		int digXIndex = 0;
		int digYIndex = 0;
		for (int i = 0; i < expression.length(); i++) {
			int dig = Integer.valueOf("" + expression.charAt(i));
			panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 1 && dig != 4)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			panel[digXIndex][digYIndex] = 32;

			digYIndex = 3 * i;
			digXIndex++;

			if (dig == 58)
				panel[digXIndex][digYIndex] = 'o';
			else
				panel[digXIndex][digYIndex] = 32;

			if (dig != 1 && dig != 2 && dig != 3 && dig != 7)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 1 && dig != 0 && dig != 7)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 6 && dig != 5)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;

			digYIndex = 3 * i;
			digXIndex++;

			if (dig == 58)
				panel[digXIndex][digYIndex] = 'o';
			else
				panel[digXIndex][digYIndex] = 32;

			if (dig != 6 && dig != 8 && dig != 2 && dig != 0)
				panel[digXIndex][digYIndex] = 32;
			else
				panel[digXIndex][digYIndex] = '|';
			digYIndex++;
			if (dig != 7 && dig != 4 && dig != 1)
				panel[digXIndex][digYIndex] = '_';
			else
				panel[digXIndex][digYIndex] = 32;
			digYIndex++;
			if (dig != 2)
				panel[digXIndex][digYIndex] = '|';
			else
				panel[digXIndex][digYIndex] = 32;

			digXIndex = 0;
			digYIndex += (i * 3) + 1;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 120; j++)
				if (panel[i][j] != 0)
					System.out.print((panel[i][j]));
				else
					System.out.print("");
			System.out.println();
		}
		return expression;
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 30; i++) {
			// timpul curent
			// System.out.println(System.currentTimeMillis());

			long anNebisect = 365 * 24 * 60 * 60 * 1000l;// ms
			// long anBisect = 366 * 24 * 60 * 60 * 1000l;

			// long currentYearRemains = (System.currentTimeMillis()
			// /anNebisect);
			// long currentYear = currentYearRemains + 1970;

			long currentDaysRemains = System.currentTimeMillis() % anNebisect;
			// long currentDay = currentDaysRemains / (24 * 60 * 60 * 1000);

			long currentHoursRemains = currentDaysRemains % (24 * 60 * 60 * 1000);
			long currentHours = (currentHoursRemains / (60 * 60 * 1000)) + 2;

			long currentMinutesRemains = currentHoursRemains % (60 * 60 * 1000);
			long currentMinutes = currentMinutesRemains / (60 * 1000);

			long currentSecondsRemains = currentMinutesRemains % (60 * 1000);
			long currentSecundes = currentSecondsRemains / 1000;

			// System.out.println(currentYear);
			// System.out.println(currentDay);
			// System.out.println(currentHours + ":" + currentMinutes + ":" +
			// currentSecundes);
			String currentTime = currentHours + ":" + currentMinutes + ":" + currentSecundes;
			DigitalDisplay(currentTime);
		}

		// pauza de o secunda in program
		Thread.sleep(1000);

	}
}

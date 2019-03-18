package teme;

public class CeasDigital {

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
			System.out.println(currentHours + ":" + currentMinutes + ":" + currentSecundes);
			// String expression = currentHours + ":" + currentMinutes + ":" +
			// currentSecundes;

		}

		// pauza de o secunda in program
		Thread.sleep(1000);

	}

}
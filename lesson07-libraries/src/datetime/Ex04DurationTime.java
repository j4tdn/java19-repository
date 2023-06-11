package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DurationTime {
	public static void main(String[] args) {
		Calendar dateStart = getInstance(2023, Calendar.MARCH, 18, 15, 10, 20);
		Calendar dateEnd = getInstance(2023, Calendar.JUNE, 20, 13, 20, 30);

		if (dateStart.after(dateEnd)) {
			throw new IllegalArgumentException("date start should not greater than date end !!!");
		}

		long dateStartInMs = dateStart.getTimeInMillis();
		long dateEndInMs = dateEnd.getTimeInMillis();
		long duration = dateEndInMs - dateStartInMs;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(seconds);

		System.out.println("duration: " + days 		+ " days "
										+ hours 	+ " hours "
										+ minutes 	+ " minutes "
										+ seconds 	+ " seconds");
	}

	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
}

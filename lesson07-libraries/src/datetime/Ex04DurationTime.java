package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DurationTime {
	public static void main(String[] args) {
		Calendar c1 = getInstance(2023, Calendar.MARCH, 18, 10, 10, 20);
		Calendar c2 = getInstance(2023, Calendar.JUNE, 20, 17, 20, 30);
		
		long i = c1.getTimeInMillis();
		long j = c2.getTimeInMillis();
		long duration = j - i;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(hours);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(hours);
		System.out.println("duration: " + days + " " + hours + " " + minutes + " " + seconds);
	}
	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
}

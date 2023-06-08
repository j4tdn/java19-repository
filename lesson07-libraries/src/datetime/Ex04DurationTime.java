package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Tìm khoảng thời gian 2 người quen nhau với TimeUnit : [Year - Month] - Days -
 * Hours + Minutes + Seconds
 * 
 * @author Admin
 *
 */
public class Ex04DurationTime {

	public static void main(String[] args) {

		Calendar dateStart = getInstance(2023, Calendar.MARCH, 18, 10, 10, 20);
		Calendar dateEnd = getInstance(2023, Calendar.JULY, 20, 17, 20, 30);

		if (dateStart.after(dateEnd)) {
			throw new IllegalArgumentException("start date should not greater than end date");
		}

		long dateStartInMms = dateStart.getTimeInMillis();
		long dateEndInMms = dateEnd.getTimeInMillis();

		long duration = dateEndInMms - dateStartInMms;
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.println(
				"duration: " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

	}

	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
}

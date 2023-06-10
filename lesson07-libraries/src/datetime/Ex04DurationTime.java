package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author USER
 *
 */
public class Ex04DurationTime {
	public static void main(String[] args) {

		Calendar dateStart = getInstance(2023, Calendar.MARCH, 18, 10, 10, 20);
		Calendar dateEnd = getInstance(2023, Calendar.JUNE, 20, 17, 20, 30);
		
		if(dateStart.after(dateEnd)) {
			throw new IllegalArgumentException("Date Start should not exceed Date End!");
		}
		
		long dateStartInMls = dateStart.getTimeInMillis();
		long dateEndInMls = dateEnd.getTimeInMillis();
		
		long duration = dateEndInMls - dateStartInMls;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("duration: " + days    + " days "
										+ hours   + " hours "
										+ minutes + " minutes " 
										+ seconds + " seconds");
	}

	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
}

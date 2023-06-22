package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/*
 * Ex04: Tìm khoảng thời gian 2 người quen nhau với TimeUnit
    : [Years - Months] - Days - Hours + Minutes + Seconds
 */

public class Ex04DurationTime {
	public static void main(String[] args) {
		
		Calendar dateStart = getInstance(2023, Calendar.MARCH, 18, 10, 10, 20);
		Calendar dateEnd = getInstance(2023, Calendar.JUNE, 20, 17, 20, 30);
		
		if(dateStart.after(dateEnd)) {
			throw new IllegalArgumentException("date start should not greater than date end");
		}
		
		long dateStartInms = dateStart.getTimeInMillis();
		long dateEndInms = dateEnd.getTimeInMillis();
		
		long duration = dateEndInms - dateStartInms;
		
		long days = TimeUnit.MILLISECONDS.toMillis(duration);
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hour = TimeUnit.MILLISECONDS.toMillis(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hour);
		
		long minute = TimeUnit.MILLISECONDS.toMillis(duration);
		duration = duration - TimeUnit.MINUTES.toMillis(minute);
		
		long second = TimeUnit.MILLISECONDS.toMillis(duration);
		duration = duration - TimeUnit.SECONDS.toMillis(second);
		
		System.out.println("Days " + days+
							" Hours " + hour+
							" Minutes " + minute+
							" Seconds " + second);

		
		
		
	}
	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year,month,day, hour, minute, second );
		return c;
	}
}

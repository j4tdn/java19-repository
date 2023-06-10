package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Tìm khoảng thười gian 2 người quen nhau với TimeUnit
 * */

public class Ex04DurationTime {
	public static void main(String[] args) {
		
		// c1 -> 2023/03/18 10:10:20
		// c1 -> 2023/06/20 17:20:30
		
		Calendar dateStart = getInstance(2023,Calendar.MARCH,18,10,10,20);
		Calendar dateEnd = getInstance(2023,Calendar.JUNE,20,17,20,30);
		
		if(dateStart.after(dateEnd))
			throw new IllegalArgumentException("date start should not greater than date end !!!");
		
		long dateStartInMs = dateStart.getTimeInMillis();
		long dateEndInMs = dateEnd.getTimeInMillis();
		long duration = dateEndInMs- dateStartInMs;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("duration : " + days + " days " + 
				 hours + " hours " +
				 minutes + " minutes " +
				 seconds + " seconds "
				);
	}
	
	private static Calendar getInstance(int year, int month, int day, int hour, int minute, int second) {
		Calendar c= Calendar.getInstance();
		c.set(year, month, day, hour, minute, second);
		return c;
	}
}

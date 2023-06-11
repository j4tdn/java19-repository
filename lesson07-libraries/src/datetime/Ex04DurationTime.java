package datetime;
//Tim khoang thoi gian 2 nguowi quen nhau viet TimeUnit

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DurationTime {
   public static void main(String[] args) {
	Calendar dateStart = getInstance(2023, Calendar.MARCH, 18, 10, 10, 20);
	Calendar dateEnd = getInstance(2023, Calendar.JULY, 202, 17, 20, 30);
	
	if(dateStart.after(dateEnd)) {
		throw new IllegalArgumentException("date start should not greater than date end!!!");
	}
	long dateStartInMs = dateStart.getTimeInMillis();
	long dateEndInMs = dateEnd.getTimeInMillis();
	long duration = dateEndInMs - dateStartInMs;
	long days = TimeUnit.MICROSECONDS.toDays(duration);
	
	
	
  }
   private static Calendar getInstance(int year, int month, int day, int hour, int minute, int seconds ) {
	   Calendar c = Calendar.getInstance();
	   c.set(year, month, day, hour, minute, seconds);
	   return c;
   }
}

package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex04DurationTime {
	public static void main(String[] args) {
		Calendar dateStart = Calendar.getInstance();
		Calendar dateEnd = Calendar.getInstance();
		
		long dateStarInMs = dateStart.getTimeInMillis();
		long dateEndInMs = dateEnd.getTimeInMillis();
		
		long duration = dateEndInMs - dateStarInMs;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
	}
	
//	private static Calendar getInstance() {
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

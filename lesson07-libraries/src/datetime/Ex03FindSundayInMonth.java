package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Ex03FindSundayInMonth {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		for(Calendar c: getSundays(Calendar.getInstance())) {
			System.out.println(df.format(c.getTime()));
		}
		
	}
	
	private static Calendar[] getSundays(Calendar c) {
		Calendar[] result = new Calendar[5];
		
		Calendar fisrtDayOfMonth = Calendar.getInstance();
		fisrtDayOfMonth.setTime(c.getTime());
		fisrtDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		Calendar endDayOfMonth = Calendar.getInstance();
		endDayOfMonth.setTime(c.getTime());
		endDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		endDayOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar running = Calendar.getInstance();
		running.setTime(fisrtDayOfMonth.getTime());
		
		int counter = 0;
		while(running.before(endDayOfMonth)) {
			if(running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
			}else {
				running.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
}

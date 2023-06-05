package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class Ex03SundayCounter {
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.set(2023, Calendar.JULY,8);
		for (Calendar cal : getSundays(Calendar.getInstance())) {
			System.out.println(df.format(cal.getTime()));
		}
		
	}
	private static Calendar[] getSundays(Calendar c) {
		Calendar[] result = new Calendar[5];
		
//		Calendar firstDayOfMonth = Calendar.getInstance();
//		firstDayOfMonth.setTime(c.getTime());
		Calendar firstDayOfMonth = (Calendar)c.clone();
		firstDayOfMonth.set(Calendar.DAY_OF_MONTH,1); //1.6.2023

		Calendar endDayOfMonth = (Calendar)c.clone(); //30.6.2023
		endDayOfMonth.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1); 
		//avoid end of month = the current day
		
		Calendar running = (Calendar)firstDayOfMonth.clone();
		int counter = 0;
		while (running.before(endDayOfMonth)) {
			if (running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				result[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH,1);
			} else {
				running.add(Calendar.DAY_OF_MONTH, 1);
				
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
}
package bai3;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bai3Demo {
	static Calendar c = Calendar.getInstance();
	static DateFormat df;
	public static void main(String[] args) {
		System.out.println(getTimNow(c));
		System.out.println(getLastDayOfCurrentMonth(c));
		System.out.println(getFirstDayAndLastDayOfCurrentWeek(c));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}
	
	public static String getTimNow(Calendar c) {
		df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		return "Time now --> " + df.format(c.getTime());
	}
	
	public static String getLastDayOfCurrentMonth(Calendar c) {
		Calendar temp = (Calendar)c.clone();
		temp.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		df = new SimpleDateFormat("dd/MM/yyy");
		return "Last day of month --> " + df.format(temp.getTime());
	}
	
	public static String getFirstDayAndLastDayOfCurrentWeek(Calendar c) {
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
		Calendar startDayOfWeek = Calendar.getInstance();
		startDayOfWeek.setTime(c.getTime());
		
		startDayOfWeek.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
	
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, -1);

		return "Start day of week --> " + df.format(startDayOfWeek.getTime()) + "\n" +
				"End day of week --> " + df.format(endDayOfWeek.getTime());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

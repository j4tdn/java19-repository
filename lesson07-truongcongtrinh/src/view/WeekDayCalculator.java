package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static utils.DateUtils.*;

public class WeekDayCalculator {
	public static void main(String[] args) {
		Date date = parseDateFormat("Date", "dd,MM,yyyy");
		Calendar calendarAsDate = createCalendarAsDate(date);
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy");

		System.out.println(df.format(date) + " is a " );
		System.out.println("Additional facts");
		System.out.println(" . It is day number " 
						+ calendarAsDate.get(Calendar.DAY_OF_YEAR) + " of the year, "
						+ optional(calendarAsDate.getActualMaximum(Calendar.DAY_OF_YEAR) 
								- calendarAsDate.get(Calendar.DAY_OF_YEAR),"day") + "left" );
		System.out.println(" . It is Monday number " + getActualMaximumCurrentDayOfWeekInYear(calendarAsDate)[0] 
										+ " out of " + getActualMaximumCurrentDayOfWeekInYear(calendarAsDate)[1] 
										+ " in " 	 + getActualMaximumCurrentDayOfWeekInYear(calendarAsDate)[2]);
		
		System.out.println(" . It is Monday number " + getActualMaximumCurrentDayOfWeekInMonth(calendarAsDate)[0] 
										+ " out of " + getActualMaximumCurrentDayOfWeekInMonth(calendarAsDate)[1]
										+ " in"     +  df.format(date).substring(df.format(date).trim().indexOf(" ")));
		System.out.println(" . Year " + calendarAsDate.get(Calendar.YEAR) + " has " + calendarAsDate.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println(" ." + df.format(date).substring(df.format(date).trim().indexOf(" "))
								+ " has " + calendarAsDate.getActualMaximum(Calendar.DAY_OF_MONTH) 
								+ " days");
	}
	
	
	
	
}

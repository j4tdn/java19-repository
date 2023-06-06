package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ex01.DayOfWeek;

public class Ex02 {
	private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		excute();
	}
	
	private static void excute() {
		System.out.println("input day (dd/MM/yyyy): ");
		Date day = null;

		while (true) {
			try {
				String firstDayString = scanner.nextLine();
				day = df.parse(firstDayString);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid input format. Please try again.");
			}
		}
		Calendar dayCalendar = Calendar.getInstance();
		dayCalendar.setTime(day);
		
		Calendar fisrtDayOfYearCalendar = (Calendar)dayCalendar.clone();
		fisrtDayOfYearCalendar.set(Calendar.DAY_OF_YEAR, 1);
		
		System.out.println(dayCalendar.getTime());
		int maxDaysOfYear = dayCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		 System.out.println("It is day number " + dayCalendar.get(Calendar.DAY_OF_YEAR) + " days of year, " + (maxDaysOfYear - dayCalendar.get(Calendar.DAY_OF_YEAR)) + " days left");
		 
		 DayOfWeek[] dowAsEnum = DayOfWeek.values();
		 int dayOfWeekAsInt = dayCalendar.get(Calendar.DAY_OF_WEEK);
		 int maxWeekOfYear =  dayCalendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		 System.out.println("It's " + dowAsEnum[dayOfWeekAsInt - 1] +
				 " number " + dayCalendar.get(Calendar.WEEK_OF_YEAR) +
				 " out of " + maxWeekOfYear + " in " + dayCalendar.get(Calendar.YEAR));
		 
		 
		 MonthOfYear[] monthOfYearsEnum = MonthOfYear.values();
		 int maxWeekOfMonth = dayCalendar.get(Calendar.WEEK_OF_MONTH);
		 System.out.println(dayCalendar.get(Calendar.MONTH));
		 System.out.println("It's " + dowAsEnum[dayOfWeekAsInt - 1] +
				 " number " + dayCalendar.get(Calendar.WEEK_OF_MONTH) +
				 " out of " + maxWeekOfMonth + " in " + monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " " + dayCalendar.get(Calendar.YEAR));
		
		 System.out.println("Year " + dayCalendar.get(Calendar.YEAR) + " has " + maxDaysOfYear + " days");
		 
		 System.out.println(monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " " + dayCalendar.get(Calendar.YEAR) + " has " + dayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
}

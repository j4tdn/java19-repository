package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date day = null;

		while (true) {
			try {
				System.out.println("Nhập ngày (dd/MM/yyyy): ");
				String firstDayString = scanner.nextLine();
				day = df.parse(firstDayString);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid input format. Please try again.");
			}
		}
		//Mon Sep 25 00:00:00 ICT 1995
		Calendar dayCalendar = Calendar.getInstance();
		dayCalendar.setTime(day);
		System.out.println(dayCalendar.getTime());
		
		//It is day number 268 of the year, 97 days left
		int maxDaysOfYear = dayCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("It is day number " + dayCalendar.get(Calendar.DAY_OF_YEAR) + " of the year, "
				+ (maxDaysOfYear - dayCalendar.get(Calendar.DAY_OF_YEAR)) + " days left");

		//It's MONDAY number 39 out of 52 in 1995
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		int dayOfWeekAsInt = dayCalendar.get(Calendar.DAY_OF_WEEK);
		int maxWeekOfYear = dayCalendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("It's " + (dowAsEnum[dayOfWeekAsInt - 1].name()) + " number " + dayCalendar.get(Calendar.WEEK_OF_YEAR)
				+ " out of " + maxWeekOfYear + " in " + dayCalendar.get(Calendar.YEAR));

		//It's Monday number 4 out of 4 in September 1995
		MonthOfYear[] monthOfYearsEnum = MonthOfYear.values();
		int maxWeekOfMonth = (dayCalendar.get(Calendar.WEEK_OF_MONTH) - 1);
		System.out.println("It's " + dowAsEnum[dayOfWeekAsInt - 1].name() + " number "
				+ (dayCalendar.get(Calendar.WEEK_OF_MONTH) - 1) + " out of " + maxWeekOfMonth + " in "
				+ monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " " + dayCalendar.get(Calendar.YEAR));

		//Year 1995 has 365 days
		System.out.println("Year " + dayCalendar.get(Calendar.YEAR) + " has " + maxDaysOfYear + " days");

		//September 1995 has 30 days
		System.out.println(monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " " + dayCalendar.get(Calendar.YEAR)
				+ " has " + dayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
}

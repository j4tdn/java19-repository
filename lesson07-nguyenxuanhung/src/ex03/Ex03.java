package ex03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		System.out.println("now: " + nowTime());
		System.out.println("last day in this month: " + lastDayInMonth());
		firstAndLastDayOfWeek();
		System.out.println("week of year: " + WeekOfYear());
		after20Days();
		countDayAlive();

	}

	private static Date nowTime() {
		return Calendar.getInstance().getTime();
	}

	private static Date lastDayInMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

	private static void firstAndLastDayOfWeek() {
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.set(Calendar.DAY_OF_WEEK, firstDayOfWeek.getFirstDayOfWeek());
		System.out.println("First day of this week: " + firstDayOfWeek.getTime());

		Calendar lastDayOfWeek = Calendar.getInstance();
		lastDayOfWeek.set(Calendar.DAY_OF_WEEK, lastDayOfWeek.getActualMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("Last day of this week: " + lastDayOfWeek.getTime());
	}
	
	private static int WeekOfYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.WEEK_OF_YEAR);
	}
	
	private static void after20Days() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 20); 
		System.out.println("After 20 days: "+ c.getTime());
	}
	
	private static void countDayAlive() {

		System.out.println("input your birthday (dd/MM/yyyy): ");
		Date birthday = null;

		while (true) {
			try {
				String birthdayString = scanner.nextLine();
				birthday = df.parse(birthdayString);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid input format. Please try again.");
			}
		}
		Calendar birthdayCalendar = Calendar.getInstance();
		birthdayCalendar.setTime(birthday);
		long duration = Calendar.getInstance().getTimeInMillis() - birthdayCalendar.getTimeInMillis();
		int days = (int) (duration / (1000 * 60 * 60 * 24));
		System.out.println("you alived " + days + " days");
		
	}
}

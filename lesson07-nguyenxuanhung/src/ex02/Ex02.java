package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ex01.DayOfWeek;

public class Ex02 {
	private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		excute();
		excuteJava8Ver();
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

		Calendar fisrtDayOfYearCalendar = (Calendar) dayCalendar.clone();
		fisrtDayOfYearCalendar.set(Calendar.DAY_OF_YEAR, 1);

		System.out.println(dayCalendar.getTime());
		int maxDaysOfYear = dayCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("It is day number " + dayCalendar.get(Calendar.DAY_OF_YEAR) + " days of year, "
				+ (maxDaysOfYear - dayCalendar.get(Calendar.DAY_OF_YEAR)) + " days left");

		/**
		 * countMondaysInYear = so MONDAY toi da trong nam 
		 * mondayAtYear: index MONDAY hien tai trong nam
		 */
		Calendar calendarToCount1 = Calendar.getInstance();
		calendarToCount1.set(Calendar.YEAR, dayCalendar.get(Calendar.YEAR));
		calendarToCount1.set(Calendar.MONTH, Calendar.JANUARY);
		calendarToCount1.set(Calendar.DAY_OF_MONTH, 1);

		int countMondaysInYear = 0;
		int mondayAtYear = 0;
		while (calendarToCount1.get(Calendar.YEAR) == dayCalendar.get(Calendar.YEAR)) {
			if (calendarToCount1.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				countMondaysInYear++;
				if (calendarToCount1.get(Calendar.DAY_OF_YEAR) == dayCalendar.get(Calendar.DAY_OF_YEAR)) {
					mondayAtYear = countMondaysInYear;
				}
			}
			calendarToCount1.add(Calendar.DAY_OF_YEAR, 1);
		}

		/**
		 * countMondaysInMonth = so MONDAY toi da trong thang 
		 * mondayAtMonth: index MONDAY hien tai trong thang
		 */
		Calendar calendarToCount2 = Calendar.getInstance();
		calendarToCount2.set(Calendar.YEAR, dayCalendar.get(Calendar.YEAR));
		calendarToCount2.set(Calendar.MONTH, dayCalendar.get(Calendar.MONTH));
		calendarToCount2.set(Calendar.DAY_OF_MONTH, 1);

		int countMondaysInMonth = 0;
		int mondayAtMonth = 0;
		int maxDaysOfMonth = calendarToCount2.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= maxDaysOfMonth; i++) {
			if (calendarToCount2.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				countMondaysInMonth++;
				if (calendarToCount2.get(Calendar.DAY_OF_MONTH) == dayCalendar.get(Calendar.DAY_OF_MONTH)) {
					mondayAtMonth = countMondaysInMonth;
				}
			}
			calendarToCount2.add(Calendar.DAY_OF_MONTH, 1);
		}
		//
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		int dayOfWeekAsInt = dayCalendar.get(Calendar.DAY_OF_WEEK);
		int maxWeekOfYear = dayCalendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("It's " + dowAsEnum[dayOfWeekAsInt - 1] + " number " + mondayAtYear
				+ " out of " + countMondaysInYear + " in " + dayCalendar.get(Calendar.YEAR));

		MonthOfYear[] monthOfYearsEnum = MonthOfYear.values();
		int maxWeekOfMonth = dayCalendar.getActualMaximum(Calendar.WEEK_OF_MONTH);
		System.out.println(dayCalendar.get(Calendar.MONTH));
		System.out.println("It's " + dowAsEnum[dayOfWeekAsInt - 1] + " number " + mondayAtMonth + " out of "
				+ countMondaysInMonth + " in " + monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " "
				+ dayCalendar.get(Calendar.YEAR));

		System.out.println("Year " + dayCalendar.get(Calendar.YEAR) + " has " + maxDaysOfYear + " days");

		System.out.println(monthOfYearsEnum[dayCalendar.get(Calendar.MONTH)] + " " + dayCalendar.get(Calendar.YEAR)
				+ " has " + dayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}

	private static void excuteJava8Ver() {
		System.out.println("input day (dd/MM/yyyy): ");
		LocalDate day = null;

		while (true) {
			try {
				String firstDayString = scanner.nextLine();
				day = LocalDate.parse(firstDayString, formatter);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Invalid input format. Please try again.");
			}
		}

		int maxDaysOfYear = day.lengthOfYear();
		System.out.println("It is day number " + day.getDayOfYear() + " days of year, "
				+ (maxDaysOfYear - day.getDayOfYear()) + " days left");

		/// Tìm max thứ 2 trong tháng
		LocalDate firstDayOfMonth = day.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDayOfMonth = day.with(TemporalAdjusters.lastDayOfMonth());
		int countMondaysInMonth = 0;
		LocalDate currentDay = firstDayOfMonth;
		while (!currentDay.isAfter(lastDayOfMonth)) {
			if (currentDay.getDayOfWeek() == java.time.DayOfWeek.MONDAY) {
				countMondaysInMonth++;
			}
			currentDay = currentDay.plusDays(1);
		}
		System.out.println(countMondaysInMonth);

		/// Tìm max thứ 2 trong tháng
		LocalDate firstDayOfYear = day.with(TemporalAdjusters.firstDayOfYear());
		LocalDate lastDayOfYear = day.with(TemporalAdjusters.lastDayOfYear());

		int countMondaysInYear = 0;
		LocalDate currentDay1 = firstDayOfYear;
		while (!currentDay1.isAfter(lastDayOfYear)) {
			if (currentDay1.getDayOfWeek() == java.time.DayOfWeek.MONDAY) {
				countMondaysInYear++;
			}
			currentDay1 = currentDay1.plusDays(1);
		}
		System.out.println(countMondaysInYear);

		System.out.println("It's " + day.getDayOfWeek() + " number " + day.get(ChronoField.ALIGNED_WEEK_OF_YEAR)
				+ " out of " + countMondaysInYear + " in " + day.getYear());

		System.out.println(day.getMonth());

		System.out.println("It's " + day.getDayOfWeek() + " number " + day.get(ChronoField.ALIGNED_WEEK_OF_MONTH)
				+ " out of " + countMondaysInMonth + " in " + day.get(ChronoField.MONTH_OF_YEAR) + " " + day.getYear());

		System.out.println("Year " + day.getYear() + " has " + day.lengthOfYear() + " days");

		System.out.println(day.getMonth() + " " + day.getYear() + " has " + day.lengthOfMonth() + " days");
	}
}

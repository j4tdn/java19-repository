package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import common.DayOfWeekAsText;
import common.DayOfWeekAsVnese;

public class DateUtils {
	private static final DayOfWeekAsVnese[] dowVnese = DayOfWeekAsVnese.values();
	private static final Scanner sc = new Scanner(System.in);
	private static final Calendar currentDate = Calendar.getInstance();
	private static final DayOfWeekAsText[]  dows = DayOfWeekAsText.values();
	
 	private DateUtils() {
	}
	
	public static String getDayOfWeekAsText(Calendar c) {
		return dows[c.get(Calendar.DAY_OF_WEEK)-1].toString();
	}

	public static int[] getActualMaximumCurrentDayOfWeekInMonth(Calendar c) {
		int resCount[] = new int[2]; // index 0 for current index 1 for max
		Calendar c1 = (Calendar) c.clone();
		c1.set(Calendar.DAY_OF_MONTH,1);
		while (true) {
			if (c.get(Calendar.MONTH) != c1.get(Calendar.MONTH))
				break;
			if (c.get(Calendar.DAY_OF_WEEK) == c1.get(Calendar.DAY_OF_WEEK)) {
				if (c.get(Calendar.DAY_OF_MONTH) >= c1.get(Calendar.DAY_OF_MONTH)) {
					resCount[0]++;
				}
				resCount[1]++;
			}
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		return resCount;
	}

	public static int[] getActualMaximumCurrentDayOfWeekInYear(Calendar c) {
		int resCount[] = new int[3]; // index 0 for current index 1 for max
		resCount[2] = c.get(Calendar.YEAR);
		Calendar c1 = Calendar.getInstance();
		c1.set(c.get(Calendar.YEAR), Calendar.JANUARY, 1);
		while (true) {
			if (c.get(Calendar.YEAR) != c1.get(Calendar.YEAR))
				break;
			if (c.get(Calendar.DAY_OF_WEEK) == c1.get(Calendar.DAY_OF_WEEK)) {
				if (c.get(Calendar.DAY_OF_YEAR) >= c1.get(Calendar.DAY_OF_YEAR)) {
					resCount[0]++;
				}
				resCount[1]++;
			}
			c1.add(Calendar.DAY_OF_YEAR, 1);
		}
		return resCount;
	}

	/*
	 * Because ex01 enter start dating date so i need to check whether it exceed current day or not
	 * but in the next, i dont need so i put parameter ex to check and make sure it works properly =))
	 */
	public static Date parseDateFormat(String content, String format,int ex) {
		Date inputDate;
		do {
			System.out.print("Enter " + content + " (" + format + ")" + ": ");
			String inputDayAsString = sc.nextLine();
			DateFormat df = new SimpleDateFormat(format);
			try {
				inputDate = df.parse(inputDayAsString);
				if(ex == 1) {
					if (inputDate.after(currentDate.getTime())) {
						throw new IllegalArgumentException(
								content + " Should Not Exceed Current Time --> " + df.format(currentDate.getTime()));
					}
				}
				break;
			} catch (ParseException e) {
				System.out.println("Invalid Format Date " + "(" + format + ")!");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		return inputDate;
	}

	public static DayOfWeekAsVnese getDayOfWeek(Date date) {
		return dowVnese[createCalendarAsDate(date).get(Calendar.DAY_OF_WEEK) - 1];
	}

	public static Calendar createCalendarAsDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static String getDurationBetween(Date startDate, Date endDate) {
		Calendar startCalendar = createCalendarAsDate(startDate);
		Calendar endCalendar = createCalendarAsDate(endDate);

		int years = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int months = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		int days = endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH);
		int hours = endCalendar.get(Calendar.HOUR_OF_DAY) - startCalendar.get(Calendar.HOUR_OF_DAY);
		int minutes = endCalendar.get(Calendar.MINUTE) - startCalendar.get(Calendar.MINUTE);
		int seconds = endCalendar.get(Calendar.SECOND) - startCalendar.get(Calendar.SECOND);

		if (seconds < 0) {
			minutes--;
			seconds += 60;
		}
		if (minutes < 0) {
			hours--;
			minutes += 60;
		}
		if (hours < 0) {
			days--;
			hours += 24;
		}
		if (days < 0) {
			months--;
			days += startCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		if (months < 0) {
			years--;
			months += 12;
		}
		return optional(years, "year") + optional(months, "month") + optional(days, "day") + optional(hours, "hour")
				+ optional(minutes, "minute") + optional(seconds, "second");
	}

	public static String optional(int value, String unit) {
		if (value > 1) {
			unit += 's';
		}
		return value > 0 ? (value + " " + unit + " ") : "";
	}

}

package ex03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import enu.custom.DayOfWeek;
import exception.custom.DateValidator;

public class PracticeDay {
	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static Calendar calendar = Calendar.getInstance();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		getTimeNowInTimeZone();
		getEndDateInMonthNow();
		getStartEndDayThisWeek();
		getDayInWeekInYear();
		getDayAfter20Day();
		getDayInMyLife();
	}
	public static void getTimeNowInTimeZone() {
        Locale locale = Locale.CANADA;
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Calendar calend = Calendar.getInstance(timeZone, locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        sdf.setTimeZone(timeZone);
        String currentTime = sdf.format(calend.getTime());
        System.out.println("Current time: " + currentTime);
	}
	public static void getEndDateInMonthNow() {
		Calendar c = (Calendar)calendar.clone();
		c.set(Calendar.DATE, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("End of the Month : " + df.format(c.getTime()));
	}
	public static void getStartEndDayThisWeek() {
		Calendar c = (Calendar)calendar.clone();
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println("The start day in this week : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("The end day in this week : " + (c.get(Calendar.DAY_OF_MONTH)+7));
	}
	public static void getDayInWeekInYear() {
		Calendar c = (Calendar)calendar.clone();
		System.out.println("The end day in this week : " + c.get(Calendar.WEEK_OF_YEAR));
	}
	public static void getDayAfter20Day() {
		Calendar c = (Calendar)calendar.clone();
		c.add(Calendar.DAY_OF_MONTH, 20);
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("Day after 20 day : " + c.get(Calendar.DAY_OF_MONTH) +" "+ dowAsEnum[dowAsInt-1]);
	}
	public static void getDayInMyLife() {
		String script = "\nPlease enter your day of born : ";
		Date doB = enterDate(script);
		Calendar c = (Calendar)calendar.clone();
		if(doB != null)
		{
			c.setTime(doB);
		}
		Calendar timeNow = (Calendar)calendar.clone();
		long milliseconds = timeNow.getTimeInMillis()-c.getTimeInMillis() ;
		int day = (int) (milliseconds / (1000L * 60 * 60 * 24));
        
        System.out.println("Số ngày từ năm 2022 đến nay là: " + day);
	}
	public static Date enterDate(String script) {
		DateValidator dateValidator = new DateValidator();
		Date dateF = new Date();
		while(true) {
			System.out.print(script);
			String date= sc.nextLine();
			try {
				if(dateValidator.isValidDate(date)) {
					dateF = df.parse(date);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dateF;
	}
}

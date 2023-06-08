package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import enu.custom.DayOfMonth;
import enu.custom.DayOfWeek;
import exception.custom.DateValidator;
import exception.custom.NumberValidator;

public class WeekdayCalculator {
	static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner scanner = new Scanner(System.in);
	static Calendar c = null;
	static String date = null;
	static String month = null;
	static String year = null;
	public static void main(String[] args) {
		handleCalculator();
		getDayInYear();
		getMondayNumberInThisYear();
		getMondayNumberInThisMonth();
		getMaxDayInYear();
		getMaxDayInMonth();
	}
	
	private static void getMaxDayInMonth() {
		int domAsInt = c.get(Calendar.MONTH);
		DayOfMonth[] domAsEnum = DayOfMonth.values();
		System.out.println(domAsEnum[domAsInt]+" " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}

	public static void handleCalculator() {
		DateValidator dateValidator = new DateValidator();
		String dateT = "";
		Date dateF;
		while(true) {
			System.out.print("\nEnter date : ");
			date = enterElement();
			System.out.print("\nEnter month : ");
			month = enterElement();
			System.out.print("\nEnter year : ");
			year = enterElement();
			dateT = date+"/"+month+"/"+year;
			try {
				if(dateValidator.isValidDate(dateT)) {
					dateF = df.parse(dateT);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n Please enter dd/MM/yyyy valid ! ");
		}
		c = Calendar.getInstance();
		c.setTime(dateF);
		System.out.println(df.format(c.getTime()));
	}
	private static void getMaxDayInYear() {
		System.out.println("Year " + year+ " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
	}

	private static void getMondayNumberInThisYear() {
		Calendar startC = (Calendar)c.clone();
		Calendar endC = (Calendar)c.clone();
		startC.set(Calendar.MONTH, 0);
		startC.set(Calendar.DAY_OF_MONTH, 1);
		endC.set(Calendar.MONTH, 11);
		endC.set(Calendar.DAY_OF_MONTH, endC.getActualMaximum(Calendar.DAY_OF_MONTH));
		endC.add(Calendar.DAY_OF_MONTH, 1);
		int countMon = 0;
		int numberMon = 0;
		while(startC.before(endC)) {
			int dow = startC.get(Calendar.DAY_OF_WEEK);
			if( dow == c.get(Calendar.DAY_OF_WEEK)) {
				countMon ++;
				startC.add(Calendar.DAY_OF_MONTH, 7);
			}
			else {
				startC.add(Calendar.DAY_OF_MONTH, 1);
			}
			if(startC.get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR))
				numberMon = countMon+1;
		}
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("It is "+ dowAsEnum[dowAsInt-1] +" number "+numberMon+" out of " + countMon + " in "+ year);
	}
	
	private static void getMondayNumberInThisMonth() {
		Calendar startC = (Calendar)c.clone();
		Calendar endC = (Calendar)c.clone();
		startC.set(Calendar.DAY_OF_MONTH, 1);
		endC.set(Calendar.DAY_OF_MONTH, endC.getActualMaximum(Calendar.DAY_OF_MONTH));
		endC.add(Calendar.DAY_OF_MONTH, 1);
		int countMon = 0;
		int numberMon = 0;
		while(startC.before(endC)) {
			int dow = startC.get(Calendar.DAY_OF_WEEK);
			if( dow == c.get(Calendar.DAY_OF_WEEK)) {
				countMon ++;
				startC.add(Calendar.DAY_OF_MONTH, 7);
			}
			else {
				startC.add(Calendar.DAY_OF_MONTH, 1);
			}
			if(startC.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH))
				numberMon = countMon+1;
		}
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		int domAsInt = c.get(Calendar.MONTH);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		DayOfMonth[] domAsEnum = DayOfMonth.values();
		System.out.println("It is "+ dowAsEnum[dowAsInt-1] +" number "+numberMon+" out of " + countMon + " in " +domAsEnum[domAsInt]+" " + year);
	}

	public static void getDayInYear() {
		Calendar calendar = (Calendar)c.clone();
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		int maxDoY = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		int daysLeft = maxDoY - doy;
		System.out.println("It is day number " + doy +" of the year, "+daysLeft + " days left");
	}
	public static String enterElement() {
		String element;
		while(true) {
			element = scanner.nextLine();
			NumberValidator numberValidator = new NumberValidator();
			try {
				if(numberValidator.isNumber(element)) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.print("\nPlease Re enter : ");
			}
		}
		return element;
	}
	
}

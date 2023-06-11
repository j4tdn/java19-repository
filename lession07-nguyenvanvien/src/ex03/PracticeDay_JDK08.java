package ex03;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.Scanner;

import exception.custom.DateValidator;

public class PracticeDay_JDK08 {
	public static DateTimeFormatter dFormatter = null;
	public static Scanner sc = new Scanner(System.in);
	private static LocalDateTime lcDateTime = LocalDateTime.now();
	public static void main(String[] args) {
		getTimeNowInTimeZone();
		getEndDateInMonthNow();
		getStartEndDayThisWeek();
		getDayInWeekInYear();
		getDayAfter20Day();
		getDayInMyLife();
	}
	public static void getTimeNowInTimeZone() {
		dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		ZoneId zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        dFormatter = dFormatter.withZone(zoneId);
        System.out.println("Current time: " + LocalDateTime.now().format(dFormatter));
	}
	public static void getEndDateInMonthNow() {
		LocalDateTime lcDateT = LocalDateTime.from(lcDateTime);
		dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		lcDateT = lcDateT.withDayOfMonth(lcDateT.toLocalDate().lengthOfMonth());
		System.out.println("End of the Month : " + lcDateT.format(dFormatter));
	}
	public static void getStartEndDayThisWeek() {
		LocalDateTime lcDateT = LocalDateTime.from(lcDateTime);
		lcDateT = lcDateT.with(DayOfWeek.MONDAY);
		System.out.println("The start day in this week : " + lcDateT.format(dFormatter));
		System.out.println("The end day in this week : " + lcDateT.plusDays(6).format(dFormatter));
		
	}
	public static void getDayInWeekInYear() {
		LocalDateTime lcDateT = LocalDateTime.from(lcDateTime);
		System.out.println("The week in year : " + lcDateT.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
	}
	public static void getDayAfter20Day() {
		LocalDateTime lcDateT = LocalDateTime.from(lcDateTime);
		System.out.println("Day after 20 day : " + lcDateT.plusDays(20).format(dFormatter));
	}
	public static void getDayInMyLife() {
		LocalDate lcDate= enterDate();
		
		Period period = Period.between(lcDate, lcDateTime.toLocalDate());
		System.out.println("Bạn đã sống được : " +
         optional(period.getYears(), "Years ") +
         optional(period.getMonths(), "Months ") +
         optional(period.getDays(), "Days ")); 
	}
	public static String optional(long value, String unit) {
    	value = Math.abs(value);
        return value != 0 ? value + " " + unit : "";
    }
	private static LocalDate enterDate() {
		DateValidator dateValidator = new DateValidator();
		LocalDate lcDate = LocalDateTime.from(lcDateTime).toLocalDate();
		System.out.print("\n\nPlease enter date (dd/MM/yyyy) : ");
		while (true) {
			String date = sc.nextLine();
			try {
				if (dateValidator.isValidDate(date)) {
					lcDate = LocalDate.parse(date, dFormatter);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.print("\n\nPlease ReEnter date (dd/MM/yyyy) : ");
			}
		}
		return lcDate;
	}
}

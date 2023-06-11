package ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exception.custom.DateValidator;

public class WeekdayCalculator_JDK08 {
	public static DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static Scanner scanner = new Scanner(System.in);
	static LocalDate lcDate = null;

	public static void main(String[] args) {
		handleCalculator();
		getDayInYear();
		getMondayNumberInThisYear();
		getMondayNumberInThisMonth();
		getMaxDayInYear();
		getMaxDayInMonth();
	}

	private static void handleCalculator() {
		DateValidator dateValidator = new DateValidator();
		System.out.print("\n\nPlease enter date (dd/MM/yyyy) : ");
		while (true) {
			String date = scanner.nextLine();
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
		System.out.println("Date Entered : " + lcDate.format(dFormatter));
	}

	private static void getDayInYear() {
		int doy = lcDate.getDayOfYear();
		int maxDoY = lcDate.lengthOfYear();
		int daysLeft = maxDoY - doy;
		System.out.println("It is day number " + doy + " of the year, " + daysLeft + " days left");
	}
	
	private static int countNumber = 0;
	private static int totalCount = 0;

	private static void getMondayNumberInThisYear() {
		LocalDate lDStart = lcDate.withMonth(1).withDayOfMonth(1);
		LocalDate lDEnd = lcDate.withYear(lcDate.getYear() + 1).withMonth(1).withDayOfMonth(1);
		handleCountDoW(lDStart, lDEnd);

		System.out.println("It is " + lcDate.getDayOfWeek() + " number " + countNumber + " out of " + totalCount + " in "
				+ lcDate.getYear());
	}

	private static void getMondayNumberInThisMonth() {
		LocalDate lDStart = lcDate.withDayOfMonth(1);
		LocalDate lDEnd = lDStart.plusMonths(1);
		handleCountDoW(lDStart, lDEnd);

		System.out.println("It is "+ lcDate.getDayOfWeek() +" number "+countNumber+" out of " + totalCount + " in " +lcDate.getMonth()+" " + lcDate.getYear());
	}
	private static void handleCountDoW(LocalDate lDStart, LocalDate lDEnd) {
		countNumber = 0;
		totalCount = 0;
		while (lDStart.isBefore(lDEnd)) {
			int dow = lDStart.getDayOfWeek().getValue();
			if (dow == lcDate.getDayOfWeek().getValue()) {
				totalCount++;
				lDStart = lDStart.plusDays(7);
			} else {
				lDStart = lDStart.plusDays(1);
			}
			if (lDStart.getDayOfYear() == lcDate.getDayOfYear())
				countNumber = totalCount + 1;
		}
	}

	private static void getMaxDayInYear() {
		System.out.println("Year " + lcDate.getYear()+ " has " + lcDate.lengthOfYear()+ " days");
	}

	private static void getMaxDayInMonth() {
		System.out.println(lcDate.getMonth()+" " + lcDate.getYear() + " has " + lcDate.lengthOfMonth() + " days");
	}

}

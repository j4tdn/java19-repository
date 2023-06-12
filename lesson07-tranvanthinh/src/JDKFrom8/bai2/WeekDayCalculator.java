package JDKFrom8.bai2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class WeekDayCalculator {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator();
	}

	public static LocalDate inputLDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ldate = null;
		String startDate;
		do {
			try {
				System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				ldate = LocalDate.parse(startDate, df);
				break;
			} catch (Exception e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);
		return ldate;
	}

	private static int getCountOfDayOfWeekInMonth(DayOfWeek dow, LocalDate ldate) {
		LocalDate startOfMonth = LocalDate.of(ldate.getYear(), ldate.getMonth(), 1);
		LocalDate first = startOfMonth.with(TemporalAdjusters.firstInMonth(dow));
		LocalDate last = startOfMonth.with(TemporalAdjusters.lastInMonth(dow));
		return (last.getDayOfMonth() - first.getDayOfMonth()) / 7 + 1;
	}

	public static void Calculator() {
		LocalDate ldate = LocalDate.of(1995, 9, 25);

		System.out.println(ldate.getDayOfMonth() + " " + ldate.getMonth() + " " + ldate.getYear() +
							" is a " + ldate.getDayOfWeek());

		System.out.println("It is day number " + ldate.getDayOfYear() + " of the year, " +
							(ldate.lengthOfYear() - ldate.getDayOfYear()) + " days left");

		boolean is53weekYear = LocalDate.of(ldate.getYear(), 1, 1).getDayOfWeek() == DayOfWeek.THURSDAY ||
							   LocalDate.of(ldate.getYear(), 12, 31).getDayOfWeek() == DayOfWeek.THURSDAY;
		System.out.println("It is " + ldate.getDayOfWeek() + " number " + ldate.get(ChronoField.ALIGNED_WEEK_OF_YEAR)
						 + " out of " + (is53weekYear ? 53 : 52));

		System.out.println("It is " + ldate.getDayOfWeek() + " number " + ldate.get(ChronoField.ALIGNED_WEEK_OF_MONTH) +
						   " out of " + getCountOfDayOfWeekInMonth(ldate.getDayOfWeek(), ldate)+
						   " in " + ldate.getMonth() + " " + ldate.getYear());
		System.out.println("Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + "days" );
	
		System.out.println(ldate.getMonth() +  " " + ldate.getYear() + " has " + ldate.lengthOfMonth() + " days" );
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

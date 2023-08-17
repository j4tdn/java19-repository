package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import javax.management.RuntimeErrorException;

/**
 * LocalDate: d/M/y
 * DateTimeFormatter
 */
public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// String: format(ldate), LocalDate: parse(string)
		
		LocalDate past = LocalDate.of(2022, 2, 1); // 01/02/2022
		System.out.println("past: " + past);
		
		System.out.println("\n=================\n");
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(2)
					 .withMonth(2)
		             .with(ChronoField.YEAR, 2024)
		             .plusYears(1); // 02/03/2023
		System.out.println("ldate: " + ldate);
		System.out.println("ldate formatted: " + df.format(ldate));
		System.out.println("ldate year: " + ldate.getYear());
		
		System.out.println("\n=================\n");
		// Period: Tìm hiệu giữa 2 mốc thời gian(LocalDate)
		
		if (ldate.isBefore(past)) {
			throw new RuntimeException();
		}
		
		Period period = Period.between(past, ldate);
		System.out.println("period: " + period);
		System.out.println("period toString: \n" 
					+ optional(period.getYears() , "year")
					+ optional(period.getMonths(), "month")
					+ optional(period.getDays()  , "day")
				);
	}
	
	private static String optional(int value, String unit) {
		String optS = value > 1 ? "s" : "";
		return value == 0 ? "" : value + " " + unit + optS + "\n";
	}
}

package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import javax.management.RuntimeErrorException;

/**
 * LocalDate : d/M/y
 * DateTimeFormatter
 * 
 * */


public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// String : format(ldate), LocalDate : parse(String);
		
		LocalDate past = LocalDate.of(2018,10,4);
		System.out.println("past : " + past);
		
		System.out.println("==================");
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(22)
						.with(ChronoField.YEAR, 2022);
		
		System.out.println("ldate : " + ldate);
		System.out.println("ldate : " + df.format(ldate));
		
		System.out.println(ldate.get(ChronoField.DAY_OF_WEEK));
		
		// Period : Tìm hiệu giữa 2 mốc thời gian(LocalDate)
		
		if(ldate.isBefore(past))
			throw new RuntimeException();
		
		Period period = Period.between(past, ldate);
		
		System.out.println("period : " + period);
		System.out.println("period toString: " 
					+ optional(period.getYears(), "year")
					+ optional(period.getMonths(), "month")
					+ optional(period.getDays(), "day")
					
				);
	}
	
	private static String optional(int value, String unit) {
		String opts = value > 1 ? "s" : "";
		return value == 0 ? " " : value + " " + unit+"\n";
	}
}

package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
	public static void main(String[] args) throws Exception {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate past = LocalDate.of(2018,10,4);
		System.out.println("past: " + past);
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(22).with(ChronoField.YEAR, 2022).plusYears(1);
		System.out.println("ldate: " + ldate);
		
		// Period: tìm hiệu giữa 2 mốc thời gian(LocalDate)
		
		if(ldate.isBefore(past)) {
			throw new Exception();
		}
		
		Period period = Period.between(past, ldate);
		System.out.println("period: " + period);
		System.out.println("period --> " + optional(period.getYears(), "year")
		 + optional(period.getMonths(), "month")
		 + optional(period.getDays(), "day"));

	}
	
	private static String optional(int value, String unit) {
		String s = value > 1 ? "s" : "";
		return value == 0 ? "" : value + " " + unit + s + "\n";
	}
}

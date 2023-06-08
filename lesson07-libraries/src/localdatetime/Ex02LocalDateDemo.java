package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * Localdate: d/M/y
 * 
 * DateTimeFormatter
 * @author Admin
 *
 */
public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
//		String: format(ldate),
//		LocalDate: parse(string)
		
		LocalDate past = LocalDate.of(2018,10,4);
		System.out.println("past: " + past);
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(22)		//phải gán lại do hàm with tạo obj mới
				.with(ChronoField.YEAR, 2022)
				.plusYears(1); 
		System.out.println("ldate"+ ldate);
		
		System.out.println("ldate formatted: " + df.format(ldate));
		
		System.out.println("ldate year: " + ldate.getYear());
		
		//Period: Tìm hiệu giữa 2 mốc thời gian (Localdate)
		
		if (ldate.isBefore(past)) {
			throw new RuntimeException();
		}
		
		Period period = Period.between(past, ldate);
		System.out.println("period: " + period);
		System.out.println("period toString: " + optional(period.getYears(), " year")
		+ optional(period.getMonths(), " month")
		+ optional(period.getDays(), " day"));
	}
	
	private static String optional(int value, String unit) {
		String optS = value > 1 ? "s" : "";
		return value == 0 ? "" : value + "" + unit + optS +"\n";
	}
	
	
}

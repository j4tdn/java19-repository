package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
	
	/**
	 * LocalDate: d/M/y
	 * @param args
	 */
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate past = LocalDate.of(2018, 10, 4);
		System.out.println("past: " + past);
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(22)
					 .with(ChronoField.YEAR, 2022)
					 .plusYears(1);
		System.out.println("ldate " + ldate);
		
		System.out.println("ldate formatter: " + df.format(ldate));
		System.out.println("ldate year: " + ldate.getYear());
		
		System.out.println("=============");
		// Period: Tìm hiệu giữa 2 mốc thời gian(LocalDate)
		
		if(ldate.isBefore(past)) {
			throw new RuntimeException();
		}
		Period period = Period.between(past, ldate);
		System.out.println("period: " + period); //dung .get... ddeer lay ngay thang nam
		System.out.println("period toString: \n"
				+ optional(period.getYears(), "year")
				+ optional(period.getMonths(), "month")
				+ optional(period.getDays(), "day"));
	}
	private static String optional(int value, String unit) {
		String optS = value > 0 ? "" : "s";
		return value == 0 ? "" : value + " " + unit + optS + "\n";
	}
}

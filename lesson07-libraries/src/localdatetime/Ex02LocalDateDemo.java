package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
	public static void main(String[] args) {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate past = LocalDate.of(2018, 10, 4);
		System.out.println("past --> " + past);

		System.out.println("============================");

		LocalDate ldate = LocalDate.now();
		ldate = ldate.withDayOfMonth(22).with(ChronoField.YEAR, 2022);

		System.out.println("ldate --> " + ldate);
		System.out.println("ldate formatter --> " + df.format(ldate));
		System.out.println("getDayOfMonth --> " + ldate.get(ChronoField.DAY_OF_MONTH));

		System.out.println("============================");
		// Period: Tìm hiệu giữa 2 mốc thời gian(LocalD)
	
		if(ldate.isBefore(past)) {
			throw new RuntimeException();
		}
		
		Period period = Period.between(past, ldate);
		System.out.println("period --> " + optional(period.getYears(), "year")
										 + optional(period.getMonths(), "month")
										 + optional(period.getDays(), "day"));
	}
	
	private static String optional(int quantity, String unit) {
		String optS = quantity > 1 ? "s" : "";
		return quantity == 0 ? "" : quantity + " " + unit + optS + " ";
	}
}

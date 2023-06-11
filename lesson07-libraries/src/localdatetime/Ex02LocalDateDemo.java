package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		LocalDate lDay = LocalDate.now();

		LocalDate past = LocalDate.of(2018, 10, 4);
		System.out.println("past: " + past);
		System.out.println("lday: " + lDay);
		lDay = lDay.withDayOfMonth(22).with(ChronoField.YEAR, 2022);
		System.out.println("lday: " + lDay);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted: " + df.format(lDay));
		if (lDay.isBefore(past)) {
			throw new RuntimeException();
		}
		Period period = Period.between(past, lDay);
		System.out.println(period);
	}
	private static String optional(int value, String unit) {
		String optS
	}
}

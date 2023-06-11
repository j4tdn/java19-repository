package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate past = LocalDate.of(2022, 2, 1);
		System.out.println("past: " + past );
		
		LocalDate ldate = LocalDate.now();//only d/M/y
		ldate = ldate.withDayOfMonth(2)
						.withMonth(3)
						.with(ChronoField.YEAR, 2023)	
						.plusYears(1);
		System.out.println("ldate: " + ldate );
		
		System.out.println("ldate year -->" + ldate.getYear() );
		
		//period: tim hieu giua 2 moc thoi gian ()LocalDate
		
		if (ldate.isBefore(past)) {
			throw new RuntimeException();
		}
		Period period = Period.between(past, ldate);
		System.out.println("period: " + period);
		System.out.println("period toString: \n" 
									+ optional(period.getYears(), "year") 
									+ optional(period.getMonths(), "month")
									+ optional(period.getDays(), "day"));
	}
	
		private static String optional(int value, String unit) {
			String optS = value > 1 ? "s" : "";
			return value == 0? "" : value + " " + unit + optS + "\n";
		}
}

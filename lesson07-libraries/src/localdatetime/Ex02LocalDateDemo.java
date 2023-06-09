package localdatetime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;




public class Ex02LocalDateDemo {
public static void main(String[] args) {
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd//MM//yyyy");
	
	
	
	LocalDate past = LocalDate.of(2018, 10, 4);
	System.out.println("past: " + past);
	
	System.out.println("\n===================\n");
	
	LocalDate ldate = LocalDate.now();
	ldate = ldate.withDayOfMonth(22)
				 .with(ChronoField.YEAR, 2022);
				 
				 
		
	System.out.println("ldate: " + ldate);
	System.out.println("ldate formatted: " + df.format(ldate));
	System.out.println("ldate year: " + ldate.getYear());
	
	if(ldate.isBefore(past)) {
		throw new RuntimeException();
	}
	
	Duration duration = Duration.between(past, ldate);
	System.out.println("period: " + duration);
	System.out.println("period toString: \n " 
			+ optional(duration.toHoursPart(), "hour")
			+ optional(duration.toDaysPart(), "day"));
			//+ optional(duration.getDays(), "day"));
			
}

private static String optional(Number value, String unit) {
	String opts = value.longValue() > 1 ? "s" : "";
	return value.longValue() == 0 ? "" : value + " " + unit + opts + "\n";
}
}

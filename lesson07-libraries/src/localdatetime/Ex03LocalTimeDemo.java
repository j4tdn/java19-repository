package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(16,10,20);
		LocalTime now = LocalTime.now();
		
		System.out.println("start: " + start);
		System.out.println("now: " + now);
		
		Duration duration = Duration.between(start, now);
		System.out.println("duration: " + duration);
		System.out.println("period --> " + optional(duration.toHoursPart(), "year")
		 + optional(duration.toMinutesPart(), "month")
		 + optional(duration.toSecondsPart(), "day"));
	}

	private static String optional(Number value, String unit) {
		String s = value.longValue() > 1 ? "s" : "";
		return value.longValue() == 0 ? "" : value + " " + unit + s + "\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

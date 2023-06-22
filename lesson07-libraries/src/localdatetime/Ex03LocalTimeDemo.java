package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(16, 10, 20);
		LocalTime now = LocalTime.now();
		
		System.out.println("start: " + start);
		System.out.println("now: " + now);
		
		System.out.println("\n===============\n");
		
		Duration duration = Duration.between(start, now);
		System.out.println("duration: " + duration);
		System.out.println("duration toString: \n" 
				+ optional(duration.toHoursPart()  , "hour")
				+ optional(duration.toMinutesPart(), "minute")
				+ optional(duration.toSecondsPart(), "second")
			);
	}
	
	private static String optional(Number value, String unit) {
		String optS = value.longValue() > 1 ? "s" : "";
		return value.longValue() == 0 ? "" : value + " " + unit + optS + "\n";
	}
}
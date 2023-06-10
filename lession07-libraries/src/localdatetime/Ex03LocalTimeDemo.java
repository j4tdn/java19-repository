package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(16,10,20);
		LocalTime now = LocalTime.now();
		
		System.out.println("start : " + start);
		System.out.println("now : " + now);
		
		System.out.println("======================");
		
		Duration duration = Duration.between(start, now);
		System.out.println("duration : " + duration);
		System.out.println("period toString: " 
				+ optional(duration.toHoursPart(), "hours")
				+ optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds")
			);
		}

		private static String optional(Number value, String unit) {
			String opts = value.longValue() > 1 ? "s" : "";
			return value.longValue() == 0 ? " " : value + " " + unit+"\n";
		}
}

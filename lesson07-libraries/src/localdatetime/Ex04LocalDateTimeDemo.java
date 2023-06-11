package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime a = LocalDateTime.of(2023, 06, 07, 10, 20, 10);
		LocalDateTime ldatetime = LocalDateTime.now(); //of
		
		// LocalDateTime = LocalDate + LocalTime
		LocalDate ldate = ldatetime.toLocalDate()
				.withDayOfYear(220);
		LocalTime ltime = ldatetime.toLocalTime()
				.plusHours(2);
		
		LocalDateTime lnewDateTime = ldate.atTime(ltime);
		System.out.println(lnewDateTime);
		Duration duration = Duration.between(a, lnewDateTime);
		System.out.println(duration.toHours());
	}
}

package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime ldatetime = LocalDateTime.now(); // of
		
		// LocalDateTime = LocalDate + LocalTime
		LocalDate ldate = ldatetime.toLocalDate()
							.withDayOfYear(220);
		
		LocalTime ltime = ldatetime.toLocalTime()
							.plusHours(2);
		
		LocalDateTime lnewDateTime = ldate.atTime(ltime);
		System.out.println("lnewDateTime --> " + lnewDateTime);
		
		// Tìm hiệu giữa 2 mốc thời gian (LocalDateTime)
	}
}
package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// LocalDateTime = LocalDate + LocalTime
		
		LocalDate localDate =localDateTime.toLocalDate();
		LocalTime localTime =localDateTime.toLocalTime();
		
		LocalDateTime localDateTime2 = localDate.atTime(localTime);
		
		
		// Tìm hiệu giữu 2 mốc thời gian (LocalDateTime)
	}
}

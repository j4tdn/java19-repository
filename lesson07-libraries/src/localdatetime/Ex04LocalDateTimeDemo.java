package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//LocalDateTime = LocalDate+ LocalTime
		LocalDate localDate = localDateTime.toLocalDate()
								.withDayOfYear(220);
								
		
		
		LocalTime localTime = localDateTime.toLocalTime()
								.plusHours(2);
		
		LocalDateTime localDateTime2 = localDate.atTime(localTime);
		System.out.println("localDateTime2 -->" + localDateTime2);
		
//		Tim hieu giua 2 moc thoi gian (LocalDateTime): co the am
		
	}
}

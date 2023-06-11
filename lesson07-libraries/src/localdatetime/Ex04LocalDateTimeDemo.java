package localdatetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTimeDemo {
      public static void main(String[] args) {
		LocalDateTime ldatetime = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		// LocalDateTime = LocalDate + LocalTime
		LocalDate ldate = ldatetime.toLocalDate()
				           .withDayOfYear(220);
		System.out.println("ldate: " + ldate);
		
		LocalTime ltime = ldatetime.toLocalTime().plusHours(2);
		
		System.out.println("ltime: " + ltime);
		
		LocalDateTime lnewDateTime = ldate.atTime(ltime);
		
		System.out.println("lnewDateTime: " + df.format(lnewDateTime));
		
	
		// Tim hieu giua 2 moc thoi gian (LocalDateTime)
	}
}

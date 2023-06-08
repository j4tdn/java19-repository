package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime ldatetime = LocalDateTime.now();
		
		//LocalDateTime = LocalDate + LocalTime
		LocalDate ldate = ldatetime.toLocalDate()
				.withDayOfYear(220);
		LocalTime ltime = ldatetime.toLocalTime()
				.plusHours(2);
		
		LocalDateTime lnewDateTime = ldate.atTime(ltime);
		
		System.out.println("lnewdatetime --> " + lnewDateTime);
		
		//Tìm hiệu giữa 2 mốc thời gian LocalDateTime:
		//Tách ra localDate & LocalTime
		//Period OK but Duration can be negative
		
		//phind
		//Stackoverflow
		
	}

}

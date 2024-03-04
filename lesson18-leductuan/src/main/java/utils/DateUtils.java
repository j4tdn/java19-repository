package utils;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateUtils {

	private DateUtils() {
	}

	public static java.sql.Date toSDate(LocalDate ldate) {
		return java.sql.Date.valueOf(ldate);
	}
	
	public static LocalDateTime toLDTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}

}
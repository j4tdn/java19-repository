package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {
	public DateUtils() {
	}
	
	public static java.sql.Date toSqlDate(LocalDate lDate){
		Objects.requireNonNull(lDate, "lDate should not be null");
		return java.sql.Date.valueOf(lDate);
	}
}

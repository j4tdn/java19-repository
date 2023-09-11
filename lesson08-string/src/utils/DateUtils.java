package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss S");
	
	private DateUtils() {
	}
	
	public static String currentTime() {
		Date date = new Date();
		return df.format(date);
	}
}

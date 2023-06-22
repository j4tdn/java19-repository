package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public DateUtils() {
	}
	
	public static String currenTime() {
		Date date = new Date();
	}
}

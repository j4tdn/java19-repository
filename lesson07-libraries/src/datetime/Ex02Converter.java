package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02Converter {
	public static void main(String[] args) {
		// ngay thang nam

		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		String s = "06.04.2023";
		Date converterDate = null;
		try {
			converterDate = (Date) df.parse(s);
			System.out.println("converterDate --> " + converterDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(converterDate != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(converterDate);
			System.out.println("c -->" + c);
		}

	}
}

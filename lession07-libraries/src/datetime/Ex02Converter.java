package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	public static void main(String[] args) {
		// ngày, tháng, nănm
		
		// Calendar --> c.getTime() --> java.util.Date --> df.format(date) --> String
		
		// String --> Date --> Calendar
		
		String s = "06.04.2023";
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date convertedDate = null;
		try {
			convertedDate = df.parse(s);
			System.out.println("convertedDate : " + convertedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(convertedDate != null)
		{
			Calendar c = Calendar.getInstance();
			c.setTime(convertedDate);
			System.out.println("c --> " + c);
		}
		
	}
}

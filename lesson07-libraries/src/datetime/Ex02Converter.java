package datetime;

import java.nio.file.attribute.AclEntry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	public static void main(String[] args) {
		// ngay thang nam
		//calender --> c.getTime() --> java.util.Date --> df.format(date) --> String
		
		//String --> df.parse(s) --> java.util.Date --> calendar
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		String s = "06.04.2023";
		Date convertDate = null;
		try {
			convertDate = df.parse(s);
			System.out.println("convertDate -->" + convertDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (convertDate != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(convertDate);
			System.out.println("c --> " + c);
		}

	}

}

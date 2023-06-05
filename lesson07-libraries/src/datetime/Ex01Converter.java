package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		String s = "06.04.2023";
		Date convertedDate = null;
		try {
			convertedDate = df.parse(s);
			System.out.println("convertedDate: " + convertedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(convertedDate != null) {
			Calendar c = Calendar.getInstance();
			c.setTime(convertedDate);
			System.out.println("c: " + c);
		}

	}

}

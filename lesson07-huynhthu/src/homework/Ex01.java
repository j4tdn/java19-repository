package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
     private static Date lsAsDate;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fell in love day:  ");
		String ldAsString = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			Date ldAsDate = df.parse(ldAsString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar currentDay = Calendar.getInstance();
		Calendar lDay = Calendar.getInstance();
		
		lDay.setTime(lsAsDate);
		
		long milliseconds = currentDay.getTimeInMillis() - lDay.getTimeInMillis();
		long lovedays = milliseconds/(24*60*60*1000);
		
		System.out.println("love days " + lovedays);
			
		
		

	
	}
}

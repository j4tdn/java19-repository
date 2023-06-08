package ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class RelationshipCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Calendar startDareDay = Calendar.getInstance();
	   
		try {
		   System.out.println("Nhap ngay bat dau hen ho: ");
		   String ip = scanner.nextLine();
		   startDareDay.setTime(df.parse(ip));
		   
		
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		
		Calendar endDareDay = Calendar.getInstance();
		System.out.print("Nhap ngay chia tay(neu co): ");
		String ip2 = scanner.nextLine();
		if (!ip2.isEmpty()) {
			try {
				endDareDay.setTime(df.parse(ip2));
			} catch (ParseException e) {
				endDareDay.setTime(new Date());
			}
		}
		int weekDay = startDareDay.get(Calendar.DAY_OF_WEEK);
		DayOfWeek[] weekDayInStartDareDay = DayOfWeek.values();
		System.out.println("weekDayInStartDareDay: " + weekDayInStartDareDay[weekDay-1]);
		
		calculator(startDareDay);
	       
	}
	private static void calculator(Calendar start) {
		long duration = Long.MIN_VALUE;
		Calendar end = Calendar.getInstance();
		duration = end.getTimeInMillis() - start.getTimeInMillis();
		
		
		int seconds = (int) (duration / 1000);
        int minutes = (int) ((duration / (1000 * 60)));
        int hours = (int) ((duration / (1000 * 60 * 60)));
        int days = (int) (duration / (1000 * 60 * 60 * 24));
        int years = (int) (duration / (1000 * 60 * 60 * 24) / 365);
        
        System.out.println("DareMillis " + duration);
        System.out.println("DareSecond: " + seconds);
        System.out.println("DareMinute: " + minutes);
        System.out.println("DareHour: " + hours);
        System.out.println("DareDay: " + days);
        System.out.println("DareYear: " + years);
        
	}
}

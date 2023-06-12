package JDKLessThan8.bai2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import JDKLessThan8.bai1.DateOfWeek;

public class WeekDayCalculator {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Calculator();
	}
	
	//Lấy số các thứ trong năm
	public static Calendar[] getDaysOfWeekOrYear(Calendar c, int dayOfWeek, String weekOrYear) {
		Calendar[] result = new Calendar[60];
		
		Calendar firstDay = (Calendar)c.clone(); // 01.06.2023
		Calendar endDay = (Calendar)c.clone(); // 30.06.2023
		if (weekOrYear.equals("week")) {
			firstDay.set(Calendar.DAY_OF_MONTH , 1);
			endDay.set(Calendar.DAY_OF_MONTH , c.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);

		}
		else {
			firstDay.set(Calendar.DAY_OF_MONTH , 1);
			firstDay.set(Calendar.MONTH , 0);
			endDay.set(Calendar.MONTH , 11);
			endDay.set(Calendar.DAY_OF_MONTH , 31);
			endDay.add(Calendar.DAY_OF_MONTH, 1);		
		}
		
		Calendar running = (Calendar)firstDay.clone(); // H1
		
		int counter = 0;
		while(running.before(endDay)) {
			if (running.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
				result[counter++] = (Calendar)running.clone();
				running.add(Calendar.WEEK_OF_MONTH, 1);
			} else {
				running.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	
	public static int indexOfDay( Calendar[] dayOf, Calendar c1) {
		int index = 1;
		for(Calendar c : dayOf) {
			if(c.compareTo(c1) == 0) {
				return index;
			}
			index++;
		}
		return 0;
	}
	
	public static void Calculator() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedStartDate = null;
		String startDate;
		do {
			try {
				System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				convertedStartDate = df.parse(startDate);
				break;
			} catch (ParseException e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);

		Calendar c = Calendar.getInstance();
		c.setTime(convertedStartDate);
		Month[] monthAsEnum = Month.values();
		DateOfWeek[] dowAsEnum = DateOfWeek.values();
		System.out.println(c.get(Calendar.DATE) + " " +
						   monthAsEnum[c.get(Calendar.MONTH)] + " " + 
				           c.get(Calendar.YEAR) + " is a " +
				           dowAsEnum[c.get(Calendar.DAY_OF_WEEK) -1]);
		
		
		System.out.println("Additional facts:");
		
		System.out.println("- It is a day number " + 
							c.get(Calendar.DAY_OF_YEAR) + " of the year " + 
							(c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR)) + " days left");
		
		Calendar[] dayOfyears = getDaysOfWeekOrYear(c, c.get(Calendar.DAY_OF_WEEK), "year");
		System.out.println("- It is " + dowAsEnum[c.get(Calendar.DAY_OF_WEEK) -1] + 
							" number " + indexOfDay(dayOfyears, c)+
							" out of " + dayOfyears.length +
							" in " + c.get(Calendar.YEAR));
		
		Calendar[] dayOfWeeks = getDaysOfWeekOrYear(c, c.get(Calendar.DAY_OF_WEEK), "week");
		System.out.println("- It is " + dowAsEnum[c.get(Calendar.DAY_OF_WEEK) -1] + 
				" number " + indexOfDay(dayOfWeeks, c)+
				" out of " + dayOfWeeks.length +
				" in " + monthAsEnum[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR));
		
		System.out.println("- Year " + c.get(Calendar.YEAR) +
						   " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println("- " + monthAsEnum[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) +
				   " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");

	}
}

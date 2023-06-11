package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		calcReleasedDay();
		calcReleasedDayJava8();
	}
	
	private static void calcReleasedDay() {
		Calendar startDay = Calendar.getInstance();
		startDay.set(2022, startDay.JUNE, 07);
		
		Calendar releasedDay = (Calendar)startDay.clone();
		
		int countWorkDays = 0;
		while(true) {
			if(releasedDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
					releasedDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				releasedDay.add(Calendar.DAY_OF_YEAR, 1);
			}
			else {
				countWorkDays++;
				if(countWorkDays == 110) {
					break;
				}
				releasedDay.add(Calendar.DAY_OF_YEAR, 1);
			}
	
		}
		System.out.println("released day: " + releasedDay.getTime());
	}
	
	private static void calcReleasedDayJava8() {
		
		LocalDate releasedDay = LocalDate.of(2022, Month.JUNE, 07);
		
		int countWorkDays = 0;
		while(true) {
			if(releasedDay.getDayOfWeek() == DayOfWeek.SATURDAY || 
					releasedDay.getDayOfWeek() == DayOfWeek.SUNDAY) {
				releasedDay = releasedDay.plusDays(1);
			}
			else {
				countWorkDays++;
				if(countWorkDays == 110) {
					break;
				}
				releasedDay = releasedDay.plusDays(1);
			}
	
		}
		System.out.println("released day: " + releasedDay);

	}
}

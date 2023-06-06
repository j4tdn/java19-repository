package ex04;

import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		calcReleasedDay();
	}
	
	private static void calcReleasedDay() {
		Calendar startDay = Calendar.getInstance();
		startDay.set(2022, startDay.JUNE, 07);
		
		Calendar releasedDay = (Calendar)startDay.clone();
		
		int countWorkDays = 0;
		while(true) {
			if(releasedDay.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY || 
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
}

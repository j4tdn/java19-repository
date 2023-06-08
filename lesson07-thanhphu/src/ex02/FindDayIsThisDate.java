package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class FindDayIsThisDate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar dayNeedFind = Calendar.getInstance();
		
		try {
			System.out.println("Nhap ngay ban can tim: ");
			String ip = scanner.nextLine();
			dayNeedFind.setTime(df.parse(ip));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		int doyOfDayNeedFind = dayNeedFind.get(Calendar.DAY_OF_YEAR);
		int maxDaysOfYear = dayNeedFind.getActualMaximum(Calendar.DAY_OF_YEAR);
		int daysleft = maxDaysOfYear - doyOfDayNeedFind;
		System.out.println("It is day number "+ doyOfDayNeedFind+ " of the year, "+ daysleft+ " daysleft");
		
		int dow = dayNeedFind.get(Calendar.DAY_OF_WEEK);
		DayOfWeek [] weekDay = DayOfWeek.values();
		DayOfWeek weekDayNeedFind = weekDay[dow - 1];
		
		int woyNeedFind = dayNeedFind.get(Calendar.WEEK_OF_YEAR);
		int maxWeekOfYear = dayNeedFind.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int yearNeedFind = dayNeedFind.get(Calendar.YEAR);
		System.out.println("It is "+ weekDayNeedFind+ " number "+ woyNeedFind+ " out of "+ maxWeekOfYear+ " in "+ yearNeedFind);
		
		int womNeedFind = dayNeedFind.get(Calendar.WEEK_OF_MONTH);
		int maxWeedOfMonth = dayNeedFind.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		int moy = dayNeedFind.get(Calendar.MONTH);
		MonthOfYear [] month = MonthOfYear.values();
		MonthOfYear monthNeedFind = month[moy];
		System.out.println("It is "+ weekDayNeedFind+ " number "+ womNeedFind+ " out of "+ maxWeedOfMonth+ " in "+ monthNeedFind+ " "+ yearNeedFind);
		
		System.out.println("Year "+ yearNeedFind+ " has "+ maxDaysOfYear+ " days");
		
		int maxDayOfMonth = dayNeedFind.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthNeedFind+ " "+ yearNeedFind+ " has "+ maxDayOfMonth+ " days" );
	}
}

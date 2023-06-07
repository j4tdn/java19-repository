package homework;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		System.out.println("now --> " + now());
		System.out.println("last day of month --> " + lastDayOfMonth());
		firstLastDayOfWeek();
		System.out.println("week of year --> " + weekOfYear());
		dateAfterTwentyDays();

	}

	public static String now() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return df.format(Calendar.getInstance().getTime());
	}

	public static String lastDayOfMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return df.format(c.getTime());
	}

	public static void firstLastDayOfWeek() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy");
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		System.out.println("first day of week: " + df.format(c.getTime()));
		c.add(Calendar.DAY_OF_WEEK, 6);
		System.out.println("last day of week: " + df.format(c.getTime()));
	}

	public static int weekOfYear() {
		Calendar c = Calendar.getInstance();
		int woy = c.get(Calendar.WEEK_OF_YEAR);
		return woy;
	}
	public static void dateAfterTwentyDays() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy");
		c.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println("Date after 20 days is: " + df.format(c.getTime()));
	}
	
	public static void livedDaysUntilNow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthday: ");
		String bdAsString = sc.nextLine();
		
		Calendar c = Calendar.getInstance();
		
	}

}

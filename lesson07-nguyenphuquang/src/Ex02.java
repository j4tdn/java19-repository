import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
private static DateFormat weekDay = new SimpleDateFormat("EEEE");
private static DateFormat month = new SimpleDateFormat("LLLL");

	public static void main(String[] args) {
		Date date = null;
		Calendar c = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter dd/MM/yyyy");
		try {
			date = df.parse(ip.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		c.setTime(date);
		System.out.print("It is day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year. ");
		System.out.println((c.getActualMaximum(Calendar.DAY_OF_YEAR) - c.get(Calendar.DAY_OF_YEAR)) + " days left");
		System.out.println("It's the " + weekDay.format(date) + " number " + (int)(c.get(6)/7 + 1) + " out of " + (c.getActualMaximum(Calendar.DAY_OF_YEAR)/7) + " in " + c.get(1) );
		System.out.println("It's the " + weekDay.format(date) + " number " + (int)(c.get(Calendar.DAY_OF_MONTH)/7 + 1) + " out of " + (c.getActualMaximum(Calendar.DAY_OF_MONTH)/7) + " in " + month.format(date) );
		System.out.println("Year " + c.get(1) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days ");
		System.out.println(month.format(date) + " " +  c.get(1) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days ");
		
		
	}

}

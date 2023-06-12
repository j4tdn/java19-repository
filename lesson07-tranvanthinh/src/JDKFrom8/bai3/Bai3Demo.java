package JDKFrom8.bai3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bai3Demo {
	static DateTimeFormatter df;
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(getTimNow(ldt));
		System.out.println(getLastDayOfCurrentMonth(ldt));
		System.out.println(getFirstDayAndLastDayOfCurrentWeek(ldt));
		System.out.println(getCurrentWeekOfDay(ldt));
		System.out.println(getDayAfterNday(ldt, 20));
		System.out.println(getYourDayAlive());
	}
	
	public static String getTimNow(LocalDateTime ldt) {
		df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return "Now: " + df.format(ldt);
	}
	
	public static String getLastDayOfCurrentMonth(LocalDateTime ldt) {
		LocalDate ld = ldt.toLocalDate();
		df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return "Last day of month --> " + df.format(ldt.withDayOfMonth(ld.lengthOfMonth()));
	}
	
	public static String getFirstDayAndLastDayOfCurrentWeek(LocalDateTime ldt) {
		df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate ld = ldt.toLocalDate();
		return "Start day of week --> " + df.format(ld.withDayOfMonth(1)) + "\n" +
				"End day of week --> " + df.format(ld.withDayOfMonth(ld.lengthOfMonth()));
	}
	
	public static String getCurrentWeekOfDay(LocalDateTime ldt) {
		return "Current day is at week --> " + ldt.get(ChronoField.ALIGNED_WEEK_OF_YEAR) ;
	}
	
	public static String getDayAfterNday(LocalDateTime ldt, int days) {
		df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		return "After " + days + " days --> " + df.format(ldt.toLocalDate().plusDays(days));
	}
	
	public static LocalDate inputLDate() {
		Scanner ip = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ldate = null;
		String startDate;
		do {
			try {
				System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				ldate = LocalDate.parse(startDate, df);
				break;
			} catch (Exception e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);
		return ldate;
	}
	
	public static String getYourDayAlive() {
		return "You live " + ChronoUnit.DAYS.between(inputLDate(), LocalDate.now()) + " days";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

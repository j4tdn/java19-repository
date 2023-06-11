package java08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
	private static DateTimeFormatter ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter EEEEddMMyyyy = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy ");
	private static LocalDateTime ldt = LocalDateTime.now();
	public static void main(String[] args) {
		System.out.println("1. " + showDateTime());
		System.out.println("2. " + lastDayOfMonth());
		System.out.println("3. " + limitOfWeek());
		System.out.println("4. " + weekOfYear());
		System.out.println("5. " + after20days());
		System.out.println("6. " + live());
	}

	public static String showDateTime() {
		
		return df.format(ldt);
	}
	
	public static String lastDayOfMonth() {
		return ddMMyyyy.format(ldt.plusDays(ldt.toLocalDate().lengthOfMonth()-ldt.getDayOfMonth()));
	}

	public static String limitOfWeek() {
		int dayOfWeek = ldt.toLocalDate().getDayOfWeek().getValue();
		int gapToEnd = 7 - dayOfWeek;
		return "Start: " + ddMMyyyy.format(ldt.minusDays(dayOfWeek - 1))  
		+ "\nEnd: " + ddMMyyyy.format(ldt.plusDays(gapToEnd));
	}
	public static int weekOfYear() {
		return ldt.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
	}

	public static String after20days() {
		
		return EEEEddMMyyyy.format(ldt.plusDays(20));
	}
	
	public static long live() {
		LocalDate ldate = LocalDate.now();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter dd/MM/yyyy");
		
		String[] input = ip.nextLine().split("/");
		try {
			ldate = ldate.withDayOfMonth(Integer.parseInt(input[0]))
					.withMonth(Integer.parseInt(input[1])).withYear(Integer.parseInt(input[2]));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ldate.until(ldt, ChronoUnit.DAYS);
	}
}

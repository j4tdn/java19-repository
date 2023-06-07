package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhập thời gian hẹn hò của 2 người (dd-MM-yyyy):");
		String firstDateStr = sr.nextLine();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate firstDate = LocalDate.parse(firstDateStr, dateFormatter);
		LocalDateTime firstDateTime = firstDate.atStartOfDay();
		
		System.out.println("Hai người đã chia tay chưa (Yes/No)");
		String farewell = sr.nextLine();
		if (farewell.equalsIgnoreCase("Yes")) {
			System.out.print("Nhập ngày chia tay (dd-MM-yyyy): ");
			String breakupDateStr = sr.nextLine();

			DateTimeFormatter breakupDateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate breakupDate = LocalDate.parse(breakupDateStr, breakupDateFormatter);
			LocalDateTime breakupDateTime = breakupDate.atStartOfDay();

			long years = firstDateTime.until(breakupDateTime, ChronoUnit.YEARS);
			long months = firstDateTime.until(breakupDateTime, ChronoUnit.MONTHS) % 12;
			long days = firstDateTime.until(breakupDateTime, ChronoUnit.DAYS);
			long hours = firstDateTime.until(breakupDateTime, ChronoUnit.HOURS) % 24;
			long minutes = firstDateTime.until(breakupDateTime, ChronoUnit.MINUTES) % 60;
			long seconds = firstDateTime.until(breakupDateTime, ChronoUnit.SECONDS) % 60;

			System.out.println("Ngày hẹn hò đầu tiên là: " + firstDate.getDayOfWeek());
			System.out.println(years + " năm, " + months + " tháng, " + days + " ngày, " + hours + " giờ, "
					+ minutes + " phút, " + seconds + " giây.");
		} else {
			System.out.println("Ngày hẹn hò đầu tiên là: " + firstDate.getDayOfWeek());
		}

	}

}

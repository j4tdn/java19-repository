package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01RelationshipCalcuator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first date of your relationship (dd-MM-yyyy): ");
		String firstDateStr = scanner.nextLine();

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate firstDate = LocalDate.parse(firstDateStr, dateFormatter);
		LocalDateTime firstDateTime = firstDate.atStartOfDay();

		System.out.print("Have you broken up? (Y/N): ");
		String breakupAnswer = scanner.nextLine();

		if (breakupAnswer.equalsIgnoreCase("Y")) {
			System.out.print("Enter the breakup date (dd-MM-yyyy): ");
			String breakupDateStr = scanner.nextLine();

			DateTimeFormatter breakupDateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate breakupDate = LocalDate.parse(breakupDateStr, breakupDateFormatter);
			LocalDateTime breakupDateTime = breakupDate.atStartOfDay();

			long years = firstDateTime.until(breakupDateTime, ChronoUnit.YEARS);
			long months = firstDateTime.until(breakupDateTime, ChronoUnit.MONTHS) % 12;
			long days = firstDateTime.until(breakupDateTime, ChronoUnit.DAYS);
			long hours = firstDateTime.until(breakupDateTime, ChronoUnit.HOURS) % 24;
			long minutes = firstDateTime.until(breakupDateTime, ChronoUnit.MINUTES) % 60;
			long seconds = firstDateTime.until(breakupDateTime, ChronoUnit.SECONDS) % 60;

			System.out.println("The first date is: " + firstDate.getDayOfWeek());
			System.out.println("Your relationship duration is:");
			System.out.println(years + " years, " + months + " months, " + days + " days, " + hours + " hours, "
					+ minutes + " minutes, " + seconds + " seconds.");
		} else {
			System.out.println("The first date is: " + firstDate.getDayOfWeek());
			System.out.println("Your relationship is still ongoing.");
		}

		scanner.close();
	}
}

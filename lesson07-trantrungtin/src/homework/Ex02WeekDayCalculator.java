package homework;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex02WeekDayCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=========Enter your birthday by day/month/year============");

		System.out.print("Day: ");
		int day = inputValidate(scanner, 1, 31);

		System.out.print("Month: ");
		int month = inputValidate(scanner, 1, 12);

		System.out.print("Year: ");
		int year = inputValidate(scanner, 0, Integer.MAX_VALUE);

		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayNumber = date.getDayOfYear();
		int daysLeft = date.lengthOfYear() - dayNumber;

		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekNumberOfYear = date.get(weekFields.weekOfYear());
		int weekNumberOfMonth = date.get(weekFields.weekOfMonth());
		int monthDays = date.lengthOfMonth();
		int weeksInYear = date.withMonth(12).withDayOfMonth(31).get(weekFields.weekOfYear());

		System.out.println("==========RESULT=========");
		System.out.println(day + " " + date.getMonth().toString() + " " + year + " is a " + dayOfWeek);
		System.out.println("\n ***Additional facts: \n");
		System.out.println("It is day number " + dayNumber + " of the year, " + daysLeft + " days left.");
		System.out.println("It is " + dayOfWeek + " number " + weekNumberOfYear + " out of " + weeksInYear + " in "
				+ year + ".");
		System.out.println("It is " + dayOfWeek + " number " + weekNumberOfMonth + " out of "
				+ monthDays / 7 + " in " + date.getMonth().toString() + " " + year + ".");
		System.out.println("Year " + year + " has " + date.lengthOfYear() + " days.");
		System.out.println(date.getMonth().toString() + " " + year + " has " + monthDays + " days.");

		scanner.close();
	}

	private static int inputValidate(Scanner scanner, int min, int max) {
		int value;
		do {
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.println("Invalid input. Please enter a valid integer.");
			}
			value = scanner.nextInt();
			if (value < min || value > max) {
				System.out.println("Invalid input. Please enter a value between " + min + " and " + max + ".");
			}
		} while (value < min || value > max);
		return value;
	}
}

package homework;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("Current Time in Japan: " + getCurrentTimeInRegion("Asia/Tokyo"));
		System.out.println("Last Day of the Current Month: " + getLastDayOfMonth());
		System.out.println("First and Last Day of the Current Week: " + getCurrentWeekRange());
		System.out.println("Week of the Current Day in the Year: " + getCurrentDayWeekInYear());
		System.out.println("Date after 20 Days: " + getDateAfterDays(20));
		System.out.println("Day of the Week after 20 Days: " + getDayOfWeekAfterDays(20));

		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter your birthday with format (dd/MM/yyyy):");
		String dobString = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthday = LocalDate.parse(dobString, formatter);

		System.out.println("You have been living : " + getDaysLived(birthday) + "days and continue...");
		scanner.close();
	}

	public static String getCurrentTimeInRegion(String region) {
		ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(region));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return formatter.format(currentTime);
	}

	public static String getLastDayOfMonth() {
		LocalDate currentDate = LocalDate.now();
		LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(lastDayOfMonth);
	}

	public static String getCurrentWeekRange() {
		LocalDate currentDate = LocalDate.now();
		LocalDate firstDayOfWeek = currentDate.with(DayOfWeek.MONDAY);
		LocalDate lastDayOfWeek = currentDate.with(DayOfWeek.SUNDAY);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(firstDayOfWeek) + " - " + formatter.format(lastDayOfWeek);
	}

	public static int getCurrentDayWeekInYear() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.get(WeekFields.of(DayOfWeek.MONDAY, 7).weekOfYear());
	}

	public static String getDateAfterDays(int days) {
		LocalDate currentDate = LocalDate.now();
		LocalDate dateAfterDays = currentDate.plusDays(days);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(dateAfterDays);
	}
	
    public static String getDayOfWeekAfterDays(int days) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateAfterDays = currentDate.plusDays(days);
        DayOfWeek dayOfWeek = dateAfterDays.getDayOfWeek();
        return dayOfWeek.toString();
    }

	public static long getDaysLived(LocalDate birthday) {
		LocalDate currentDate = LocalDate.now();
		return ChronoUnit.DAYS.between(birthday, currentDate);
	}

}

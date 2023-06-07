package homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex04DeliveryDateCalcuator {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2022, 6, 7);
		int projectDuration = 110;

		LocalDate deliveryDate = calculateDeliveryDate(startDate, projectDuration);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH);
		String formattedDate = deliveryDate.format(formatter);
		System.out.println("Delivery Date is: " + formattedDate);
	}

	public static LocalDate calculateDeliveryDate(LocalDate startDate, int projectDuration) {
		LocalDate currentDate = startDate;
		int workingDay = projectDuration;

		while (workingDay > 0) {
			if (isWorkingDay(currentDate)) {
				workingDay--;
			}
			currentDate = currentDate.plusDays(1);
		}

		return currentDate.minusDays(1);
	}

	public static boolean isWorkingDay(LocalDate date) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
	}
}

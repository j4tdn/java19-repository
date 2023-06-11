package ex03;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex03Java8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Chọn chức năng:");
		System.out.println("1. Xem thời gian hiện tại ở khu vực bất kỳ.");
		System.out.println("2. In ngày cuối cùng của tháng hiện tại.");
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("6. Kiểm tra số ngày đã sống.");

		System.out.print("Chọn chức năng (1-6): ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			printCurrentTimeInTimeZone(scanner);
			break;
		case 2:
			printLastDayOfMonth();
			break;
		case 3:
			printFirstAndLastDayOfWeek();
			break;
		case 4:
			printCurrentWeekNumber();
			break;
		case 5:
			printDateAfterNDays(scanner);
			break;
		case 6:
			printDaysAlive(scanner);
			break;
		default:
			System.out.println("Chức năng không hợp lệ.");
		}

		scanner.close();
	}

	private static void printCurrentTimeInTimeZone(Scanner scanner) {
		System.out.print("Nhập mã khu vực (VD: Asia/Ho_Chi_Minh): ");
		String timeZone = scanner.next();

		LocalDateTime now = LocalDateTime.now(ZoneId.of(timeZone));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedTime = now.format(formatter);

		System.out.println("Thời gian hiện tại ở khu vực " + timeZone + ": " + formattedTime);
	}

	private static void printLastDayOfMonth() {
		LocalDate now = LocalDate.now();
		LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = lastDayOfMonth.format(formatter);

		System.out.println("Ngày cuối cùng của tháng hiện tại: " + formattedDate);
	}

	private static void printFirstAndLastDayOfWeek() {
		LocalDate now = LocalDate.now();
		LocalDate firstDayOfWeek = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		LocalDate lastDayOfWeek = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedFirstDay = firstDayOfWeek.format(formatter);
		String formattedLastDay = lastDayOfWeek.format(formatter);

		System.out.println("Ngày đầu tiên của tuần hiện tại: " + formattedFirstDay);
		System.out.println("Ngày cuối cùng của tuần hiện tại: " + formattedLastDay);
	}

	private static void printCurrentWeekNumber() {
		LocalDate now = LocalDate.now();
		int weekNumber = now.get(WeekFields.ISO.weekOfWeekBasedYear());

		System.out.println("Tuần hiện tại trong năm: " + weekNumber);
	}

	private static void printDateAfterNDays(Scanner scanner) {
		System.out.print("Nhập số ngày (VD: 20): ");
		int days = scanner.nextInt();

		LocalDate now = LocalDate.now();
		LocalDate dateAfterNDays = now.plusDays(days);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
		String formattedDate = dateAfterNDays.format(formatter);

		System.out.println("Sau " + days + " ngày là ngày: " + formattedDate);
	}

	private static void printDaysAlive(Scanner scanner) {
		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		String birthDate = scanner.next();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.parse(birthDate, formatter);

		long daysAlive = ChronoUnit.DAYS.between(birthday, now);

		System.out.println("Số ngày đã sống: " + daysAlive);
	}
}
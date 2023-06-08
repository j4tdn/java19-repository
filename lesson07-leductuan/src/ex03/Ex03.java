package ex03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {

	private static Scanner scanner = new Scanner(System.in);
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("Chọn chức năng:");
			System.out.println("1. Thời gian tại một khu vực bất kì");
			System.out.println("2. Ngày cuối cùng của tháng");
			System.out.println("3. Ngày đầu tiên và cuối cùng của tuần hiện tại.");
			System.out.println("4. Ngày hiện tại đang ở tuần thứ mấy trong năm.");
			System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
			System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
			System.out.println("0. Thoát");

			while (!scanner.hasNextInt()) {
				System.out.println("Vui lòng chọn lại:");
				scanner.nextLine();
			}

			choice = scanner.nextInt();
			scanner.nextLine(); // Clear the input buffer

			switch (choice) {
			case 1:
				showCurrentTimeInTimeZone();
				break;
			case 2:
				showLastDayOfMonth();
				break;
			case 3:
				showFirstAndLastDayOfWeek();
				break;
			case 4:
				showWeekOfYear();
				break;
			case 5:
				showDateAndDayOfWeekAfter20Days();
				break;
			case 6:
				countDaysAlive();
				break;
			case 0:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Vui lòng chọn lại");
				break;
			}

			System.out.println(); // Print a blank line for readability
		} while (choice != 0);
	}

	private static void showCurrentTimeInTimeZone() {
		System.out.println("Nhập khu vực (VD:Asia/Tokyo,Asia/Kolkata,Asia/Ho_Chi_Minh):");
		String timeZone = scanner.nextLine();

		TimeZone tz = TimeZone.getTimeZone(timeZone);
		Calendar calendar = Calendar.getInstance(tz);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(tz);
		String time = df.format(calendar.getTime());
		System.out.printf("Thời gian tại %s là %s\n", timeZone, time);
	}

	private static void showLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String lastDayOfMonth = df.format(calendar.getTime());
		System.out.printf("Ngày cuối cunghx của tháng là %s\n", lastDayOfMonth);
	}

	private static void showFirstAndLastDayOfWeek() {
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.set(Calendar.DAY_OF_WEEK, firstDayOfWeek.getFirstDayOfWeek());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String firstDay = df.format(firstDayOfWeek.getTime());

		Calendar lastDayOfWeek = Calendar.getInstance();
		lastDayOfWeek.set(Calendar.DAY_OF_WEEK, lastDayOfWeek.getActualMaximum(Calendar.DAY_OF_WEEK));
		String lastDay = df.format(lastDayOfWeek.getTime());

		System.out.printf("Ngày đầu tuần là %s\n", firstDay);
		System.out.printf("Ngày cuối tuần là %s\n", lastDay);
	}

	private static void showWeekOfYear() {
		Calendar calendar = Calendar.getInstance();
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.printf("Tuần thứ %d\n", weekOfYear);
	}

	private static void showDateAndDayOfWeekAfter20Days() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 20);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		String dateAfter20Days = df.format(calendar.getTime());
		System.out.printf("Sau 20 ngày nữa là ngày %s\n", dateAfter20Days);
	}

	private static void countDaysAlive() {
		System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
		Date birthday = null;

		while (true) {
			try {
				String birthdayString = scanner.nextLine();
				birthday = df.parse(birthdayString);
				break;
			} catch (ParseException e) {
				System.out.println("Vui lòng nhập lại");
			}
		}

		Calendar birthdayCalendar = Calendar.getInstance();
		birthdayCalendar.setTime(birthday);
		long duration = Calendar.getInstance().getTimeInMillis() - birthdayCalendar.getTimeInMillis();
		int days = (int) (duration / (1000 * 60 * 60 * 24));
		System.out.printf("Bạn đã sống được %d ngày \n", days);
	}
}

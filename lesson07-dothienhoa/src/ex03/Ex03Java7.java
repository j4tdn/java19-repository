package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03Java7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Chọn chức năng:");
		System.out.println("1. Xem thời gian hiện tại ở khu vực bất kỳ.");
		System.out.println("2. In ngày cuối cùng của tháng hiện tại.");
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("6. Kiểm tra số ngày đã sống.");

		int choice = Integer.parseInt(input.nextLine());
		switch (choice) {
		case 1:
			printCurrentTimeInTimeZone(input);
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
			printDateAfterNDays(input);
			break;
		case 6:
			printDaysAlive(input);
			break;
		default:
			System.out.println("Chức năng không hợp lệ.");
		}

		input.close();
	}

	public static void printCurrentTimeInTimeZone(Scanner input) {
		System.out.print("Nhập mã khu vực (VD: Asia/Ho_Chi_Minh): ");
		String timeZone = input.nextLine();
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
		Date currentDate = calendar.getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedTime = formatter.format(currentDate);
		System.out.println("Thời gian hiện tại ở khu vực " + timeZone + ": " + formattedTime);
	}

	public static void printLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, lastDay);
		Date lastDate = calendar.getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = formatter.format(lastDate);
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + formattedDate);
	}

	private static void printFirstAndLastDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date firstDayOfWeek = calendar.getTime();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		Date lastDayOfWeek = calendar.getTime();
		String formattedFirstDay = formatter.format(firstDayOfWeek);
		String formattedLastDay = formatter.format(lastDayOfWeek);

		System.out.println("Ngày đầu tiên của tuần hiện tại: " + formattedFirstDay);
		System.out.println("Ngày cuối cùng của tuần hiện tại: " + formattedLastDay);
	}

	private static void printCurrentWeekNumber() {
		Calendar calendar = Calendar.getInstance();
		int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);

		System.out.println("Tuần hiện tại trong năm: " + weekNumber);
	}

	private static void printDateAfterNDays(Scanner scanner) {
		System.out.print("Nhập số ngày (VD: 20): ");
		int days = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, days);
		Date dateAfterNDays = calendar.getTime();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy EEEE");
		String formattedDate = formatter.format(dateAfterNDays);

		System.out.println("Sau " + days + " ngày là ngày: " + formattedDate);
	}

	private static void printDaysAlive(Scanner scanner) {
		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		String birthDate = scanner.nextLine();

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		Date currentDate = calendar.getTime();
		Date birthday = null;

		try {
			birthday = formatter.parse(birthDate);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}

		long millisecondsAlive = currentDate.getTime() - birthday.getTime();
		long daysAlive = millisecondsAlive / (24 * 60 * 60 * 1000);

		System.out.println("Số ngày đã sống: " + daysAlive);
	}

}

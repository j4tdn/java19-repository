package homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex03 {

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
	
	public static void main(String[] args) {
		System.out.println("Giờ hiện tại ở Hồ Chí Minh " + getCurrentTimeInRegion("Asia/Ho_Chi_Minh"));
		System.out.println("Ngày cuối cùng của tháng: " + getLastDayOfMonth());
		System.out.println("Ngày đầu và cuối ngày của tuần: " + getCurrentWeekRange());
		System.out.println("Ngày hiện tại là tuần thứ " + getCurrentDayWeekInYear() +" của năm");
		System.out.println("20 ngày nữa là ngày nào: " + getDateAfterDays(20));
		System.out.println("20 ngày nữa là thứ mấy: " + getDayOfWeekAfterDays(20));
		System.out.println("Nhập vào ngày sinh của bạn");
		Scanner sr = new Scanner(System.in);
		String birthDayStr = sr.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDay = LocalDate.parse(birthDayStr, formatter);
		System.out.println("Bạn đã sống được " +getDaysLived(birthDay) +" ngày");
	}
}

package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
		now();
		lastDayOfMonth();
		firstAndLastDayOfWeek();
		dateAfter20Days();
		livedDays();
	}
    //Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
    private static void now() {
    	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	LocalDateTime now = LocalDateTime.now();
    	System.out.println("Now: " + df.format(now));
    }
    //In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
    private static void lastDayOfMonth() {
    	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate currentDate = LocalDate.now();
    	LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
    	System.out.println("Last day of month: " + df.format(lastDayOfMonth));
    }
    //Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
    private static void firstAndLastDayOfWeek() {
    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	 LocalDate currentDate = LocalDate.now();
         LocalDate firstDayOfWeek = currentDate.with(DayOfWeek.MONDAY);
         LocalDate lastDayOfWeek = currentDate.with(DayOfWeek.SUNDAY);
         System.out.println("First day of week: " + formatter.format(firstDayOfWeek));
         System.out.println("Last day of week: " + formatter.format(lastDayOfWeek));
    }
    //Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
    private static void dateAfter20Days() {
   	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate currentDate = LocalDate.now();
    	LocalDate newDate = currentDate.plusDays(20);
    	System.out.println("Date after 20 days from now: " + formatter.format(newDate));
    }
    //Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
    private static void livedDays() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter your birthday (dd/MM/yyyy): ");
    	String ip = scanner.nextLine();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	LocalDate bDay = LocalDate.parse(ip, formatter);
    	LocalDate currentDate = LocalDate.now();
    	long days = ChronoUnit.DAYS.between(bDay, currentDate);
    	scanner.close();
    	System.out.println("You have lived for: " + days + " days");
    }
}

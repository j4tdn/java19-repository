package java8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {
 /*/
  * Xây dựng ứng dụng The Ultimate Relationship Calculator
 Nhập thời gian bắt đầu hẹn hò của 2 người.
 Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 Nhấn Enter để thực hiện tính toán. Hỏi
 Ngày bắt đầu hẹn họ là ngày thứ mấy.
 Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
  */
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Enter the start date of the relationship (dd/MM/yyyy hh:mm:ss): ");
		   String startDateString = scanner.nextLine();
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		   LocalDateTime startDate = LocalDateTime.parse(startDateString, formatter);
		   LocalDateTime endDate = LocalDateTime.now();
		   System.out.print("Has the relationship ended? (Y/N): ");
		   String response = scanner.nextLine();
		   if (response.equalsIgnoreCase("Y")) {
		       System.out.print("Enter the end date of the relationship (dd/MM/yyyy hh:mm:ss): ");
		       String endDateString = scanner.nextLine();
		       endDate = LocalDateTime.parse(endDateString, formatter);
		   }
		   long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		   if (daysBetween < 0) {
		       System.out.println("Invalid input: end date is before start date");
		   } else {
		       daysBetween++; // add 1 to include end date
		       System.out.println("The relationship lasted for " + daysBetween + " days.");
		   }
		   Duration duration = Duration.between(startDate, endDate);
		   Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
		   long years = period.getYears();
		   long months = period.getMonths();
		   long days = period.getDays();
		   long hours = duration.toHours() % 24;
		   long minutes = duration.toMinutes() % 60;
		   long seconds = duration.getSeconds() % 60;
		   System.out.printf("The relationship lasted for %d years, %d months, %d days, %d hours, %d minutes, and %d seconds.",
		           years, months, days, hours, minutes, seconds);



	}
}

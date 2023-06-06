package homework;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex04 {
	  public static void main(String[] args) {
	        LocalDate startDate = LocalDate.of(2022, 6, 7); // Ngày nhận dự án
	        int workingDays = 110; // Số ngày làm việc để hoàn thành dự án

	        // Tính ngày kết thúc
	        LocalDate endDate = startDate;
	        int remainingDays = workingDays;
	        while (remainingDays > 0) {
	            endDate = endDate.plusDays(1);
	            if (endDate.getDayOfWeek() != DayOfWeek.SATURDAY && endDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
	                remainingDays--;
	            }
	        }

	        // In kết quả
	        System.out.println("Ngày nhận dự án: " + startDate);
	        System.out.println("Ngày kết thúc dự án: " + endDate);
	    }
	}

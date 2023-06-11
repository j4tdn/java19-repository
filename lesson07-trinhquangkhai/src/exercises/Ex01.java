package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	//DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	LocalDateTime startd = null;
	LocalDateTime endd = null;
	
		
	
	System.out.println("Nhập ngày bắt đầu hẹn hò dd/MM/yyyy: ");
	String startDate = ip.nextLine();
	
	try {
		startd = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).atStartOfDay();
	}catch(DateTimeParseException e) {
		e.printStackTrace();
		System.exit(0);
	}
	
	
	
	System.out.println("Nếu đã chia tay, thì nhập ngày chia tay dd/MM/yyyy. Còn nếu chưa chia tay thì bỏ qua : ");
	String endDate = ip.nextLine();
	
	if(endDate.isEmpty()) { 
		endd = LocalDateTime.now();
		System.out.println("Nếu bỏ qua ngày chia tay thì lấy thời gian hiện tại là : " + endd);
	}else {
		try {
			endd = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).atStartOfDay();
		}catch(DateTimeParseException i) {
			i.printStackTrace();
			System.exit(0);
		}
	}
	
	// Tính thời gian giữa hai ngày 
	
	//long days = ChronoUnit.DAYS.between(startd, endd);
	Period period = Period.between(startd.toLocalDate(), endd.toLocalDate());
	int date = startd.getDayOfWeek().getValue() + 1;
	
	System.out.println("\nNgày bắt đầu hẹn hò là ngày thứ " + date);
	System.out.println("\nMối tình đã bắt đầu được " + period.getYears() + " năm " + period.getMonths() + " tháng "
			+ period.getDays() + " ngày " + startd.until(endd, ChronoUnit.HOURS)%24 + " giờ " 
			+ startd.until(endd, ChronoUnit.MINUTES) %60 + " phút " 
			+ startd.until(endd, ChronoUnit.SECONDS) %60 + " giây "
			
			);
	
	
}
}

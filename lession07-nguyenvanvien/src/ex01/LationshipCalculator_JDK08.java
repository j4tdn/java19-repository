package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import enu.custom.DayOfWeek;
import exception.custom.DateValidator;
import exception.custom.NumberValidator;

public class LationshipCalculator_JDK08 {
	public static Scanner sc = new Scanner(System.in);
	public static DateTimeFormatter dFormatter = null;
	public static void main(String[] args) {
		handleCal();
	}
	
	public static LocalDateTime enterDate(String script) {
		DateValidator dateValidator = new DateValidator();
		LocalDate lcDate = null;
		LocalTime lcTime = null;
		LocalDateTime lcDateTime = null;
		System.out.println(script);
		boolean checkDate = false;
		String date = "";
		while(true) {
			try {
				if(!checkDate)
				{
					System.out.print("\nEnter date (dd/MM/yyyy): ");
					date= sc.nextLine();
				}
				if(dateValidator.isValidDate(date)) {
					checkDate = true;
					dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					lcDate = LocalDate.parse(date,dFormatter);
				}
				System.out.print("Enter time (HH:mm:ss) : ");
				String time= sc.nextLine();
				if(dateValidator.isValidTime(time)) {
					dFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
					lcTime = LocalTime.parse(time);
				}
				if(lcDate != null && lcTime != null) {
					dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					lcDateTime  = lcDate.atTime(lcTime);
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return lcDateTime;
	}
	
	public static void handleCal() {
		
		LocalDateTime lcDTStart = enterDate("Enter start day Relationship !!");
		System.out.print("\nAre you still in love? (Y/N) : ");
		String answer = sc.nextLine();
		LocalDateTime lcDTEnd = null;
		while(true) {
			if(answer.equals("N")) {
				lcDTEnd = enterDate("Enter end day Relationship !!");
				break;
			}
			else if(answer.equals("Y")) {
				lcDTEnd = LocalDateTime.now();
				break;
			}
			else {
				System.out.print("\nPlease enter 'Y' or 'N' : ");
				answer = sc.nextLine();
			}
		}
		System.out.println("============ Calculator ============");
		
		System.out.println("Ngày bắt đầu là ngày : " + lcDTStart.toLocalDate().getDayOfWeek());
		
		Period period = Period.between(lcDTStart.toLocalDate(), lcDTEnd.toLocalDate());
		Duration duration = Duration.between(lcDTStart.toLocalTime(), lcDTEnd.toLocalTime());
		System.out.println("Mối tình đã bắt đầu:" +
         optional(period.getYears(), "Years ") +
         optional(period.getMonths(), "Months ") +
         optional(period.getDays(), "Days ") +
         optional(duration.toHoursPart(), "Hours ") +
         optional(duration.toMinutesPart(), "Minutes ") +
         optional(duration.toSecondsPart(), "Seconds ")); 
    }

    public static String optional(long value, String unit) {
    	value = Math.abs(value);
        return value != 0 ? value + " " + unit : "";
    }
	
}

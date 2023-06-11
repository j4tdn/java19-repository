package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex02LocalDateDemo {
     public static void main(String[] args) {
    	 DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	 //String: format(ldate), LocalDate: parse(string)
    	 
		 LocalDate past = LocalDate.of(2022, 2, 1);
		 System.out.println("past: " + past);
		 System.out.println("\n==========\n");
    	 
    	 LocalDate ldate = LocalDate.now();
    	 ldate = ldate.withDayOfMonth(2)
    			      .withMonth(3)
    			      .with(ChronoField.YEAR, 2022)
    			      .plusYears(1);
    	 System.out.println("ldate: " + ldate);
    	 System.out.println("ladate formatted: " + df.format(ldate));
    	 System.out.println("ldate year: " + ldate.getYear());
    	 
    	 System.out.println("\n==============\n");
    	 //Period: Tim hieu giua 2 moc thoi gian (LocalDate)
    	 if(ldate.isBefore(past)) {
    		 throw new RuntimeException();
    	 }
    	 Period period = Period.between(past, ldate);
    	 System.out.println("perod: " + period);
    	 System.out.println("period toString: \n"
    			 + optional(period.getYears(), "year\n")
    			 + optional(period.getMonths(), "month\n")
    			 + optional(period.getDays(), "day\n"));
    	 
	}
     private static String optional (int value, String unit) {
    	 String optS = value > 1 ? "s" : "";
    	 return value == 0 ? "" : value + " " + unit + optS;
     }
}

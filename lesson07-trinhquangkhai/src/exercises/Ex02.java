package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in); 
	//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	LocalDateTime input1 = null;
	System.out.println("Enter the Day/Month/Year: ");
	String input = ip.nextLine();
	
	try {
		input1 = LocalDate.parse(input, DateTimeFormatter.ofPattern(input)).atStartOfDay();
	}catch(DateTimeParseException e) {
		System.out.println("input is invalid! ");
	}
	
	
	int Maxofday = cal.getActualMaximum(Calendar.YEAR)- cal.get(Calendar.DAY_OF_YEAR);
	
	
 	System.out.println("It is day number " + cal.get(Calendar.YEAR) + "of the year" + ", " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " day left");
	System.out.println("Year " + input1.get(Calendar.YEAR) + " has " + Maxofday + " days");
	System.out.println();
	
	
}

}

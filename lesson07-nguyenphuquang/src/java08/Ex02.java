package java08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate =  LocalDate.now();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter dd/MM/yyyy");
		
		String[] input = ip.nextLine().split("/");
		try {
			ldate = ldate.withDayOfMonth(Integer.parseInt(input[0]))
					.withMonth(Integer.parseInt(input[1])).withYear(Integer.parseInt(input[2]));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("It is day number " + ldate.getDayOfYear() + " of the year. ");
		System.out.println(ldate.lengthOfYear() - ldate.getDayOfYear() + " days left");
		System.out.println("It is " + ldate.getDayOfWeek() + " number " + (ldate.getDayOfYear()/7 + 1) + " out of "
				+ ldate.lengthOfYear()/7 + " in " + ldate.getYear());
		System.out.println("It is " + ldate.getDayOfWeek() + " number " + (ldate.getDayOfMonth()/7 + 1 ) + " out of "
				+ ldate.lengthOfMonth()/7 + " in " + ldate.getMonth());
		System.out.println("Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days.");
		System.out.println( ldate.getMonth() + " " + ldate.getYear() + " has " + ldate.lengthOfMonth() + " days.");
	}

}

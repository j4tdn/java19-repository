package localdatetime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// new Class() --> setter
		Date date = new Date();
		date.setDate(10);
		date.setHours(12);

		// singleton pattern
		// make sure to create only one instance from class
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2021);
		c.set(Calendar.DAY_OF_YEAR, 212);
		c.set(Calendar.HOUR_OF_DAY, 16);

		LocalDate ldate = LocalDate.now() // LocalDate
				.withYear(2025).withMonth(10); // 1-12

		// ldate = ldate.withYear(2024);

		System.out.println("ldate: " + ldate);

	}
}

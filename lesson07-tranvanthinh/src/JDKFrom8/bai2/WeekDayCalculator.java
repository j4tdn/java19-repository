package JDKFrom8.bai2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WeekDayCalculator {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(inputLDate());
	}
	
	public static LocalDate inputLDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ldate = null;
		String startDate;
		do {
			try {
				System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				ldate = LocalDate.parse(startDate, df);
				break;
			} catch (Exception e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);
		return ldate;
	}
	
	public static void Calculator() {
		
	}
}

package ex04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DueDate_JDK08 {
	public static DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
		findDueDay();
	}
	public static void findDueDay() {
		String dateStr = "07/06/2022";
		
		LocalDate lcDate = LocalDate.parse(dateStr,dFormatter);
		int count = 0;
		int countSunSat = 0;
		while(count <=110) {
			int dow = lcDate.getDayOfWeek().getValue();
			if( dow != DayOfWeek.SATURDAY.getValue() && dow != DayOfWeek.SUNDAY.getValue()) {
				count ++;
			}
			else {
				countSunSat ++;
			}
			lcDate = lcDate.plusDays(1);
		}
		System.out.println("Ngày tới hạn : " + lcDate.format(dFormatter));
		System.out.println("Tổng số ngày thứ 7 và chủ nhật : " + countSunSat);
		
	}
}

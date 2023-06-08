package ex04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); // day month year
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("Ngày hiện tại: " + formatted);
		
		Calendar startDay = Calendar.getInstance();
		startDay.set(2022, Calendar.JUNE, 07);
		
		Calendar endDay = Calendar.getInstance();
		endDay.setTime(startDay.getTime());
		
		int count = 0;
		while (true) {
			if(endDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || endDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				endDay.add(Calendar.DAY_OF_YEAR, 1);
			} else {
				count++;
				if(count == 110) {
					break;
				}
				endDay.add(Calendar.DAY_OF_YEAR, 1);
			}
		}
		System.out.println("Nhóm A và B sẽ phải bắt đầu ngày: " + df.format(startDay.getTime()));
		System.out.println("nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B: " + df.format(endDay.getTime()));
	}
}
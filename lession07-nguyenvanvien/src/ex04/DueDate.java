package ex04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DueDate {
	public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		findDue();
	}
	public static void findDue() {
		String dateStr = "07/06/2022";
		Date date = null;
		try {
			date = df.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar startDay = null;
		if(date != null)
		{
			startDay = Calendar.getInstance();
			startDay.setTime(date);
		}
		int count = 0;
		int countSunSat = 0;
		while(count <=110) {
			int dow = startDay.get(Calendar.DAY_OF_WEEK);
			if( dow != 1 && dow != 7) {
				count ++;
			}
			else {
				countSunSat ++;
			}
			startDay.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("Ngày tới hạn : " + df.format(startDay.getTime()));
		System.out.println("Tổng số ngày thứ 7 và chủ nhật : " + countSunSat);
		
	}
}

package datetime;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex01DatetimeDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		
		
		//3. Thứ ngày, tuần/ngày trong tháng, năm
		System.out.println(c.getFirstDayOfWeek());
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("day of week: " + dowAsInt);
		System.out.println("dowAsInt " + dowAsInt);
		String[] dowasStrings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("dowasStrings: " + dowasStrings[dowAsInt-1]);
		
		DayOfWeek[] dayOfWeeks = DayOfWeek.values();
		System.out.println(dayOfWeeks[dowAsInt - 1]);
		
		//4. Đếm số ngày trong tháng, năm hiện tại
		
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month: " + daysInMonth);
		
		//5. Kiem tra nam hien tai co phai nam nhuan hay khong
		System.out.println(c.get(Calendar.YEAR));
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(c.get(Calendar.YEAR)));
		
		
		c.set(2023, Calendar.AUGUST, 3);
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
		Calendar startDayOfWeek = Calendar.getInstance();
		startDayOfWeek.setTime(c.getTime());
		
		startDayOfWeek.add(Calendar.DAY_OF_MONTH,  fdowAsInt - currentDowAsInt);;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("first day of week as number:" + df.format(startDayOfWeek.getTime()));
		
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		
	}
}

package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DatetimeDemo {
	public static void main(String[] args) {
		Date date  = new Date();
		System.out.println("date --> " + date);
		
		long dayInMs = TimeUnit.DAYS.toMillis(1);
		
		Date dateFromEpochTime = new Date(24*60*60*1000);
		System.out.println("dateFromEpochTime --> " + dateFromEpochTime);
		
		
		// singleton pattern : mẫu thiết kế để khởi tạo đối tượng, 
//							   1 class chỉ tạo ra 1 đối tượng duy nhất cho class đó
		
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println("" + c);
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("first day of week: " + c.getFirstDayOfWeek());
		
		// 1. Ngày, tháng, năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String dmy = dayOfMonth + "/" + month + "/" + year;
		System.out.println("1. Ngày tháng năm: " + dmy);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = c.getTime();
		String format = df.format(convertedDate);
		System.out.println("" + format);
		
		// 2. Giờ 12-24, phút, giây
		df =new SimpleDateFormat("hh:mm:ss a");
		System.out.println("formatted time: " + df.format(c.getTime()));
		
		// 3. Thứ ngày, tuần/ngày trong tháng, năm
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
//		String[] dowasStrings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("dowAsInt: " + dowAsEnum[dowAsInt - 1]);
		
		// 4. Đếm số ngày tháng, năm hiện tại
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in Month: " + daysInMonth);
		
		// 5. Kiểm tra năm nhuận
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year: " + gc.isLeapYear(year));
		
		// 6. Ngày đầu tiên trong tuần
		System.out.println("first day of week: " + dowAsEnum[c.getFirstDayOfWeek() - 1]);
		
		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// in ra tất cả những ngày trong tuần đó
		c.set(2023, 7, 8);
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		Calendar startDayOfWeek  = Calendar.getInstance();
		startDayOfWeek .setTime(c.getTime());
		startDayOfWeek .add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("first day of week as number: " + df.format(startDayOfWeek.getTime()));
		
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		// endDayOfWeek.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println("start day of week --> " + df.format(startDayOfWeek.getTime()));
		System.out.println("end day of week --> " + df.format(endDayOfWeek.getTime()));
		
		// before <
		for (Calendar running = startDayOfWeek ; 
					running.before(endDayOfWeek); 
						running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("date --> " + df.format(running.getTime()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}

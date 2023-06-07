package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DateTimeDemo {

	public static void main(String[] args) {
		System.out.println("--------using date-----\n");
		Date date = new Date();
		System.out.println("date --> " + date);
		
		long dayInMs = TimeUnit.DAYS.toMillis(1);
		System.out.println("dayInMs-->" + dayInMs + "ms");
		
		Date dateFromEpochTime = new Date(24*60*60*1000);
		System.out.println("dateFromEpochTime --> " + dateFromEpochTime + "\n");
		
		System.out.println("--------using calendar-------\n");
		// design pattern: singleton pattern
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
	    
		System.out.println("default locale --> " + Locale.getDefault());
		System.out.println("first day of week: " + c.getFirstDayOfWeek());
		
//	    + 1. Ngày, Tháng, Năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String dmy = dayOfMonth + "/" + month + "/" + year;
		System.out.println("1. Ngay thang nam: " + dmy);
		
		//khi muon in ra vai thong tin --> chuoi --> format
		//SimpleDateFormat(string(display)-date(timeInMs)-calendar(timeInMs))
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("formatted: " + formatted);
		
//		+ 2. Giờ 12-24, Phút, Giây
		df = new SimpleDateFormat("hh:mm:ss a"); //hh --> clock 12
		System.out.println("formatted time: " + df.format(c.getTime()));
//		+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		// 1 (sun) 234567
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("dowAsString: " + dowAsEnum[dowAsInt-1]);
        
		int wom = c.get(Calendar.WEEK_OF_MONTH);
		
//      + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in moth: " + daysInMonth);
		
//		+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year: " + gc.isLeapYear(year)); 
		
//		+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		System.out.println("first day of week: " + dowAsEnum[c.getFirstDayOfWeek() - 1]);
//	    + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
//	     ==> In ra danh sách các ngày trong tuần hiện tại 
		// c --> 8/7/2023
		c.set(2023, Calendar.AUGUST, 3);
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
		Calendar starDayOfWeek = Calendar.getInstance();
		starDayOfWeek.setTime(c.getTime());
		
		starDayOfWeek.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyy EEEE");
		System.out.println("First day of week as number: " + df.format(starDayOfWeek.getTime()));
		
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(starDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		//endDayOfWeek.add(Calendar.WEEK_OF_MONTH, -1);
		for(Calendar running = starDayOfWeek; running.before(endDayOfWeek); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("date --> " + df.format(running.getTime()));
		}

		
		
		
		//for (int day = 0; day < 7; day++) {
		//	System.out.println("date --> " + df.format(starDayOfWeek.getTime()));
		//	starDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		//}
	}
	
	
}

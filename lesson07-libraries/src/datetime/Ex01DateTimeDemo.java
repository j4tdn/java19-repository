package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex01DateTimeDemo {
	public static void main(String[] args) {
		System.out.println("==========using date util===========\n");
//		Ex01: Lấy thông tin thời gian hiện tại với [timezone]
		// java.util.Date(dmy hms): --> demo bai toan ngay/thang/nam
		// java.sql.Date(dmy): --> demo bai toan connect db
			Date date = new Date();
			System.out.println("date -->" + date);
			
//			int dayInMs = 24*60*60*1000;
			long dayInMs = TimeUnit.DAYS.toMillis(1);
			System.out.println("1day = " + dayInMs + "(ms)" );
			
			Date dateFromEpochTime = new Date(24*60*60*1000);
			System.out.println("dateFromEpochTime -->" + dateFromEpochTime);
			
			System.out.println("\n==========using calendar===========\n");
			
//			Locale.setDefault(new Locale("vi","VN"));
			Calendar c = Calendar.getInstance();//using default locale
			System.out.println("c -->" + c);
//			Locale.setDefault(Locale.FRANCE);
			
			System.out.println("default locale: " + Locale.getDefault());
			System.out.println("first day of week: " + c.getFirstDayOfWeek());
			
			
//			+ 1. Ngày, Tháng, Năm
			
			int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
			int month = c.get(Calendar.MONTH);
			int year = c.get(Calendar.YEAR);
			
			String dmy = dayOfMonth + "/" + month + "/" + year;
			
			System.out.println("1. Ngày, Tháng, Năm -->" + dmy);
			
//			SimpleDateFormat(String (display) - date(timeInMs) - calendar(timeInMs))
//			27.05.2023 --> hien thi
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
			Date convertDate = c.getTime();
			
			String formatted = df.format(convertDate);
			System.out.println("formatted -->" + formatted);
			
			
			
//			+ 2. Giờ 12-24, Phút, Giây
			df = new SimpleDateFormat("HH:mm:ss");
			System.out.println("2. formatted -->" + df.format(c.getTime()));
			
//			+ 3. Thứ ngày, tuần/ngày trong tháng, năm
			int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
			System.out.println("3. dowAsInt: " + dowAsInt);
			
			DayOfWeek[] dowAsEnum = DayOfWeek.values();
			System.out.println("3. dowAsTring: " + dowAsEnum[dowAsInt -1]);
			
			int womAsInt = c.get(Calendar.WEEK_OF_MONTH);
			
			
			
//			+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
			int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println("4. daysInMonth: " + daysInMonth);
			
//			+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
			GregorianCalendar gc = new GregorianCalendar();
			System.out.println("5. is leap year: " + gc.isLeapYear(year));
			
//			+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
			System.out.println("6. first day of week: " + dowAsEnum[c.getFirstDayOfWeek()]);
		
			
//			+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
//          ==> In ra danh sách các ngày trong tuần hiện tại  
			//c --> 08/07/2023
			c.set(2023, Calendar.AUGUST,3);
			int fdowAsInt = c.getFirstDayOfWeek();
			int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
			
			Calendar startDayOfWeek = Calendar.getInstance();
			startDayOfWeek.setTime(c.getTime());
			
			startDayOfWeek.add(Calendar.DAY_OF_MONTH,fdowAsInt - currentDowAsInt);
			df = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("7. first day of week as number: " + df.format(startDayOfWeek.getTime()));
			
			Calendar endDayOfWeek = Calendar.getInstance();
			endDayOfWeek.setTime(startDayOfWeek.getTime());
			endDayOfWeek.add(Calendar.WEEK_OF_MONTH ,1);
			
			System.out.println("start day of week -->" + df.format(startDayOfWeek.getTime()));
			System.out.println("end day of week -->" + df.format(endDayOfWeek.getTime()));
			
			for (Calendar running  = startDayOfWeek;
						running.before(endDayOfWeek);
							running.add(Calendar.DAY_OF_MONTH, 1)) {
				System.out.println("date --> " + df.format(running.getTime()));
			}
		
	}
}

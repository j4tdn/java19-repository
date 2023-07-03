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
		System.out.println("============= using date util ==============\n");
//      Lấy thông tin thời gian hiện tại với [timezone]
		// --> java.util.Date(dmy hms): --> demo những bài toán ngày tháng năm
		// --> java.util.Date: --> hết hết các function bị deprecated
		// : --> chỉ dùng để lưu trữ, xử lý chức năng --> dùng Calendar
		// --> java.sql.Date(dmy) : --> demo bài toán kết nối java với cơ sở dữ liệu
		Date date = new Date();
		System.out.println("date --> " + date);

		// int dayInMs = 24*60*60*1000;
		long dayInMs = TimeUnit.DAYS.toMillis(1);
		System.out.println("1day = " + dayInMs + "(ms)");

		Date dateFromEpochTime = new Date(dayInMs);
		System.out.println("dateFromEpochTime --> " + dateFromEpochTime);

		System.out.println("\n============= using calendar ==============\n");
		// design pattern: mẫu thiết kế
		// design pattern: singleton pattern
		// --> construction design pattern --> mẫu thiết kế để khởi tạo đối tượng
		// --> 1 class mình chỉ tạo ra 1 đối tượng duy nhất cho class đó

		// private constructor: tạo ra 0 đối tượng từ class --> util class
		// public constructor : tạo ra n đối tượng từ class

		// với calendar --> tại 1 thời điểm khởi tạo N đối tượng --> trả về chung 1 thời
		// gian
		// --> expect --> trả về chung 1 đối tượng

		// locale --> quyết định ngày đầu tiên trong tuần

		// SUNDAY = 1 --> MONDAY = 2 .... --> SATURDAY = 7
		// MONTH: JANUARY = 0; SEPTEMBER = 11 (JAVA01 - JAVA07)

		// Locale.setDefault(new Locale("vi", "VN"));
		// Calendar c = Calendar.getInstance(); // using default locale

		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(Calendar.DAY_OF_MONTH, 8);
		c.set(Calendar.MONTH, Calendar.JULY);

		System.out.println("c --> " + c);
		System.out.println("default locale: " + Locale.getDefault()); // en_US
		System.out.println("first day of week: " + c.getFirstDayOfWeek());

		// first day of week --> phụ thuộc vào configuration locale(language, country)
		// local-time UTC+7, no locale, set trong code, mặc định locale --> US

		// toString --> rất nhiều thông tin
		// --> cần lấy 1 vài thông tin --> factory design pattern
//		1. Ngày, Tháng, Năm
		// Calendar --> fields[n]
		// i = 0 -->
		// i = 1 --> YEAR
		// .................
		// i = 5 --> DAY OF MONTH

		// khi lấy 1 vài thông tin riêng lẻ để xử lý --> công thức --> c.get(field)
		// field = Calendar.#

		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH); // c.getDayOfMonth()
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String dmy = dayOfMonth + "/" + month + "/" + year;
		System.out.println("1. Ngày tháng năm --> " + dmy);

		// "27.05.2023" --> hiển thị
		// date, calendar --> xử lý

		// khi muốn in ra vài thông tin --> chuỗi --> format
		// SimpleDateFormat(string(display)-date(timeInMs)-calendar(timeInMs))
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); // day month year
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("formatted date: " + formatted);

//		2. Giờ 12-24, Phút, Giây
		df = new SimpleDateFormat("HH:mm:ss"); // hh --> clock 12
		System.out.println("formatted time: " + df.format(c.getTime()));

//		3. Thứ ngày, tuần/ngày trong tháng, năm
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("dowasString: " + dowAsEnum[dowAsInt - 1]);

//	    4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month: " + daysInMonth);

//		5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year: " + gc.isLeapYear(year));

//		6. Ngày đầu tiên trong tuần là thứ mấy với locale
		System.out.println("first day of week: " + dowAsEnum[c.getFirstDayOfWeek() - 1]);

//	    7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
//	       ==> In ra danh sách các ngày trong tuần hiện tại
		// c --> 08/07/2023

		c.set(2023, Calendar.AUGUST, 3);
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);

		Calendar startDayOfWeek = Calendar.getInstance();
		startDayOfWeek.setTime(c.getTime());

		startDayOfWeek.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("first day of week as number: " + df.format(startDayOfWeek.getTime()));

		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		// endDayOfWeek.add(Calendar.DAY_OF_MONTH, -1);

		System.out.println("start day of week --> " + df.format(startDayOfWeek.getTime()));
		System.out.println("end day of week --> " + df.format(endDayOfWeek.getTime()));

		// before <
		for (Calendar running = startDayOfWeek; running.before(endDayOfWeek); running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("date --> " + df.format(running.getTime()));
		}

	}
}
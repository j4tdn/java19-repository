package datetime;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

//Lấy thông tin thời gian hiện tại với [timezone]

// 1. Ngày, Tháng, Năm
// 2. Giờ 12-24, Phút, Giây
// 3. Thứ ngày, tuần/ngày trong tháng, năm
// 4. Đếm số ngày tháng, năm hiện tại >> Calendar
// 5. Kiểm tra năm hiện tại có phải năm nhuận không
// 6. Ngày đầu tiên trong tuần là thứ mấy với locale
// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy

public class Ex01DateTimeDemo{
	public static void main(String[] args) {
		// - java.util.Date(dmy hms) --> demo những bài toán ngày, tháng, năm
		// - java.util.Date : hầu hết các function bị deprecated
								// chỉ dùng để lưu trữ, xử lý chức năng --> dùng Calendar
		// - java.sql.Date(dmy) : demo bài toán kết nối với csdl
		
		System.out.println("================= using Date =============\n");
		
		Date date = new Date();
		System.out.println("date --> " + date);
		
//		int dayImMs = 24*60*60*1000;
		long dayImMs = TimeUnit.DAYS.toMillis(1);
		System.out.println("1 day = " + dayImMs +" (ms)");
		
		Date dateFromEpochTime = new Date(24*60*60*1000);
		System.out.println("dateFromEpochTime --> " + dateFromEpochTime);
		
		System.out.println("================= using Calendar =============\n");
		
		// design pattern : mẫu thiết kế
		
		// design pattern : singleton pattern
		// --> construction design pattern --> mẫu thiết kế để khởi tạo đối tượng
		// --> 1 class mình chỉ tạo ra 1 đối tượng duy nhất cho class đó
		
		// private constructor : tạo ra 0 đối tượng class --> util class
		// public constructor : tạo ra n đối tượng từu class
		
		// SUNDAY : 1 --> MONDAY: 2 ....
		// MONTH: 0(1) - 11(12) : january : 1, SEPTEMBER : 11
		
		// với calendar : tại 1 thời điểm khởi tạo n đối tượng -> trả về 1
						// --> expect --> trả về chung 1 đối tượng
		// locale : quyết định ngày đầu tiên trong tuần
//		Locale.setDefault(new Locale("vi","VN"));
		Calendar c = Calendar.getInstance(new Locale("vi","VN"));
		
		System.out.println("c --> " + c);
		
		System.out.println("default locale: " + Locale.getDefault() );
		System.out.println("first day of week: " + c.getFirstDayOfWeek() );
		
		// cần lấy 1 vài thông tin trong toString --> factory design pattern
		
		// Calendar --> values[n] 
		
		// Khi cần lấy 1 vài thông tin rieng lẻ để xử lý thfi dùng công thức --> c.get(field)
		// field = Calendar.#
		
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) +1;
		int year = c.get(Calendar.YEAR);
		
		System.out.println("dd/MM/yyyy: " + dayOfMonth +"/" + month +"/" + year );
		
		// khi muốn in ra vài thông tin --> Chuỗi --> format
		// SimpleDateFormat(string-date-calendar)
		
		// string hiển thị
		// date, calendar để xử lý
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a"); // day month year
		Date convertedDate = c.getTime();
		String formated = df.format(convertedDate);
		System.out.println("formated : " + formated);
		
		// first day of week --> phụ thuộc vào configuretion locale(language, country)
		// local-time UTC+7 , no locate, set trong code, mặc định locale --> Ú
		
		
		// 2. Giờ 12-24, Phút, giây
		df = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("fortmat tiem : " + df.format(c.getTime()));
		
		// Thứ ngày, tuần trong tháng, năm
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		
		DayOfWeek[] dowAsEnum = DayOfWeek.values();
		System.out.println("dowAsStrings : " + dowAsEnum[dowAsInt-1]);
		
//		String[] dowAsStrings = {"Sunday","Monday","Tuesday","Wednesday","Thursdau","Friday","Saturday"};
//		System.out.println("dowAsStrings : " + dowAsStrings[dowAsInt-1]);
		
		System.out.println("dowAsStrings : " + dowAsEnum[dowAsInt-1]);
		//4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.MONTH, Calendar.JULY);
		System.out.println("daysInMonth : " + daysInMonth);
		
		//5. Kiểm tra năm hiện tại có phải năm nhuận không
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year : " + gc.isLeapYear(year));
		
		// 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		System.out.println("first day of week : " + dowAsEnum[c.getFirstDayOfWeek()-1]);
		
		
		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// --> 8.07.2023
		c.set(2023, Calendar.AUGUST,3);
		
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		
		result.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("first day of week as number : " + df.format(result.getTime()));
		
		//8. In ra danh sách các ngày trong tuần hiện tại
		
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(result.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println("start day of week : " + df.format(result.getTime()));
		System.out.println("end day of week : " + df.format(endDayOfWeek.getTime()));
		
		for(Calendar running = result; running.before(endDayOfWeek);running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("date --> " + df.format(running.getTime()));
		}
	}
}

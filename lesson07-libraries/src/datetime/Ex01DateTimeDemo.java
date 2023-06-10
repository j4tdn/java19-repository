package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Ex01: 
	
	2. Giờ 12-24, Phút, Giây
	3. Thứ ngày, tuần/ngày trong tháng, năm
    4. Đếm số ngày tháng, năm hiện tại >> Calendar
	5. Kiểm tra năm hiện tại có phải năm nhuận không
	6. Ngày đầu tiên trong tuần là thứ mấy với locale
    7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
  ==> In ra danh sách các ngày trong tuần hiện tại 

 */
public class Ex01DateTimeDemo  {
	public static void main(String[] args) {
		// Lấy thông tin thời gian hiện tại với [timezone]
		// --> java.util.Date (dmy hms):  --> Demo những bài toán ngày tháng năm
		//							   : hầu hết các function bị deprecated
		//							 --> chỉ dùng để lưu trữ, xử lí chức năng --> dùng Calendar.
		
		// --> java.sql.Date  (dmy)    :  --> demo những bài toán kết nối java với database.
		System.out.println("========= Using Date ========\n");
		Date date = new Date();
		System.out.println("date --> " + date);
		
		
		// int dayInMs = 24*60*60*1000;
		 long dayInMs = TimeUnit.DAYS.toMillis(1);
		System.out.println("1 day = " + dayInMs + " (ms)");
		
		Date dateFromEpochTime = new Date(24*60*60*1000);
		System.out.println("dateFromEpochTime --> " + dateFromEpochTime);
		
		
		
		System.out.println("\n========= Using Calendar ========\n");
		
		
		// design pattern: singleton pattern
		// design pattern: mẫu thiết kế
		// --> construction design pattern --> mẫu thiết kế để khởi tạo đối tượng
		// --> 1 class mình chỉ tạo ra 1 đối tượng duy nhất cho class đó.
		
		// private constructor: tạo ra 
		// public constructor : tạo ra n đối tượng từ class
		
		// vói Calendar --> tại 1 thời điểm khởi tạo N đối tượng --> trả về chung 1 thời gian
		//				--> expected --> trả về chung 1 đối tượng
		
//		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		
		
		System.out.println("c --> " + c);
		
		System.out.println("default locale: " + Locale.getDefault()); // en_US
		
		System.out.println("first day of week --> " + c.getFirstDayOfWeek());
		
		// first day of week  -->  phụ thuộc vào configuration locale(language, country)
		// local-time UTC+7, no locale, set trong code, default locale --> US
		
		// 1. Ngày, Tháng, Năm
		
		// Khi cần lấy 1 vài thông tin riêng lẻ để xử lý --> c.get(field)
		// field = Calendar.#
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		String dmy = dayOfMonth + "/" + month + "/" + year;
		System.out.println("1. Ngày, Tháng, Năm --> " + dmy);
		
		
		// SimpleDateFormat(string-date-calendar)
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("formatted --> " + formatted);
		
		
		
		
		
		
	} 
}

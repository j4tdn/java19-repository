package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DateTimeDemo {

	public static void main(String[] args) {
//	Date trong java.util --> bài toán ngày tháng năm (dmy hms)
		// java.util.Date --> hầu hết các hàm bị deprecated
		// --> chỉ dùng lưu trữ
		// để xừ lí chức năng --> Calendar
//	java.sql.Date (dmy)--> bài toán kết nối Java với Database
		
		//device time
		Date date = new Date();
		System.out.println("date -->" + date);
		
		//int dayInMs = 24*60*60*1000;
		long dayInMs = TimeUnit.DAYS.toMillis(1);
		System.out.println("1 day -->" + dayInMs + "ms");
		
		//date from epoch time
		Date dateFromEpochTime = new Date(24*60*60*1000);
		System.out.println("dateFromEpochTime -->" + dateFromEpochTime);
		
		//Calendar:
		System.out.println("\n=====Using Calendar======\n");
		//design pattern: mẫu thiết kế
		//design pattern: singleton pattern
		// --> construction design pattern --> mẫu thiết kế để khởi tạo đối tượng
		// --> 1 class: chỉ tạo 1! obj cho class đó
		
		//private constructor: tạo ra 0 obj từ class --> util class
		//public constructor: tạo ra n obj từ class
		
		//với Calendar: tại 1 thời điểm khởi tạo N obj --> trả về chung 1 thời gian
		//	expect: trả về chung 1 obj
		
		//Locale.setDefault(new Locale("vi", "VN"));
//		Calendar c = Calendar.getInstance(); 
		
//		Locale: quyết định 1st ngày trong tuần
//		MONTH: JANUARY 0(1) -11(12) : JAVA 01- JAVA 07

		Calendar c = Calendar.getInstance(new Locale("vi","VN")); 
		System.out.println("c -->" + c);
		System.out.println("default locale: " + Locale.getDefault()); //en_US
		System.out.println("first date of week: " + c.getFirstDayOfWeek()); //1 --> SUNDAY

		System.out.println("default locale: " + Locale.getDefault()); //en_US
		System.out.println("first date of week: " + c.getFirstDayOfWeek()); //1 --> SUNDAY
		
//		toString --> rất nhiều thông tin
//		Lấy 1 vài thông tin --> factory design pattern
//		1. Ngày, tháng, năm
//		Calendar --> fields[n]
//		i = 0 -->
//		i = 1 -->
//		i = 5 -->	DAY OF MONTH
		
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		//int dayOfMonth = c.get(5); // Calendar.DAY_OF_MONTH = 5
		
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String dmy = dayOfMonth + "/" + month + "/" + year;
		System.out.println("dmy -> " + dmy);
		
//		Khi cần lấy 1 vài thông tin riêng lẻ để xử lí --> c.get(field);
//		field = Calendar.#
//		Khi muốn in ra vài thông tin dạng chuỗi --> format
//		SimpleDateFormat(string-date(timeInMs)-calendar(timeInMs))
//		Con của DateFormat
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a"); //day month year
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("formatted: " + formatted);
		
	}

}

package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DateTimeDemo {
public static void main(String[] args) {
	// java.util.Date -> những bài toán ngày tháng năm
	// java.util.Date -> hầu hết các function bị deprecated
	// 				  -> chỉ dùng để lưu trữ, xử lý chức năng -> dùng Calendar
	// java.sql.Date -> bài toán kết nối java với database
	Date date = new Date();
	System.out.println("date -> " + date);
	
	long dayInMs = TimeUnit.DAYS.toMillis(1);
	System.out.println("1day " + dayInMs + "(ms)");
	
	Date dateFromEpochTime = new Date(0);
	System.out.println("dateFromEpochTime -> " + dateFromEpochTime);
	
	System.out.println("\n============== unsing calendar ================\n");
	// design pattern: singleton pattern
	// design pattern: mẫu thiết kế
	// construction design pattern -> mẫu thiết kế để khởi tạo đối tượng
	// 1 class mình chỉ tạo ra 1 đối tượng duy nhất cho class đó
	// private constructor: tạo ra 0 đối tượng từ class -> util class
	// public constructor: tạo ra n đối tượng từ class 
	// với calendar -> tại 1 thời điểm khởi tạo n đối tượng -> trả về chung 1 thời gian 
	//              -> trả về chung 1 đối tượng 
	
	
 	Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
 	System.out.println("c -> " + c);
 	System.out.println("default locale: " + Locale.getDefault());//en_US
 	System.out.println("first day of week: " + c.getFirstDayOfWeek());
	
	
//	+ 1. Ngày, Tháng, Năm
 	
 	// Khi cần lấy 1 vài thông tin riêng lẻ để xử lý -> công thức 
 	// -> c.get.(field)
 	// field = Calendar
 	int dayofMonth = c.get(Calendar.DAY_OF_MONTH);
 	int month = c.get(Calendar.MONTH) + 1;
 	int year = c.get(Calendar.YEAR);
 	String dmy = dayofMonth + "/" + month + "/" + year;
 	System.out.println(dmy);
 	
 	// khi muốn in ra vài thông tin -> chuỗi -> format
 	// SimpleDateFormat(string-date(timeInMs)-calendar(timeInMs))
 	
 	DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
 	Date convertedDate = c.getTime();
 	String formatted = df.format(convertedDate);
 	System.out.println("formatted -> " + formatted);
 	
 	
//	
//	+ 2. Giờ 12-24, Phút, Giây
//	+ 3. Thứ ngày, tuần/ngày trong tháng, năm
//  + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
//	+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
//	+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
//  + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
	 
}
}

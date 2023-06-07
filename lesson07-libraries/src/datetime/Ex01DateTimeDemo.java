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
//		Lấy thông tin thời gian hiện tại với [timezone]
		// --> java.util.Date(dmy ): --> demo những bài toán ngày tháng năm
		//--> java.sql.Date(dmy) : --> demo bai toan ket noi sql voi csdl
		
		
		Date date = new Date();
		System.out.println("date -->" + date);
		
		//int dayInms = 4*60*60*1000;
		long dayInms = TimeUnit.DAYS.toMillis(1);
		System.out.println("1day " + dayInms);
		
		
		Date dateFromEpochTime = new Date(dayInms);
		System.out.println("dataFromEpochTime" + dateFromEpochTime);
		
		System.out.println("\n===================\n");
		//design patten: mẫu thiết kế
		//use design patten singleton pattern
		//contruction design pattern mẫu thiết kế để tạo đối tượng
		// một class mình chỉ tạo ra một đối tượng duy nhất cho class đó
		//private contructor --> tạo ra 0 đối tượng từ class --> util class
		//public contructor --> tạo ra n đối tượng từ class
		
		//voi calendar --> tại một thời điểm tạo ra một đối tuowjgng --> trả về n đối tượng
					// 	--> expect tr 
		
		
		//Locale.setDefault(Locale.CHINA);
		Calendar c = Calendar.getInstance(new Locale("vi","VN"));
		System.out.println("c -->" + c);
		// --> tostring co rat nhieeu thong tin
		// --> can lay mot vai thong tin --> lay theo style --> factory design pattern
		//1. ngay/thang/nam
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("dayOfMonth " + dayOfMonth + " month " + month + " year " + year);
		
		//khi muon i ra vai thong tin --> chuoi --> format
		//SimpleDateFormat(String(display)- date(timeInMs)-calendar(timeInMs))
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
		Date convertDate = c.getTime();
		String formated = df.format(convertDate);
		System.out.println("ngaythangnam -->" + formated);
		
		//calendar --> values[n]
		// i = 0 --> 
		//i = 1 --> 
		//i = 5 --> DAY_OF_MONTH
		
		System.out.println("locale "+  Locale.getDefault());
		System.out.println("first day of week "+ c.getFirstDayOfWeek());
		
		//locale sẽ tác động đến first date of week
		
		//2. Giờ 12-24, phút, giây
		df = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("Formatted time: " + df.format(c.getTime()));
		System.out.println("\n======================\n");
		//3. thứ ngày, tuần/ngày trong thắng năm
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: "+ dowAsInt);
		//String [] dowAsStrings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday"};
		DayOfWeek [] dowAsEnum = DayOfWeek.values();
		System.out.println("dowAsStrings: " + dowAsEnum[dowAsInt-1]);
		System.out.println("\n======================\n");
		
		
		
			
	    //4. Đếm số ngày ,tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(daysInMonth);
		System.out.println("\n======================\n");
		//5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year: " + gc.isLeapYear(year));
		System.out.println("\n======================\n");
		
		//6. Ngày đầu tiên trong tuần là thứ mấy với locale
		System.out.println("first day of week: " + dowAsEnum[c.getFirstDayOfWeek() - 1]);
		System.out.println("\n======================\n");
		//7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// ==> In ra danh sách các ngày trong tuần hiện tại   
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
		Calendar startDayOfWeek = Calendar.getInstance();
		startDayOfWeek.setTime(c.getTime());
		
		startDayOfWeek.add(Calendar.DAY_OF_MONTH,fdowAsInt -  currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("first day of week as number: "+ df.format(startDayOfWeek.getTime()));
		
		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		System.out.println("end day of week as number: "+ df.format(endDayOfWeek.getTime()));
		
		for(Calendar running = startDayOfWeek; 
				running.before(endDayOfWeek);
				running.add(Calendar.DAY_OF_WEEK, 1)){
					System.out.println("date -->"+ df.format(running.getTime()));
				}
		
	}
}

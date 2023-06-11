package exercises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {
public static void main(String[] args) {
	DateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	//1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	String now = df.format(Calendar.getInstance().getTime());
	
	//2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	//3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	cal.setFirstDayOfWeek(Calendar.MONDAY);
	cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
	String firstDayOfWeek = df.format(cal.getTime());
	cal.add(Calendar.DAY_OF_WEEK, 6);
	String lastDayOfWeek = df.format(cal.getTime());
	
	//4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	int WeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
	
	
	
	
	
	
	
	
	System.out.println("Thời gian hiện tại -> " + now);
	System.out.println("Ngày cuối cùng của tháng hiện tại là -> " + lastDayOfMonth);
	System.out.println("Ngày đầu tiên và ngày cuối cùng của tuần hiện tại -> " + firstDayOfWeek + ", " + lastDayOfWeek);
	System.out.println("Ngày hiện tại đang ở tuần thứ " + WeekOfYear + " trong năm");
	System.out.println(TwentyDayLater());
	DayULived();
}

//5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
private static String TwentyDayLater() {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 20);
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
	String dayofweek = "";
	String result = "";
	switch(dayOfWeek) {
	case Calendar.SUNDAY:
		dayofweek = "Chủ Nhật";
		break;
	case Calendar.MONDAY:
		dayofweek = "Thứ Hai";
		break;
	case Calendar.TUESDAY:
		dayofweek = "Thứ Ba";
		break;
	case Calendar.WEDNESDAY:
		dayofweek = "Thứ Tư";
		break;
	case Calendar.THURSDAY:
		dayofweek = "Thứ Năm";
		break;
	case Calendar.FRIDAY:
		dayofweek = "Thứ Sáu";
		break;
	case Calendar.SATURDAY:
		dayofweek = "Thứ Bảy";
		break;
}
	return result = "20 ngày sau là ngày " + dayOfMonth + ", " +  dayOfWeek;
	

}

//6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
private static void DayULived() {
	Scanner ip = new Scanner(System.in);
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	Calendar now = Calendar.getInstance();
	System.out.println("Nhập ngày tháng năm sinh của bạn ");
	String yourBirthDay = ip.nextLine();
	try {
		Date dayFormat = df.parse(yourBirthDay);
		cal.setTime(dayFormat);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	long ageInMillis = now.getTimeInMillis() - cal.getTimeInMillis();
	long ageInDay = ageInMillis / (24*60*60*1000);
	System.out.println("Bạn đã sống được " + ageInDay + " ngày");
}
}

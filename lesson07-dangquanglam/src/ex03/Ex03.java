package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//	Viết chương trình, mỗi chức năng một phương thức
//	1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Calendar c = Calendar.getInstance();
		Date convertedDate = c.getTime();
		String formatted = df.format(convertedDate);
		System.out.println("Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ: " + formatted);

		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).

		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar lastDayOfMonth = Calendar.getInstance();
		lastDayOfMonth.setTime(c.getTime());
		lastDayOfMonth.set(Calendar.DAY_OF_MONTH, lastDay);
		System.out.println("In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy): " + df.format(lastDayOfMonth.getTime()));

		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);

		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());

		result.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE"); // hh: clock 12
		System.out.println("Xem ngày đầu tiên của tuần hiện tại: " + df.format(result.getTime()));

		Calendar endOfWeek = Calendar.getInstance();
		endOfWeek.setTime(result.getTime());
		endOfWeek.add(Calendar.DAY_OF_MONTH, 6);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("Xem ngày cuối cùng của tuần hiện tại: " + df.format(endOfWeek.getTime()));

//	4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		System.out.println("Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ: " + formatted);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Ngày hiện tại đang ở tuần thứ " + weekOfYear + " trong năm.");

		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		Calendar days = Calendar.getInstance();
		days.setTime(c.getTime());
		days.add(Calendar.DAY_OF_MONTH, 20);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		System.out.println("Kiểm tra sau 20 ngày nữa là ngày nào: " + df.format(days.getTime()));

//	6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày sinh của bạn (dd/MM/yyyy): ");
        String inputDateString = sc.nextLine();
        
//		String inputDateString = "28/11/2000";

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date inputDate = dateFormat.parse(inputDateString);
            Calendar inputCalendar = Calendar.getInstance();
            inputCalendar.setTime(inputDate);
            Calendar nowCalendar = Calendar.getInstance();

            long diffInMillis = nowCalendar.getTimeInMillis() - inputCalendar.getTimeInMillis();
            long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);

            System.out.println("Số ngày sống của bạn là: " + diffInDays);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
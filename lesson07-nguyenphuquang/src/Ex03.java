import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * Bài 3: Viết chương trình, mỗi chức năng một phương thức 1. Xem thời gian hiện
 * tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. 2. In ngày cuối cùng của tháng hiện
 * tại (dd/MM/yyyy). 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. 4. Xem
 * ngày hiện tại đang ở tuần thứ mấy trong năm. 5. Kiểm tra sau 20 ngày nữa là
 * ngày nào, thứ mấy. 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống
 * được bao nhiêu ngày.
 * 
 * @author Admin
 *
 */
public class Ex03 {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private static DateFormat ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");
	private static DateFormat ddMMyyyyEEEE = new SimpleDateFormat("dd/MM/yyyy EEEE");
	private static Date birthdate = null;

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("input timezone");
		int timezone = 0;
		try {
			timezone = Integer.parseInt(ip.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("Enter your Birthday dd/MM/yyyy");

			try {
				birthdate = ddMMyyyy.parse(ip.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Enter birthday again");
				continue;
			}
		}

		ip.close();
		System.out.println("1. Current time: " + time(timezone));
		System.out.println("2. Last day of this month: " + endDayOfMonth());
		System.out.println("3. First and Last day of this week: " + firstAndEndDayOfWeek());
		System.out.println("4. Week " + weekOfYear() + " of this year");
		System.out.println("5. After 20 days will be:  " + after20Days());
		System.out.println("6. You have been living for " + liveFor() + " days");
	}

	public static String time(int timezone) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, -7 + timezone); // VN is +7 GMT
		return df.format(c.getTime());
	}

	public static String endDayOfMonth() {
		Calendar c = Calendar.getInstance();
		Calendar today = (Calendar) c.clone();
		Calendar endOfMonth = (Calendar) c.clone();
		int endOfMonthGap = today.getActualMaximum(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_MONTH);
		endOfMonth.add(Calendar.DAY_OF_MONTH, endOfMonthGap);
		return ddMMyyyy.format(endOfMonth.getTime());
	}

	public static String firstAndEndDayOfWeek() {
		Calendar c = Calendar.getInstance();
		Calendar today = (Calendar) c.clone();
		Calendar endOfWeek = (Calendar) c.clone();
		Calendar beginOfWeek = (Calendar) c.clone();
		int endOfWeekGap = 7 - today.get(Calendar.DAY_OF_WEEK) + 1;
		endOfWeek.add(Calendar.DAY_OF_WEEK, endOfWeekGap);
		beginOfWeek.add(Calendar.DAY_OF_WEEK, -today.get(Calendar.DAY_OF_WEEK) + 2);
		return "\nBegin: " + ddMMyyyyEEEE.format(beginOfWeek.getTime()) + "\nEnd: "
				+ ddMMyyyyEEEE.format(endOfWeek.getTime());
	}

	public static int weekOfYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	public static String after20Days() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 20);
		return ddMMyyyyEEEE.format(c.getTime());
	}

	public static double liveFor() {
		Calendar c = Calendar.getInstance();

		Date todate = c.getTime();

		double livingTime = (todate.getTime() - birthdate.getTime()) / 1000 / 60 / 60 / 24;
		return livingTime;
	}

}

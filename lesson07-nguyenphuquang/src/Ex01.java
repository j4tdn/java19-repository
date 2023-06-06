import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Bài 1: Xây dựng ứng dụng The Ultimate Relationship Calculator  Nhập thời
 * gian bắt đầu hẹn hò của 2 người.  Nếu đã chia tay, nhập ngày chia tay ngược
 * lại lấy thời gian hiện tại  Nhấn Enter để thực hiện tính toán. Hỏi  Ngày
 * bắt đầu hẹn họ là ngày thứ mấy.  Mối tình đã bắt đầu được bao nhiêu năm,
 * tháng, ngày, giờ, phút, giây
 */
public class Ex01 {
	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DateFormat weekDay = new SimpleDateFormat("EEEE");
		Calendar c = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);
		Date startDate = null;
		Date endDate = null;
		System.out.println("input start date and time dd/MM/yyyy HH:mm:ss");
		try {
			startDate = df.parse(ip.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("input end date and time dd/MM/yyyy HH:mm:ss\nIf no end day, press Enter");
		String input = ip.nextLine();
		if (input == "") {
			endDate = c.getTime();
		} else {

			try {
				endDate = df.parse(input);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Dating from " + df.format(startDate) + " to " + df.format(endDate));
		System.out.println("1st dating day is " + weekDay.format(startDate));
		System.out.println("time in love (s): " + (endDate.getTime()-startDate.getTime())/1000);
		System.out.println("time in love (min): " + (endDate.getTime()-startDate.getTime())/1000/60);
		System.out.println("time in love (h): " + (endDate.getTime()-startDate.getTime())/1000/60/60);
		System.out.println("time in love (days): " + (double)(endDate.getTime()-startDate.getTime())/1000/60/60/24);
		System.out.println("time in love (months): " + (double)(endDate.getTime()-startDate.getTime())/1000/60/60/24/30);
		System.out.println("time in love (years): " + (double)(endDate.getTime()-startDate.getTime())/1000/60/60/24/365);
	}
}

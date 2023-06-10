package localdatetime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		date.setDate(10);
		date.setHours(12);

		// mẫu đơn
		// đảm bảo chỉ tạo 1 thể hiện từ lớp
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2022);

		LocalDate ldate = LocalDate.now()
				.withYear(2023)
				.withMonth(9);
//		System.out.println("h1x : " + System.identityHashCode(ldate));
//
//		ldate = ldate.withYear(2024);
//		System.out.println("h2x : " + System.identityHashCode(ldate));
//		
		System.out.println("Date : " +ldate);

	}

}

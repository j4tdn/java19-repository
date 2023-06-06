import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Bài 4: Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu
 * cầu thực hiện các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7,
 * Chủ nhật được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện
 * 110 ngày, không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển
 * dự án. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 * 
 * @author Admin
 *
 */
public class Ex04 {

	public static DateFormat ddMM = new SimpleDateFormat("dd.MM");
	public static DateFormat ddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");

	public static void main(String[] args) {
		Calendar[] holiday = holiday();
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 7);
		int duration = 110;
		while (duration-- > 0) {
			for (Calendar holi:holiday) {
				
			if (c.get(Calendar.DAY_OF_YEAR) == holi.get(Calendar.DAY_OF_YEAR)) {
				c.add(Calendar.DAY_OF_YEAR, 1);
				break;
			}
			
			if (c.get(Calendar.DAY_OF_WEEK) == 6 || c.get(Calendar.DAY_OF_WEEK) == 7) {
				c.add(Calendar.DAY_OF_YEAR, 1);
				break;
			}
			
			}
			c.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println("Deadline for project is: " + ddMMyyyy.format(c.getTime()));
	}

	public static Calendar[] holiday() {
		Calendar temp = Calendar.getInstance();
		String[] holiday = { "01.01", "30.4", "1.5", "2.9", "10.10" };
		Date[] convertedDate = new Date[holiday.length];
		Calendar[] calendarHoliday = new Calendar[holiday.length];
		int running = 0;
		for (String holi : holiday) {

			try {
				convertedDate[running++] = ddMM.parse(holi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		running = 0;
		for (Date date : convertedDate) {
			temp.setTime(date);
			calendarHoliday[running++] = (Calendar)temp.clone();
		}
		return calendarHoliday;
	}
}

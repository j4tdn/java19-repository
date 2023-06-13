package view;

import java.util.Calendar;

import common.VietnameseHoliday;
import utils.DateUtils;

/**
 * Problem: Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu
 * cầu thực hiện các chức năng của dự án trong vòng 110 ngày. Biết rằng thứ 7,
 * chủ nhật được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện
 * 110 ngày Không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển
 * dự án Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */

public class FindDeadlineDate {
	private static final int BUDGET = 110;

	public static void main(String[] args) {

		Calendar calendar = DateUtils.getInstance(7, Calendar.JUNE, 2022);
		int implementedDates = 0;
		while (true) {
			int weekday = calendar.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekday == Calendar.SATURDAY 
					|| weekday == Calendar.SUNDAY 
					|| DateUtils.isHoliday(calendar, VietnameseHoliday.getVneseHolidays()));
			if (!isDayOff) {
				implementedDates++;
				if(implementedDates == BUDGET) break;
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("deadline: " + DateUtils.format("dd/MM/yyyy", calendar));
	}
}

// Deadline: 9 Nov 2022
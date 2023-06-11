package ex04;

import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		calendar.set(2022, Calendar.JUNE, 7);

		int projectDuration = 110;

		Calendar deliveryDate = calculateDeliveryDate(calendar, projectDuration);

		int year = deliveryDate.get(Calendar.YEAR);
		int month = deliveryDate.get(Calendar.MONTH) + 1; 
		int day = deliveryDate.get(Calendar.DAY_OF_MONTH);
		System.out.println("Ngày bàn giao sản phẩm: " + day + "/" + month + "/" + year);
	}

	private static Calendar calculateDeliveryDate(Calendar startDate, int duration) {
		int remainingDays = duration;

		Calendar currentDate = (Calendar) startDate.clone();
		while (remainingDays > 0) {
			currentDate.add(Calendar.DAY_OF_MONTH, 1);

			int dayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
				if (!isPublicHoliday(currentDate)) {
					remainingDays--;
				}
			}
		}

		return currentDate;
	}

	private static boolean isPublicHoliday(Calendar date) {


		return false; 
	}

}

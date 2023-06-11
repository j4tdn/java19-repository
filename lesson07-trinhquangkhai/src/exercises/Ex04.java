package exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04 {
public static void main(String[] args) {
	LocalDate startday = LocalDate.of(2022, 6, 7);
	LocalDate deadline = startday.plusDays(110);
	int count = 0;
	while(true) {
		if(deadline.getDayOfWeek() == DayOfWeek.SATURDAY || deadline.getDayOfWeek() == DayOfWeek.SUNDAY) {
		deadline = deadline.plusDays(1);
		}else {
			count++;
			if(count == 110) {
				break;
			}
			deadline = deadline.plusDays(1);
			}
		break;
		}
	System.out.println("Ngày " + deadline + " nhóm A sẽ phải bàn giao cho khách hàng B");
	}
	
}


import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập tuổi của bạn: ");
	int age = ip.nextInt();
	System.out.println("Nhập thời gian đã ngủ trong ngày");
	System.out.println("Số giờ: ");
	int sleephour = ip.nextInt();
	System.out.println("Số phút: ");
	int sleepminute = ip.nextInt();
	System.out.println("Nhập thời gian bắt đầu ngủ: ");
	int sleeptime = ip.nextInt();
	
	
	int averagerhour = 0;
	int totalSleepMinutes = sleephour * 60 + sleepminute; 

	if(age > 1 && age < 3) {
		averagerhour = 20;
		System.out.println("trung bình giờ ngủ: " + averagerhour + " H");
		int remainingSleepMinutes = averagerhour * 60 - totalSleepMinutes;
		int wakeupTimeMinutes = (sleeptime * 60 + remainingSleepMinutes) % 1440;
		int wakeupHour = wakeupTimeMinutes / 60;
		int wakeupMinute = wakeupTimeMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeupHour + "H" + wakeupMinute);
	}else if (age > 4 && age < 13) {
		averagerhour = (10 + 12)/2;
		System.out.println("trung bình giờ ngủ: " + averagerhour + " H");
		int remainingSleepMinutes = averagerhour * 60 - totalSleepMinutes;
		int wakeupTimeMinutes = (sleeptime * 60 + remainingSleepMinutes) % 1440;
		int wakeupHour = wakeupTimeMinutes / 60;
		int wakeupMinute = wakeupTimeMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeupHour + "H" + wakeupMinute);
	}else if(age > 14 && age < 17) {
		averagerhour = (17 + 14)/2;
		System.out.println("trung bình giờ ngủ: " + averagerhour + " H");
		int remainingSleepMinutes = averagerhour * 60 - totalSleepMinutes;
		int wakeupTimeMinutes = (sleeptime * 60 + remainingSleepMinutes) % 1440;
		int wakeupHour = wakeupTimeMinutes / 60;
		int wakeupMinute = wakeupTimeMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeupHour + "H" + wakeupMinute);
	}else if(age > 18 && age < 64) {
		averagerhour = (61 + 18)/2;
		System.out.println("trung bình giờ ngủ: " + averagerhour + " H");
		int remainingSleepMinutes = averagerhour * 60 - totalSleepMinutes;
		int wakeupTimeMinutes = (sleeptime * 60 + remainingSleepMinutes) % 1440;
		int wakeupHour = wakeupTimeMinutes / 60;
		int wakeupMinute = wakeupTimeMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeupHour + "H" + wakeupMinute);
	}else if(age == 65) {
		averagerhour = (8 + 7)/2;
		System.out.println("trung bình giờ ngủ: " + averagerhour + " H");
		int remainingSleepMinutes = averagerhour * 60 - totalSleepMinutes;
		int wakeupTimeMinutes = (sleeptime * 60 + remainingSleepMinutes) % 1440;
		int wakeupHour = wakeupTimeMinutes / 60;
		int wakeupMinute = wakeupTimeMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeupHour + "H" + wakeupMinute);
	}
}

}

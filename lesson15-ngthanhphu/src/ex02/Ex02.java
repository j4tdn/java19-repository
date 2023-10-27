package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your current age: " );
		int age = scanner.nextInt();
		
		System.out.println("Enter the time you slept during the day: ");
		int sleepHours = scanner.nextInt();
        int sleepMinutes = scanner.nextInt();
        
        System.out.println("Enter the time start to sleep: ");
        int startHourSleep = scanner.nextInt();
        int startMinuteSleep = scanner.nextInt();
        
        calTimeWakeUp(age, sleepHours, sleepMinutes, startHourSleep, startMinuteSleep);
        
        
		
	}
	
	public static void calTimeWakeUp(int age, int sleepHours, int sleepMinutes,int startHourSleep, int startMinuteSleep) {
		
		int wakeUpHours = 0;
		int wakeUpMinutes = 0;
		int timeWakeUpHour = 0;
		int timeWakeUpMinute = 0;
		
		
		
		if (age >= 1 && age <= 3) {
            wakeUpHours = 20;
        } else if (age >= 4 && age <= 13) {
            wakeUpHours = 11;
        } else if (age >= 14 && age <= 17) {
            wakeUpHours = 9;
        } else if (age >= 18 && age <= 64) {
            wakeUpHours = 8;
        } else if (age >= 65) {
            wakeUpHours = 7;
            wakeUpHours = 30;
        } else {
            System.out.println("Tuổi không hợp lệ");
            System.exit(0);
        }
		
		wakeUpHours = wakeUpHours - sleepHours;
		if(wakeUpMinutes > sleepMinutes ) {
			wakeUpMinutes = wakeUpMinutes - sleepMinutes;
		}else {
			wakeUpMinutes = 60 - sleepMinutes;
			wakeUpHours = wakeUpHours -1;
		}
		
		timeWakeUpHour = startHourSleep + wakeUpHours;
		timeWakeUpMinute = startMinuteSleep + wakeUpMinutes;
		if (timeWakeUpMinute > 60) {
			timeWakeUpMinute = timeWakeUpMinute - 60;
			timeWakeUpHour = timeWakeUpHour + 1;
		}
		if (timeWakeUpHour >= 24) {
			timeWakeUpHour = timeWakeUpHour - 24;
		}
		
		System.out.println("TimeNeedWakeUp --> " +timeWakeUpHour + "H" + timeWakeUpMinute + "P");
		
	}
}

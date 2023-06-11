package builder;

public class Java20DateTime {
     private int year;
     private int moth;
     private int day;
     private int hour;
     private int minute;
     private int second;
     
     public Java20DateTime() {
	}
     
     public static Java20DateTime of() {
    	 return new Java20DateTime();
     }

	public int getYear() {
		return year;
	}

	public Java20DateTime withYear(int year) {
		this.year = year;
		return this;
	}

	public int getMoth() {
		return moth;
	}

	public Java20DateTime withMoth(int moth) {
		this.moth = moth;
		return this;

	}

	public int getDay() {
		return day;
	}

	public Java20DateTime withDay(int day) {
		this.day = day;
		return this;

	}

	public int getHour() {
		return hour;
	}

	public Java20DateTime withHour(int hour) {
		this.hour = hour;
		return this;

	}

	public int getMinute() {
		return minute;
	}

	public Java20DateTime withMinute(int minute) {
		this.minute = minute;
		return this;

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Java20DateTime [year=" + year + ", moth=" + moth + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + "]";
	}
     
}

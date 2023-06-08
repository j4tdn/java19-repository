package Builder;

public class Java20DateTime {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	
	//private constructor
	private Java20DateTime() {
		// TODO Auto-generated constructor stub
	}
	
	public static Java20DateTime of() {
		return new Java20DateTime();
	}

	public int getYear() {
		return year;
	}

	//setter replaced by "with":
//	return Java20DateTime
	
	public Java20DateTime withYear(int year) {
		this.year = year;
		return this;
	}

	public int getMonth() {
		return month;
	}

	public Java20DateTime withMonth(int month) {
		this.month = month;
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

	public Java20DateTime withSecond(int second) {
		this.second = second;
		return this;
	}

	@Override
	public String toString() {
		return "Java20DateTime [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute="
				+ minute + ", second=" + second + ", getYear()=" + getYear() + ", getMonth()=" + getMonth()
				+ ", getDay()=" + getDay() + ", getHour()=" + getHour() + ", getMinute()=" + getMinute()
				+ ", getSecond()=" + getSecond() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}

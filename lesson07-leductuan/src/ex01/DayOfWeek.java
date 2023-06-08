package ex01;

public enum DayOfWeek {
	SUNDAY("Chủ nhật"), MONDAY("Thứ hai"), TUESDAY("Thứ ba"), WEDNESDAY("Thứ tư"), THURSDAY("Thứ năm"),
	FRIDAY("Thứ sáu"), SATURDAY("Thứ bảy");

	private String text;

	DayOfWeek(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text;
	}
}

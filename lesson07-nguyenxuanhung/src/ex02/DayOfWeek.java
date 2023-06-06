package ex02;

public enum DayOfWeek {

	SUNDAY("Chủ Nhật"), MONDAY("Thứ Hai"), TUESDAY("Thứ Tư"), 
	WEDNESDAY("Thứ Tư"), THURSDAY("Thứ Năm"), FRIDAY("Thứ Sáu"), 
	SATURDAY("Thứ Bảy");
	
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

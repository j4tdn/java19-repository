package datetime;

public enum DayOfWeek {
	 //DayOfWeek MONDAY = new DayOfWeek();
	// MONDAY la bien, dong thoi cung la gia tri cua enum
	// khong the khoi tao them phan tu, gia tri moi cho enum ben ngoai
	// mac dinh private constructor
	SUNDAY("Chủ nhật"), MONDAY("Thứ hai"), TUESDAY("Thứ ba"),
	WEDNESDAY("Thứ tư"), THURSDAY("Thứ năm"), FRIDAY("Thứ sáu"), SATURDAY("Thứ bảy");
	
	private String text;
	
	private DayOfWeek(String text) {
		this.text = text;
	}
	public String getText() {
		return this.text;
	}
}

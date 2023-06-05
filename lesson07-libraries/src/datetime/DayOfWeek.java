package datetime;

public enum DayOfWeek {
	//	DayOfWeek MONDAY = new DayOfWeek();
//	DayOfWeek MONDAY = new DayOfWeek("Thứ Hai")
//	MONDAY là biến, cũng là giá trị của enum
//	Ko thể khởi tạo thêm phần tử, giá trị cho enum bên ngoài
//	Mậc định là private constructor
	SUNDAY("Chủ Nhật"),
	MONDAY("Thứ 2"),
	TUESDAY("Thứ 3"),
	WEDNESDAY("Thứ 4"),
	THURSDAY("Thứ 5"),
	FRIDAY("Thứ 6"),
	SATURDAY("Thứ 7");
	
	private String text;
	
	private DayOfWeek() {
		// TODO Auto-generated constructor stub
	}

	DayOfWeek(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
	
	
	

}

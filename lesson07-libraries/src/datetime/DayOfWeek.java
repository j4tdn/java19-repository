package datetime;

public enum DayOfWeek {
/**
 * KDL obj, cho phép chứa tập hợp các phần tử thường ko đổi
 * vd	: 	Error code	--> Internal, Success, NotFound
 * 		:	Status		-->	Success, Fail, Sending
 */
//	DayOfWeek MONDAY = new DayOfWeek();
//	DayOfWeek MONDAY = new DayOfWeek("Thứ Hai")
//	MONDAY là biến, cũng là giá trị của enum
//	Ko thể khởi tạo thêm phần tử, giá trị cho enum bên ngoài
//	Mậc định là private constructor
	SUNDAY("CN"),
	MONDAY("T2"),
	TUESDAY("T3"),
	WEDNESDAY("T4"),
	THURSDAY("T5"),
	FRIDAY("T6"),
	SATURDAY("T7");
	
	private String text;
	
	DayOfWeek(String text){
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

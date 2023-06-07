package datetime;

/*
 * KDL đối tượng, cho phép chứa các tập hợp các phần tử, thường là phần tử không đổi
 * VD: ErrorCode --> Internal, Success, NotFound
 * 	 : Status    --> Success, Fail, Sending
 * 
 */
public enum DayOfWeek {
	//DayofWeek MONDAY = new DayOfWeek();
	//Monday laf bieesn dong thoi cũng là giá trị của enum
	//Không thể khởi tạp thêm phần tử, giá trị mới cho enum bên ngoài
	//mặc định private cónstructor
	
	SUNDAY("Chu Nhat"), 
	MONDAY("Thu Hai"),
	TUESDAY("Thu Ba"), 
	WEDNESDAY("Thu Tư"), 
	THURDAY("Thu Nam"), 
	FRIDAY("Thu Sau"), 
	SATURDAY("Thu Bay"); 
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

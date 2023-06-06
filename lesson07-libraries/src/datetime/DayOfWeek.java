package datetime;

/*
 KDL đối tượng, cho phép chưa tập hợp các phần tử, thường là phần tử không đổi 
 VD: ErrorCode --> Internal, Success, NotFound
   : Status    -->  
 */
public enum DayOfWeek {
	SUNDAY("Chủ Nhật"),
	MONDAY("Thứ Hai"),
	TUESDAY("Thứ Ba"), 
	WEDNESDAY("Thứ Tư"),
	THURSDAY("Thứ Năm"), 
	FRIDAY("Thứ Sáu"), 
	SATURDAY("Thứ Bảy");
	
	private String text;
	
	DayOfWeek(String text){
		this.text = text;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

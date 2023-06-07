package datetime;
/**
 * KDL doi tuong, cho phep chua cac phan tu constant
 * vd: error code --> Internal , success, notfound
 * :status --> success, fail, sending
 * @author HP
 *
 */
public enum DayOfWeek {
	//DayOfWeek MONDAY = new DayOfWeek();
	//MONDAY la bien dong thoi cung la gia tri cua enum
	//khong the khoi tao them phan tu
	MONDAY("T2")
	,TUESDAY("T3")
	,WEDNESDAY("T4")
	,THURSDAY("T5")
	,FRIDAY("T6")
	,SATURDAY("T7")
	,SUNDAY("CN");
	
	private String text;
	
	private DayOfWeek(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}

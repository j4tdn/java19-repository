package datetime;
/*/
 * KDL doi tuong, cho phep chua tap hop cac phan tu, thuong la phan tu khong doi
 */
public enum DayOfWeek {
    //DayOfWeek MONDAY = new DayOfWeek();
	// MONDAY la bien, dong thoi cung la gia tri cua enum
	// Khong the khoi tao them phan tu, gia tri moi cho enum ben ngoafi
	// Mac dinh private constructor
	SUNDAY("Chu Nhat"),
	MONDAY("Thu hai"), 
	TUESDAY("Thu ba"), 
	WEDNESDAY("Thu tu"),
	THURSDAY("Thu nam"), 
	FRIDAY("Thu sau"), 
    SATURDAY("Thu bay");
	
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

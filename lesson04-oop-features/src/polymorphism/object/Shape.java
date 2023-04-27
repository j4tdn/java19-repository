package polymorphism.object;

public class Shape {

	// ? Đặt vấn đề
	/*
	 * 1. Thân hàm lớp cha thừa
	 * 2. Yêu cầu lớp con còn phải override lại chức năng
	 */
	
	
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	void calArea() {
		System.out.println("Shape --> calArea");
	};
	
	
}

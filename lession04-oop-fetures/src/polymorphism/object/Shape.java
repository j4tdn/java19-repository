package polymorphism.object;

	//Tính diện tích
	//

public class Shape {
	
	/*Vấn đề
	 * 1. Thân hàm trong lớp cha hơi thừa
	 * 2. Yêu cầu lớp con phải override lại chức năng lớp cha
	 *Tạo kiểu dữ liệu cha là interface
	 *Có thể chứa hàm
	 * 1. Không có phần body
	 * 2. Bắt buộc phải override lại kiểu dữ liệu con
	 *interface --> abstract method
	 * */
	
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	void calArea() {
		System.out.println("Shape --> calArea");
	};
}

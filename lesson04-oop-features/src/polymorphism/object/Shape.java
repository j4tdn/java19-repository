package polymorphism.object;

public class Shape {
	
	// Hàm chung(giao diện), có phần khai báo, nhưng chưa có thân hàm
	// Thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi(con)
	
	// Method: Hàm
	// declaration: phần khai báo
	// implementation(body): nội dung thân hàm
	
	// Vấn đề
	// 1. Thân hàm trong lớp cha hơi thừa
	// 2. Yêu cầu lớp còn phải override lại chức năng
	//    paint, calArea ở lớp cha
	
	// Tạo KDL cha là interface
	// Có thể chứa hàm
	// + không có phần body
	// + bắt buộc phải override ở KDL con
	// --> hàm trừu tượng --> abstract method
	// interface --> chứa abstract methods
	
	// Vẽ hình
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	// Tính diện tích
	// Chưa biết shape cụ thể để tính diện tích --> in tạm ra
	void calArea() {
		System.out.println("Shape --> calAre");
	}
}

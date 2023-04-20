package polymorphism.object;

public class Shape {
	//Hàm chung (giao diện), có phần khai báo, nhưng chưa có thân hàm
	//thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi (con)
	
	//Method: Hàm
	//declaration: phần khai báo
	//implementation: nội dung thân hàm
	//Vấn đề:
	//thân hàm trong lớp cha: thừa, 
	//ko yêu cầu lớp con override chức năng ở lớp cha
	//--> tạo KDL cha là interface
	//Có thể chứa hàm
	//+ không có thân hàm
	//+ bắt buộc override tại KDL con
	//--> hàm trừu tượng (abstract method)
	//interface --> chứa abstract method
	
	// Vẽ hình
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	//Hàm tính diện tích
	//chưa biết shape cụ thể --> in tạm
	void calArea() {
		System.out.println("Shape ---> calArea");
	}
}

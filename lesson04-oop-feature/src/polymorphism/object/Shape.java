package polymorphism.object;

public class Shape {
	//Hàm chung (giao diện), có phần khai báo, nhưng chưa có thân hàm
	//thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi (con)
	
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

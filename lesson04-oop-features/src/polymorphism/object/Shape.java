package polymorphism.object;

public class Shape {
	
	// Hàm chung(giao diện), có phần khai báo, nhưng chưa có thân hàm
	//Thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi(con)
	
	// Vẽ hình
	void paint() {
		System.out.println("Shape --> paint");
	}
	
	
	// Count S
	void calArea() {
		System.out.println("Shape --> calArea");
	}
	
	
}

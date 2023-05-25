package polymorphism.ojbect;

public class Shape {
	
	// hàm chung(giao diện) , có phần khai báo nhưng chưa có thân hàm
	
	//vẽ hình
	void paint () {
		System.out.println("Shape --> paint");
	}
	
	// hàm tính diện tích
	// chưa biết shape cụ thể để tính diện tích--> in tạm ra
	void calArea() {
		System.out.println("Shape---> calArea");
	}
}

package polymorphism.object;

public class Shape {
	// Có hàm chung(giao diện), khai báo, nhưng chưa có thân hàm
	// Thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi (con)
	void paint() {
		System.out.println("Shape -> paint");
	}

	void calArea() {
		System.out.println("Shape -> calArea");
	}
}

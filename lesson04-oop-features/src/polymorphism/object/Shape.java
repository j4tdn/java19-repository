package polymorphism.object;

public class Shape {
	// Hàm chung(giao diện), có phần khai báo, nhưng chưa có thân hàm
		// Thân hàm sẽ được định nghĩa cụ thể trong lớp thực thi(con)
		
		// Vẽ hình
		void paint() {
			System.out.println("Shape --> paint");
		}
		
		// Tính diện tích
		// Chưa biết shape cụ thể để tính diện tích --> in tạm ra
		void calArea() {
			System.out.println("Shape --> calArea");
		}

}

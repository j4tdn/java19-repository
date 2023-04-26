package inheritance.iinterface;

public interface Shape {
	// có thể thêm thuộc tính vào interface
	// yêu cầu
	// biến trong interface ngầm hiểu là final

	int length = 15;

	// abstract method: method without body
	void paint();

	void calArea();
}

package inheritance.iinterface;

public interface Shape {
	
	// có thể thêm thuộc tính vào interface 
	// yêu cầu 
	
	// ngầm định hiểu là final 
	//int length = 15;
	// abstract method
	
	// ngầm định là public abstract
	void paint();

	void calArea();
	
	default void clear() {
		System.out.println("shape -> clear all");
	}
}

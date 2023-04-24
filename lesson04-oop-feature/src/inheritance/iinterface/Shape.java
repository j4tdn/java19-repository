package inheritance.iinterface;

public interface Shape {
	//có thể thêm thuộc tính vào interface
	//yêu cầu
	//biến trong interface ngầm hiểu là final
	 
	int length = 15;
	
	//abstract method: method without body
	
	//ngầm định là public abstract
	void paint();
	
	void calArea();
	
	//default, static, private
	//add modifiers to allow method body
	
	default void clear() {
		System.out.println("shape --> clear all");
	}
	
	
}
